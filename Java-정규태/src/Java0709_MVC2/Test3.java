package Java0709_MVC2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class FrameEx3 extends JFrame implements ActionListener{
	
	JButton btn;
	
	
	public FrameEx3(){
		btn = new JButton("대화상자 열기");
		add(btn);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 위치, 크기
		setBounds(300, 300, 150, 150);
		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
public class Test3 {

	public static void main(String[] args) {
	// Dialog 클래스 (대화 상자)
		new FrameEx3();

	}

}
