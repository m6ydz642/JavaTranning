package Java0409;


import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Company {

	public static void main(String[] args) {
		while (true) {
			System.out.println("�쉶�궗 �뾽臾� �봽濡쒖꽭�뒪 �엯�땲�떎 ");
			System.out.print("�떦�떊�쓽 �뻾�룞�쓣 �닽�옄濡� �엯�젰�븯�꽭�슂 : 紐곕씪�꽌 臾쇱뼱蹂몃떎(1),�븣�븘�꽌 �븳�떎 (2), 湲고�(3), �븯洹뱀긽(4) ");
			System.out.println(">>>>");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
		
			switch (input) {
			case 1:
				System.out.println("-----------------------");
				System.out.println("吏��궃踰덉뿉 �븣�젮以ъ옏�븘!");
				System.out.println("-----------------------");
				break;
			case 2:
				System.out.println("-----------------------");
				System.out.println("洹멸구 �솢 �땲 留덉쓬��濡� �빐?");
				System.out.println("-----------------------");
				// break; �궘�젣
			case 4:
				System.out.println("-----------------------");
				System.out.println("�눜�궗泥섎━ �릺�뿀�뒿�땲�떎");
				System.out.println("-----------------------");
				break; 
			default:
				System.out.println("-----------------------");
				System.out.println("�쉶�궗 吏ㅻ━怨� �떢�뼱!!!!!!?");
				System.out.println("-----------------------");
				break;
			}
		}
	}

}
