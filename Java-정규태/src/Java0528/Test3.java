package Java0528;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import java.util.function.LongToIntFunction;

class 백터 {
	
}
public class Test3 {

	public static void showVector(Vector<Integer> 요소) {
		int sum = 0;


//		
//		System.out.println(요소.get(0));
//		System.out.println(요소.get(1));
//		System.out.println(요소.get(2));
		System.out.println(요소);


		System.out.println("개수 " + 요소.size());
		System.out.println("백터용량 " + 요소.capacity());
	
	}
	
	public static void main(String[] args) {

		// 백터 생성 ( 정수형 )

		// 5,4,-1 순서대로 입력
		// 요소의 정보 확인 - showVector() : 모든 요소의 정보,백터의 크기,용량 출력

		// 4,-1 사이에 100 값을 추가 입력
		// 요소의 정보확인

		// 백터의 모든 요소의 합을 계산해서 출력



		


		Vector<Integer> 요소 = new Vector<Integer>();
		
		요소.add(5);
		요소.add(4);
		요소.add(-1);
		요소.add(2, 100);
		
		showVector(요소);
	
		// 백터의 모든 요소의 합을 계산해서 출력
		int sum = 0;
		for (int s : 요소) {
			sum += s;
		}
		System.out.println("sum =" + sum);
		sum = 0;
		
		for (int i = 0; i < 요소.size(); i++) {
			sum += 요소.get(i);
			// sum += v.elementAt(i);
		}
		System.out.println("Sum = " + sum);

		//////////////////////////////////////////////////////////////////
		ArrayList<String> 이름 = new ArrayList<String> ();
	
		Scanner 이름입력 = new Scanner(System.in);
		
		int longIdx = 0;
		for (int i=0; i<=3; i++) {
			String name = 이름입력.nextLine();
			이름.add(name);
			
			
			System.out.println(이름.get(i).length()); // 사이즈
			
			
			if (이름.get(0).length() < 이름.get(i).length()) {
				System.out.println(이름.get(i) + "가 크네요");
				longIdx = i;
			}
		}
		System.out.println("가장 큰거" + 이름.get(longIdx));
		

		System.out.println(이름);
		
		
		}
		

		
	}


