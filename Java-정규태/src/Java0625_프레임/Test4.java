package Java0625_프레임;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

class FrameEx4 extends Frame implements ActionListener{
	// 관리자 계정
	private static final String ID = "admin";
	private static final String PW = "1234";
	
	
	
	Panel p1,p2,p3;
	TextField txtID,txtPW;
	Button logInBtn;
	
	public FrameEx4(){
	  super("이벤트 처리 v1.1");
	  
	  // 패널 컨테이너 객체 생성
	  p1 = new Panel();
	  p2 = new Panel();
	  p3 = new Panel();
	  
	  // 컴포넌트 객체 생성
	  txtID = new TextField(20);
	  txtPW = new TextField(20);
	  txtPW.setEchoChar('*');
	  
	  logInBtn = new Button("LogIn");
	  logInBtn.addActionListener(this);

	  // 프레임에 추가(위치 지정)
	  // 패널은 FlowLayout 사용(기본값)
	  p1.add(new Label(" I D "));
	  p1.add(txtID);
	  p2.add(new Label(" P W "));
	  p2.add(txtPW);
	  
	  p3.add(p1);
	  p3.add(p2);
	  
	  this.add(p3,BorderLayout.CENTER);
	  this.add(logInBtn,BorderLayout.EAST);
	  
	  // 아이디, 비밀번호를 입력후 -> 로그인 버튼 클릭시 
	  // 관리자 아이디,비밀번호와 같으면 "로그인성공 : admin"
	  // 아이디,비밀번호가 잘못된경우 -> 에러메세지 출력
	  

	  
	  
	  
	  
	  setSize(300,150);
	  setVisible(true);
	  
	  // 종료 버튼
	  addWindowListener(new WindowAdapter() {

		@Override
		public void windowClosing(WindowEvent e) {
			dispose();
			System.exit(0);
		}
		  
	  });
	  
	  
	  
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("로그인 이벤트 처리");
		
		  if (txtID.getText().equals(ID) && txtPW.getText().equals(PW)) {
			  System.out.println("로그인 성공!" + ID);
		  }else{
			  System.out.println("그런 아이디와 비밀번호는 확인되지 않습니다 " + txtID.getText() + " " + txtPW.getText());
		  JOptionPane.showConfirmDialog(this, "그런거 없음");
		 
		  }
		  
		
	}
	
}


public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new FrameEx4();
	}

}
