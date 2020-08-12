import java.awt.BorderLayout;
import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.html.MinimalHTMLWriter;

public class WillChatServer extends Thread{ 

	// GUI
	JFrame frm;
	JTextField tf;
	JTextArea ta;
	
	// 통신
	// 서버 소켓 생성
	ServerSocket serverSocket;
	// 클라이언트 통신을 위한 소켓

	Socket socket;
	
	// 데이터 입출력 스트림
	DataInputStream dis;
	DataOutputStream dos;
	
	// 통신 지속 여부 판단
	boolean stopSignal;
	
	public WillChatServer () {
		launchFrame();
	}
	
	// 화면 구현 
	public void launchFrame (){
		frm = new JFrame("채팅 서버");
		frm.setBounds(200,200,500,300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		ta = new JTextArea();
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setEditable(false); // 에디터에서 입력못하게
		frm.add(ta, BorderLayout.CENTER);
		
		// 메시지 전송창
		tf = new JTextField();
		frm.add(tf,BorderLayout.SOUTH);
		
		
		frm.setVisible(true);		
		
		// 입력창 포커스 
		tf.requestFocus();
		
		// 통신 서버의 역활 실행
		service();
		
	} // GUI
	
	// 서버의 역활 (통신 소켓)
	public void service() {
		ta.append("서비스 동작을 위한 서버 준비 \n");
		
		try {
			
			// 서버 소켓 생성 (5000) -> 서버 대기중...메시지 출력	
			serverSocket = new ServerSocket(5000);
			ta.append("서버 소켓 개방  : 클라이언트와 통신 준비 완료.. \n");
						
			// 연결 대기상태
		socket = serverSocket.accept();
		ta.append("클라이언트 접속 완료" + socket.getInetAddress() + "\n");
		
		// 데이터 입출력을 위한 스트림 생성
		dis = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());
		
		// 데이터 입출력 처리를 멀티 쓰레딩으로 처리
		Thread a = new Thread();
		

		// 연결 대기 상태
		
		
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	@Override
	public void run() {
		currentThread().checkAccess();
		 // 멀티 쓰레드 처리 : 클라이언트 메시지를 수신하면서 동시에 서버메시지를 전달
		 try {
			
			 while (!stopSignal) {  // 데이터를 문자형태로 가져올 수 있음 (스트링)
				 ta.append(socket.getInetAddress() + " : " +dis.readUTF() + "\n");
			 }
			 dis.close(); // while문 끝나면 자원해제?
			 
			} catch (IOException e) {
				
				e.printStackTrace();
			} 
		 }
	
	
	
	

	public static void main(String[] args) {
		new WillChatServer();
		

	}

}
