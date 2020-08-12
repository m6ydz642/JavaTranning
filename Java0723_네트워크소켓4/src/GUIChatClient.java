import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIChatClient  extends JFrame{
	
	// 화면정보-접속창
	JButton btn_connect; // 접속창 접속버튼
	JTextField txt_server_ip; // 아이피 입력창
	JTextField txt_name; // 접속할 이름(아이디)
	
	
	
	// 화면정보 - 채팅창
	JButton btn_exit; // 채팅창에서 종료버튼
	JButton btn_send; // 채팅창에서 보내기 버튼
	JTextArea  txt_list; // 메세지 출력되는 곳
	JTextField txt_input; // 입력메시지
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
