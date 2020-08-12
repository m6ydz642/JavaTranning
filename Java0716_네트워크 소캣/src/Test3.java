import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Test3 {

	public static void main(String[] args) {
		// 소캣 프로그래밍 (서버)
		
		// 서버 소캣 객체를 생성 (포트번호를 생성)
		try {
			ServerSocket server = new ServerSocket(5000);
			while(true) {
				Socket  socket = server.accept(); // 클라이언트의 접속을 대기

				System.out.println("서버요청 대기중...");
				System.out.println(socket.getInetAddress());
				
				
			
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
