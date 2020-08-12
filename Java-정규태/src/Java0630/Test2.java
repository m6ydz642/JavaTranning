package Java0630;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEx2 extends Frame implements ActionListener {

	Canvas cv;
	// 메뉴바
	MenuBar mb;

	public FrameEx2() {

		cv = new Canvas();
		this.add(cv);
		cv.setBackground(Color.YELLOW);

		// 메뉴바 생성 객체
		mb = new MenuBar();
		this.setMenuBar(mb);

		// 메뉴 객체 추가
		Menu colorMenu = new Menu("Color");
		mb.add(colorMenu);
		
		Menu sizeMenu = new Menu("Size");
		mb.add(sizeMenu);

		// 뉴아이템
		MenuItem itm = new MenuItem("Red");
		colorMenu.add(itm);
		itm.addActionListener(this);
		MenuItem itm2 = new MenuItem("Green");
		colorMenu.add(itm2);
		itm.addActionListener(this);
		
		MenuItem itm3 = new MenuItem("Big");
		sizeMenu.add(itm2);
		itm.addActionListener(this);
		
		
		
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
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "Red") {
			System.out.println("레드선택");
			cv.setBackground(Color.red);
		}else if(e.getActionCommand() == "Green"){
			System.out.println("그린선택");
			cv.setBackground(Color.green);
		}
		
	}

}

public class Test2 {

	public static void main(String[] args) {

		new FrameEx2();

	}

}
