package Java0703;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

class MouseEventListener implements MouseMotionListener {

	JFrame jfm = null;
	public MouseEventListener() {
		// TODO Auto-generated constructor stub
	}
	
	public MouseEventListener(JFrame jfm) {
		this.jfm = jfm;
		System.out.println(this.jfm);
	}
	
	
	public MouseEventListener(Container contentPane) {
		
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println(e.getSource()); // 정보호확인용
		Container a = (Container)e.getSource();
		a.setBackground(Color.YELLOW);
		// jfm.setBackground(Color.YELLOW);
		System.out.println("마우스 드레그 됨 ");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		jfm.setBackground(Color.CYAN);
		System.out.println("걍 움직임");
		System.out.println(e.getSource());
	}
	
}

public class Test3 extends JFrame implements MouseListener {

	public Test3() {

		// 마우스 이벤트 리스너 
		addMouseListener(this);
	
		// 마우스 이벤트 리스너
		 MouseEventListener mel = new MouseEventListener(this); 
	// addMouseMotionListener(new MouseEventListener(this) ); // 이번엔 익명클래스로 안함, 프레임 정보 줘야됨, this로 가르킴 
		 addMouseMotionListener(mel);
		
		setTitle("프레임창 만들기");

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("이벤트 발생");
		getContentPane().setBackground(Color.ORANGE);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("이벤트 발생");
		getContentPane().setBackground(Color.WHITE);

	}

	public static void main(String[] args) {
		new Test3();

	}

}
