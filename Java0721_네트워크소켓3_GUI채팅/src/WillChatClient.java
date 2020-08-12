import java.awt.BorderLayout;
import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WillChatClient {
	
	// GUI
	JFrame frm;
	JTextField tf;
	JTextArea ta;
	
	String IP = "";
	
	// 소켓 통신
	Socket socket;
	
	DataInputStream dis;
	DataOutputStream dos;
	
	boolean stopSignal;
	
	public WillChatClient () {
		launchFrame();
	}
	
	// 화면 구현
	public void launchFrame (){
		frm = new JFrame("채팅 클라이언트 (1:1)");
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
		
		// 접속할 서버의 IP입력 - JOptionPane
		IP = JOptionPane.showInputDialog(frm, "접속할 서버 아이피 주소를 입력하세요");

		// ip주소가 null일 경우 - 종료(프로세스 종료)
	
		if (IP == null) System.exit(0); // 종료
		
		// IP주소가 "" 빈공백일 경우 - "localhost" 주소 지정
		IP = IP.trim(); // 기존의 데이터를 제외한 앞뒤 공백을 잘라줌 (공백 제거 해줌)
		if (IP.equals("") ) IP = "localhost";
			
			

		// 입력창 포커스 
		tf.requestFocus();
		
		
		// 통신 서버의 역활 실행
	service();
		
	} // GUI
	
	public void service() {
		try {
			socket = new Socket(IP,5000);
			
			ta.append(IP + "서버 접속 \n");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new WillChatClient();
	}

}
