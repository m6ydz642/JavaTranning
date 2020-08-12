import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		int i;
		int j;

		i = 20;
		j = 30;

		System.out.println(i + j);
		int key = 2;
		switch (key) {
		case 1:
			System.out.println("옵션1");
		case 2:
			System.out.println("옵션1");
		case 3:
			System.out.println("옵션1");
			break;
		default:
			System.out.println("옵션1");

		}

		// 키보드 입력 (Scanner) 사용해서 정수 2개를 입력
		// 두 정수의 합을 출력하는 코드를 작성
		Scanner scan = new Scanner(System.in);
		// int a;
		// int b;
		// System.out.println("입력하세요 : ");
		// int a= scan.nextInt();
		// int b= scan.nextInt();
		// int sum;
		//
		// System.out.println("합 : " + (a+b));
		//
		// 2차원평명에 하나의 직사각형을 좌표로 표시한다. (50,50) (100,100) 좌표로 구성된
		// 직사각형이다. 이때, 2개의 정수값 x, y를 입력받아서 해당 좌표(x,y)가
		// 직사각형안에 존재하는지 아닌지를 판별
		//
		// System.out.println("좌표를 입력하시와요 : ");
		// int x= scan.nextInt();
		// int y= scan.nextInt();
		//
		// //if (x >= 50 && y <=100) {
		// if((50 <= x && x <=100) && (50<=y && y <= 100)) {
		// System.out.printf("%d, %d는 50,50 100,100 의 사각형 안에 포함된다",x, y);
		// }else{
		// System.out.printf("%d, %d는 50,50 100,100 의 사각형 안에 포함 안된다",x, y);
		//
		// }

		// 키보드 입력을 통해서 참, 거짓의 값, 논리연산("AND","OR")을 입력
		// 논리 연산을 진행하려고 할때 해당 동작을 구현하시오.
		// -> true true "AND" = true
		// -> false true "OR" = true
		// * switch-case

//		System.out.println("값을 입력하세용 : true or false + 논리연산 : ");
//
//		boolean bool1 = scan.nextBoolean();
//		boolean bool2 = scan.nextBoolean();
//
//		System.out.println("입력 값" + bool1 + bool2);
//
//		// String op = scan.nextLine (); // 엔터키를 문자로 입력
//		String op = scan.next(); // 엔터키를 단순 입력 동작으로 처리

		// 입력된 데이터를 사용해서 논리 연산 실행

//		switch (op) {
//		case "and":
//		case "AND":
//			System.out.println(bool1 + " && " + bool2 + " = " + (bool1 && bool2));
//			break;
//		case "OR":
//		case "or":
//			System.out.println(bool1 + " || " + bool2 + " = " + (bool1 || bool2));
//			break;
//
//		default:
//			System.out.println("처리가능한연산이 없음");
//			break;
//		}
	// ------------------------------------------------------------------------------------------------

		// 정수데이터 입력 (돈), 입력받은 돈을 각각의 단위로 바꿔서 출력
		// 5만원, 1만원, 5천원권, 1천원권, 500원, 100원, 10원, 1원
		
		// -> 65245원 (금액 반환 조건 : 항상 상위권종에 대해서 처리가 끝난후 다음으로 처리)
		
		
		
		
		/////////////// 이건 망작 
		System.out.println("돈을 입력하세요 : ");
		int input = scan.nextInt(); 
		int sum=0;
		int money = input / 50000;
		System.out.println("5만원권 : " + money + "개");
		int result = money % 50000;
		System.out.println("1만원권 : " + result + "개");
		System.out.println("5천원권 : " + money / 5000 + "개");
		System.out.println("1천원 : " + money / 1000 + "개");
		System.out.println("5백원 : " + money / 500 + "개");
		System.out.println("1백원 : " + money / 100+ "개");
		System.out.println("1십원 : " + money / 10 + "개");
		System.out.println("1원 : " + money / 1 + "개");
		// 빼기?
		// 5만원이상이면 5만원권?
		
		
	}


}
