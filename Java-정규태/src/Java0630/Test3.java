package Java0630;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEx3 extends Frame implements KeyListener{
	TextField tf;
	TextArea ta;
	
	
	
	public FrameEx3() {
		tf = new TextField();
		this.add(tf, BorderLayout.SOUTH);
		tf.addKeyListener(this);
		tf.addKeyListener(new KeyAdapter() {// 익명클래스

			
			@Override
			public void keyReleased(KeyEvent e) {
			//	System.out.println(e.getKeyChar() + "키");
			
				
				
				System.out.println(e.getKeyCode() + "키 이벤트");
				System.out.println(KeyEvent.VK_CONTROL);
				if (e.getKeyCode() == KeyEvent.VK_UP)
				{
					System.out.println("컨트롤키 입력");
					ta.setBackground(Color.RED);
				}else if (e.getKeyCode() == KeyEvent.VK_UP) {
					ta.setBackground(Color.RED);
				}
				else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					ta.setBackground(Color.WHITE);
				}
				else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					ta.setBackground(Color.green);
				}
				else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					ta.setBackground(Color.BLUE);
				}
				

			
				
			} 
			
			
		});
		
		
		
		ta = new TextArea();
		this.add(ta, BorderLayout.CENTER);
		
		setTitle("입력 처리 이벤트");
		
		setSize(400, 400);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// System.out.println("키타입 호출1");
		ta.append(e.getKeyChar() + "키 호출 \n");
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// System.out.println("키프레스호출2");
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// 가능하면 키보드 입력 처리 이벤트처리에서 사용
		//System.out.println("keyReleased()....");
		// System.out.println("릴리즈호출3");
		ta.append(e.getKeyChar() + " key릴리즈 \n") ;
	}
	
	
	
}
public class Test3 {

	public static void main(String[] args) {
		new FrameEx3();
		
	}

}
