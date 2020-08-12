import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;

// 클라이언트 접속을 유지하면서, 데이터 송수신
// 클라이언트가 서버에 접속할때 마다 해당 객체 생성

public class ChatServerThread implements Runnable {

	// 클라이언트와 통신하는 소켓
	Socket child;
	// 데이터 송/수신 객체
	ObjectOutputStream oos;
	ObjectInputStream ois;
	String user_id;

	// 쓰레드간의 데이터를 공유
	HashMap<String, ObjectOutputStream> hm;
	// 객체 생성시 소켓정보, 해쉬 맵 정보를 가져오기

	public ChatServerThread() {
		// TODO Auto-generated constructor stub
	}

	public ChatServerThread(Socket s, HashMap<String, ObjectOutputStream> hm) throws ClassNotFoundException {
		// 클라이언트 접속 ip주소를 출력 (서버 확인용)
		child = s;
		this.hm = hm;
		System.out.println(child.getInetAddress() + "로부터 연결 요청 받음!! ");

		// 데이터 송수신을 위한 스트림 객체 생성
		try {
			ois = new ObjectInputStream(child.getInputStream());
			oos = new ObjectOutputStream(child.getOutputStream());

			// 사용자의 아이디 정보를 가져와서 출력
			// 클라이언트가 가장 먼저 보내는 데이터가 아이디 값

			user_id = (String) ois.readObject();
			// 서버에 접속되어 있는 모든 클라이언트에게 전달 (브로드캐스트)
			// "XX" 님이 접속 하셨습니다.

			// 서버 확인용 출력
			System.out.println("접속한 클라이언트 아이디 : " + user_id);
			// 여러 클라이언트에게 공유되는 데이터를 동기화 처리
			// 서버가 접속하는 클라이언트 정보를 저장하는 공간 HashMap을 동기화

			synchronized (hm) { // 동기화
				// 해쉬맵에 아이디/출력스트림 저장
				// 모든 접속된 클라이언트가 공유해야하는 값이기 때문에 동기화처리가 필요하다
				hm.put(this.user_id, oos);
			}

		} catch (IOException e) {
			System.out.println("");
			e.printStackTrace();
		}

	}

	// 클라이언트가 보내는 모든 메세지를 받아서 전달

	@Override
	public void run() {
		String reciveData;
		try {
			// 클라이언트로부터 메시지 수신
			while (true) {
				reciveData = (String) ois.readObject();
				// 받은 메시지를 모든 클라이언트한테 전달 (브로드캐스트)
				
				
			}

		} catch (Exception e) {
			System.out.println("클라이언트 요청 종료(강제종료) " + e);

		}finally {
			// 사용자 종료시 hm저장된 정보를 제거
			synchronized (hm) { // 동기화
				hm.remove(user_id);				
			}
			// 사용자가 채팅방에서 나간 사실을 알려주기 (브로드캐스트)
			
			// 서버에서 확인용
			System.out.println(user_id + "님이 퇴장하셨습니다");
			
			if (child != null) { // 자원해제
				try {
					child.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			
		} // finally

	} // run
	
	// broadcast : 방송 : 메시지를 전달받아서 모든 클라이언트에 채팅방에 전달 
	public void broadcast (String message) {
		// 사용자의 정보를 저장하는 HashMap 동기화 해서
		// 출력정보를 사용해서 메시지 전달
		
		synchronized (hm) {
			// 해쉬맵에 저장된 모든 출력스트림을 사용해서 
			// 메세지를 전달
			// 
		
			for (ObjectOutputStream oos :hm.values()) {
				try {
					oos.writeObject(message);
					oos.flush();
					
				} catch (IOException e) {
					System.out.println("broadcast예외 발생 " + e);
					e.printStackTrace();
				}
				
				
			}
		
		}
		
		
		
		 
	}

}
