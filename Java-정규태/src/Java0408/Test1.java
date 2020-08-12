
public class Test1 {

	public static void main(String[] args) {

		//
		// 1~10까지 for문 사용해서 가로 출력
		//

		for (int i = 0; i <= 10; i++) {
			System.out.println("for문");

		}


		// 1부터 10까지 while문 사용해서 출력
		int i = 0;
		while (i < 10) {
			System.out.println("while문");
			i++;
		}

		System.out.println("--------------------------------------");
		// 1~10까지 수중에서 홀수만 출력 (while)
		i=1;
		while (i < 10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("--------------------------------------");
		
		// while 반복문은 항상 조건문을 먼저 실행한다. 
		i=1;
		while (i++ <= 4) {
			System.out.println(i+ " ");
		}
		
		System.out.println("흠");
		 i = 2;
		while (i <= 5) {
			System.out.println(i + " ");
			i++;
		}
		
		
		// while문을 사용해서 1~10까지의 누적합
		
	i=1;
	int sum=0;
		while (i <= 10) {
			sum +=i;
			i++;
		}
		System.out.println(sum);
		System.out.println("--------------------------------------");
		
		
		////////////////////////////while문을 사용해서 1~10까지 짝수의 누적합
		sum=0;
		i=2;
		while (i <= 10) {
			sum +=i;
			i+=2;
			System.out.println("짝수의 합"+ sum);
		}
		System.out.println("--------------------------------------");
		
		i=2;
		sum = 0;
		while (i <= 10) {
			sum +=i;
			i+=2;
			System.out.println("짝수의 합2 = "+ sum);
		}
		System.out.println("--------------------------------------");
		i=0;
		sum = 0;
		while (i <= 8) {
			i+=2;
			sum +=i;
			
			System.out.println("짝수의 합3 = "+ sum);
		}
		
		// do-while() 문
		System.out.println("--------------------------------------");
		
//		초기식;
//		do {
//		반복할 코드;
//		증감식
//		}while(조건식) ;
//		
		
		i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=5);
		System.out.println("--------------------------------------");

		
		i=1;
		do {
			System.out.println(i+ " ");
			
		}while(i++ <=5);
		
		// 반복문의 경우 반복할 코드의 내용이 한줄일 경우 중괄호를 생략 가능
		
		for(int a=1; a<=5; a++) 
			System.out.println(a);
		
		System.out.println("--------------------------------------");
		i=0;
		while(i++ <=4);
		System.out.println(i);
		
		
		
		
	}
	

}
