package Java0630;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEx1 extends Frame implements ItemListener{
	
	//라디오버튼
	Checkbox ck1, ck2, ck3;
	// 그룹 
	CheckboxGroup cg;
	
	// 레이아웃 변경 -> Border -> Flow
	

	
	
	
	public FrameEx1(){
		setLayout(new FlowLayout());
		cg = new CheckboxGroup();
		
		ck1 = new Checkbox("RED", cg,false);
		ck2 = new Checkbox("Green", cg,false);	
		ck3 = new Checkbox("Blue", cg,false);
		
		// 프레임에 추가
		this.add(ck1);
		this.add(ck2);
		this.add(ck3);
		ck1.addItemListener(this);
		ck2.addItemListener(this);
		ck3.addItemListener(this);
		
		setSize(300,400);
		
		setVisible(true);
		
		// 종료버튼
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// 라디오버튼의 상태가 변경시 호출되는 메서드
		System.out.println();
		Color c = null;
		// e.getItem(); -> 라디오버튼에 적혀있는 글자
		// e.getSource(); -> 라디오버튼 객체
		if (e.getItem() == "RED") {
			System.out.println("RED");
//			this.setBackground(Color.red);
//			ck1.setBackground(Color.red);
//			ck2.setBackground(Color.red);
//			ck3.setBackground(Color.red);
			c = Color.red;
		
		} else if (e.getSource() == ck2) {
			System.out.println("GREEN");
//			this.setBackground(Color.green);
//			ck1.setBackground(Color.green);
//			ck2.setBackground(Color.green);
//			ck3.setBackground(Color.green);
//			
			c = Color.green;
		} else if (e.getSource() == ck3) {
			System.out.println("BLUE");
//			this.setBackground(Color.blue);
			c = Color.blue;
			
			this.setBackground(c);
			ck1.setBackground(c);ck2.setBackground(c);
			ck3.setBackground(c);
		}
	}

}
	
public class Test1 {

	public static void main(String[] args) {
        new FrameEx1();
	}

}
