package Java0625_프레임;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test3 extends Frame {

	public Test3() {
		// Listener : 리스너 인터페이스 
		// ~ Adapter : 어댑터 클래스  
		// -> 리스너 인터페이스의 단점을 보완하기 위해서 생성된 객체 -> 어댑터 클래스 

		// 단점 : 인터페이스이기 때문에 가지고 있는 모든 (사용유무 상관없음) 추상메서드를 
		// 구현해야함.
		// -> 어댑터 클래스(추상클래스) 리스너 인터페이스를 상속해서 모든 추상메서드를 동작없이 구현한 상태
		// -> 사용자의 필요에 따라서 직접 구현해서 사용 가능 
		
		// * 추상클래스, 인터페이스-> 익명클래스로 구현가능
		// 
		
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	public static void main(String[] args) {

	}

}
