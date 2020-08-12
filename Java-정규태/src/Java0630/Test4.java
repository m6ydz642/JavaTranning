package Java0630;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEx4 extends Frame implements MouseListener, MouseMotionListener {
	
	Label info;
	
		
	public FrameEx4() {
		info = new Label("Location");
		info.setBackground(Color.yellow);
		add(info, BorderLayout.NORTH);
		
		setTitle("입력 처리 이벤트");
		
		setSize(400, 400);
		setVisible(true);
		
		this.addMouseListener(this); //마우스 리스너를 가르킴
		// 여기서 this는 프레임을 가르킴
		
		this.addMouseMotionListener(this);
	
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("click실행");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Pressed실행");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Released실행");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Entered실행");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Exited실행");
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouseDragged() 실행");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("mouseMoved() 실행");
		e.getX();
		e.getY();
		info.setText("(x,y)=("+e.getX()+","+e.getY()+")");
		System.out.println("");
		
		
		if(100<=e.getX() && e.getX()<=150){
			System.exit(0);
		}
		
		
	}
	


	
}

public class Test4 {

	public static void main(String[] args) {
		new FrameEx4();
	}

}
