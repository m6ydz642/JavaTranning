package Java0529;

import java.util.Scanner;
import java.util.Vector;

public class Test2 {

	public static void main(String[] args) {
		
		Vector<Double> a = new Vector<Double>();
		
		Scanner scan = new Scanner(System.in);
		
		
		// 스캐너 사용해서 5개의 실수 데이터 입력
		// 백터 객체에 저장
		// => 모든 요소의 값 확인(확장된 for문)
		
		for (int i=0; i<5; i++) {
			a.add(scan.nextDouble());
		}
		for (double c: a ) {
			System.out.println(a);
		}


		double t = a.get(0);
		// 저장된 값중에서 가장 큰값을 찾아서 출력	
		for(int i=0; i<5; i++) {
		if (a.get(0) < a.get(i)){
			t = a.get(i); 
		}
		
		}
		System.out.println("가장 큰 값 : " + t);


		
		
	}

}
