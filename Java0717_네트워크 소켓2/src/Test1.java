import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;



public class Test1 {
	// 
	ServerSocket server_tomcat; // 서버 소켓
	Socket child; // 클라이언트 소켓
	
	// 입력 스트림 객체, 대화방 용도
	InputStream is; 
	ObjectInputStream ois;
	
	// 출력 스트림 객체 
	OutputStream os;
	ObjectOutputStream oos;
	
	// 클라이언트가 전달한 메세지 
	String receiveMSG;
	
	
	public Test1() { // 기본생성자
		// 1. 에코서버를 생성(포트)
		try {
			server_tomcat = new ServerSocket(5000);
			System.out.println("에코서버 생성 완료!");
			System.out.println("서버는 클라이언트 요청을 대기중");
			// 2. 클라이언트 요청을 대기하도록 메서드 호출
			// 클라이언트 요청을 대기하다가 요청이 없으면 계속해서 대기상태
			// 클라이언트 요청 (접속) -> 클라이언트와 통신할 수 있는 소켓을 리턴
			
			
			child = server_tomcat.accept(); // 요청을 한번 받으면 끝나버림
		
			// 3. 접속한 클라이언트의 ip주소 출력
			System.out.println(child.getInetAddress() + "연결요청 ~");
			
			// 4. 클라이언트가 전달한 데이터를 읽기 위해서 입력스트림 객체 
			is = child.getInputStream();
			
			// 4-1. ObjectInputStream으로 변환 
			ois = new ObjectInputStream(is);
			
			// 5. 클라이언트로 부터 전달받은 데이터를 다시 전송 출력 스트림 객체
			os = child.getOutputStream();
			
			// 5-1	ObjectOutputStream으로 변환 
			oos = new ObjectOutputStream(os);
			
			
			
			
			// 4-2 클라이언트 (소켓) 전달된 정보를 읽어서 출력 
			while (	(receiveMSG = (String)ois.readObject()) != null ) {
				
				System.out.println("전달된 MSG : " + receiveMSG);
				
				
				// 5-2. 입력받은 데이터를 그대로 전달(에코) 
				oos.writeObject(receiveMSG);
				oos.flush(); 
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	
		// TCP를 사용한 에코 서버
		// (1)서버 소켓(포트)이 생성(준비) - accept()
		// (2)클라이언트 소켓 생성(서버IP,포트)
		// (3)소켓 리턴을 받아서 클라이언트와 통신
		new Test1(); // 객체 호출:

		
		

	
		
	}

}
