package Java0709_MVC2;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEx2 extends Frame{
	
	CardLayout card = null;
	Panel[] p;
	Color[] color = {Color.RED, Color.BLUE, Color.CYAN, Color.PINK, Color.ORANGE};
	
	public FrameEx2(){
		// 제목 
		// 레이아웃 설정
		card = new CardLayout();
		setLayout(card);
		
		// 패널 5개 생성
		p = new Panel[5];
		
			
			
	
		for (int i = 0; i < 5; i++) {
			p[i] = new Panel();
			p[i].setBackground(color[i]);
			
			p[i].addMouseListener(new MouseAdapter() {

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mouseClicked(e);
				}
			});
			add(i + " " ,p[i]);
		}

		setSize(300, 400);
		setLocation(800, 600);
		setVisible(true);
		// 종료버튼
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
	} // 생성자 
	
} // 프레임 마지막

public class Test2 {

	public static void main(String[] args) {
		// 카드 레이아웃 (CardLayout)
		new FrameEx2();

	}

}
