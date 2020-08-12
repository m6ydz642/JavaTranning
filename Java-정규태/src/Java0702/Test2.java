package Java0702;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

class FrameEx2 extends JFrame {

	JProgressBar pro;

	public FrameEx2() throws InterruptedException {
		setTitle("스윙 연습하기");
		// 프로그래스바 : 작업 진행도를 표현하기 위한 컴포넌트
		JButton startBtn;
		JButton stopBtn;
		setLayout(new FlowLayout());

		pro = new JProgressBar(0, 100);
		pro.setStringPainted(true);

		//
		// for (int i =0; i<=100; i++) {
		// Thread.sleep(1000);
		// pro.setValue(0);
		// }

		pro.setValue(0);

		startBtn = new JButton("설치시작");

		startBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // 익명클래스 안에 넣으니 제대로 안됨
//				proStart();
			}
		});
		
		stopBtn = new JButton("설치중단");
		stopBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pro.setValue(0);
				
			}
		});
		
		add(pro);
		add(startBtn);
		
		add(stopBtn);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setSize(400, 200);
		setVisible(true);
		
		proStart();

		}
		
	public void proStart() {
		for (int i = 0; i <= 100; i++) {
			try {
				Thread.sleep(2000);
				pro.setValue(i);
				System.out.println(i);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}

		}
	}
	
	public void proStop() {
		for (int i = 0; i <= 100; i++) {
			try {
				Thread.sleep(2000);
				pro.setValue(i);
				System.out.println(i);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}

		}
	}

}

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		new FrameEx2();
		Thread a = new Thread();
		a.start();

	}

}
