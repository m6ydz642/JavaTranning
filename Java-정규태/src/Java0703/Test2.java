package Java0703;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FrameEx2 extends JFrame{
	
	JLabel la;
	
	public FrameEx2 () {
		setLayout(new FlowLayout());
		
		la = new JLabel("안녕하세요. 자바!");
		this.add(la);
		
		// 마우스 휠 이벤트 처리
		
		// this.addMouseWheelListener(new MouseWheelListener() { 프레임 전체에서 나는 이벤트
		 la.addMouseWheelListener(new MouseWheelListener() { // 라벨에서 이벤트 발생하는걸 프레임 전체로 바꿈
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				System.out.println(e.getWheelRotation());
				
				if (e.getWheelRotation () < 0){
					System.out.println("휠 위로");
					
					 JLabel jla = (JLabel) e.getSource(); // 이벤트가 발생한 대상의 객체 가져옴, 형변환 
					// JLabel jla = la;
					jla.getFont();
					
					Font f = jla.getFont(); // 라벨의 폰트정보를 저장
					int size = f.getSize();
					
				
					
					if (size <= 5) return;
					la.setFont(new Font("궁서체", Font.PLAIN, size-5));
				}else{
					JLabel jla = (JLabel) e.getSource(); // 이벤트가 발생한 대상의 객체 가져옴, 형변환 
					jla.getFont();
					
					Font f = jla.getFont(); // 라벨의 폰트정보를 저장
					int size = f.getSize();
					System.out.println("휠 아래로");
					la.setFont(new Font("궁서체", Font.PLAIN, size+5));
				}
				
				
			}
		});
		
		 this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				try {
					
				
				JLabel jla = la; // 프레임, getSource 으로 처리안되서 라벨정보를  가져옴   

				Font f = jla.getFont(); // 라벨의 폰트정보를 저장
				int size = f.getSize();
				
			//	System.out.println(e);
				
				
				switch (e.getKeyChar()) {
				case '+':
					System.out.println("+ 입력");
					la.setFont(new Font("궁서체", Font.PLAIN, size+5));
					break;
				case '-':
					la.setFont(new Font("궁서체", Font.PLAIN, size-5));
				default:
					break;
				}
				
				} catch (Exception e2) {
					System.out.println("예외가 생겼엉" + e);
				}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		setTitle("마우스 휠");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500, 400, 400, 200);
		setVisible(true);
	}
}
public class Test2 {

	public static void main(String[] args) {
		new FrameEx2();
	}

}
