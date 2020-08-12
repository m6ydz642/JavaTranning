package Java0626_프레임2;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;

class TestFrameEx2 extends Frame implements ItemListener {
	
	TextArea ta;
	Checkbox ck1,ck2,ck3;
	
	Panel p;
	
	public TestFrameEx2(){
		
		setTitle("체크박스 사용하기");
		
		p = new Panel();
		
		ta = new TextArea();
		ck1 = new Checkbox("RED");
		ck2 = new Checkbox("GREEN");
		ck3 = new Checkbox("BLUE");
		
		ck3.addItemListener(this); 
		ck2.addItemListener(this); 
		ck1.addItemListener(this);
		
		this.add(ta);
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		this.add(p,BorderLayout.NORTH);	
		
		
		setSize(400,300);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
	}// 생성자

	@Override
	public void itemStateChanged(ItemEvent e) {
	
			System.out.println("클릭");
			 // System.out.println(e.getSource()); // 이벤트 발생한 소스를 가져옴 
			// System.out.println(e.toString());
			//System.out.println(e.getItem());
			// ta에 해당 버튼 클릭  "RED선택 클릭"
			// 			"			"RED해제 클릭"
			
		//	ta.append("레드");
			
	/*	 if (ck1 == e.getSource()) {
			 ta.append("레드");
			 ta.append(" ");
			 System.out.println(e.getStateChange());
			 }
		 
		 if (ck2 == e.getSource()) {
			 ta.append("블루");
			 }
		 if (ck3 == e.getSource()) {
			 ta.append("그린");
			 }*/

			// 위 코드 더 짧게
			//
		String str = "해제";
		if (e.getStateChange() == ItemEvent.SELECTED) {
			str = "선택";
			ta.append(e.getItem() + str + "\n");
			
			if (e.getItem() == "RED") {
				ta.setBackground(Color.RED);
				System.out.println(ck1 + "선택");
			}
			if (e.getItem() == "BLUE") {
				ta.setBackground(Color.BLUE);
				System.out.println(ck2 + "선택");
			}
			if (e.getItem() == "GREEN") {
				ta.setBackground(Color.GREEN);
				System.out.println(ck3 + "선택");
			}
			
			
			System.out.println(str);
		} else {
			System.out.println(str);
			ta.append(e.getItem() + str + "\n");
			ta.setBackground(Color.WHITE);
			
		}
		
		
	}

	
}



public class Test2 {

	public static void main(String[] args) {

        new TestFrameEx2();
	}

}
