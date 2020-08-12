package Java0709_MVC2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

class FrameEx1 extends Frame{
	
	
	@Override
	public void paint(Graphics g) {
		
		g.drawString("Hello~", 100, 50);		
		// 글자 폰트 변경
		Font f = new Font("궁서체",Font.BOLD, 35);

		// 폰트 적용
		g.setFont(f);
		
		// 컬러 변경
		g.setColor(Color.red);
		g.drawString("test", 200, 100);
		
		
		// 또는
		
		
		Color c = new Color(24,100,23);
		
		g.setColor(c);
		g.drawString("color", 200, 150);
		g.drawRect(50, 50, 50, 50);
		
		
		
	}

	public FrameEx1(){
		
		// setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,300);
		setLocation(200, 150);
		setVisible(true);
		
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		// 그래픽 객체 
		new FrameEx1();
	}

}
