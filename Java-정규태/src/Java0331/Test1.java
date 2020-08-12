
public class Test1 {

	public static void main(String[] args) {

		// 연산자 
	
		// 1. 산술 연산자 ( + - * / % )
		
		// % -> 나머지 연산자
		
		
		System.out.println("10 + 20 = " + (10 + 20) );
		System.out.println("10 % 20 = " + (10 - 20) );
		System.out.println("10 % 20 = " + (10 * 20) );
		System.out.println("10 % 20 = " + (10 / 20) );
		System.out.println("10 % 20 = " +  (10 % 20) );
		
		// 과일 25개를 한상자에 5개씩 저장 가능한 상자를 사용해서 
		// 포장하려고 한다. 이때 필요한 상자의 개수는? 
		
		int sizeOfbox =25;
		int fruit =5;
		int total=sizeOfbox/fruit;
		System.out.println("상자의 개수 " + (25/5) + "개");
		System.out.println("상자의 개수 " + total + "개");
		
		int num = 458; 
		// 연산 
		// 400 출력 
		// 951, 622		
		int number = 458;
		int number2 = 951;
		int number3 = 622;
		
		System.out.println(622-22);
		System.out.println(458-58);
		System.out.println(900);
		System.out.println("\n");
		System.out.println(458/100*100);
		System.out.println(900/100*100);
		System.out.println(622/100*100);
		System.out.println("\n");
		System.out.println(458/100+ "00");
		System.out.println(900/100+ "00");
		System.out.println(622/100+ "00"); // 사기치기!

		System.out.println(4*100);
		
		
		
		
		num= 777;
		// -> 연산 -> 일의 자리만 1로 변경 
		
		System.out.println(num/10*10+1);
		
		
		// 2. 비교연산자
		// == != > < >= <=
		
		// * 비교연산의 결과는 항상 boolean 타입 (true, false)
		
		// A == b : A와 B가 같은가?
		// A != B : A와 B가 같지않은가?
		// A > B : A가 B보다 큰가?
		// A < B : A가 B보다 작은가?
		
		// [ >= ] (o) [=>] (x)
		// => '=' 대입연산자로 오른쪽의 데이터를 왼쪽으로 전달하는 역할
		// * 크기 비교를 하실때 항상 크기비교먼저 처리후 같은지 비교. 
		
		// 실수형 데이터 3.123, 2.111를 저장하는 변수를 생성 후 비교연산의 결과를 출력하시오
		
		double good = 3.123;
		double good2 = 2.111;
		System.out.println("\n");
		System.out.println(good == good2);
		System.out.println(good != good2);
		System.out.println(good > good2);
		System.out.println(good < good2);
		
		
		// 3. 대입연산자
		// A = B : 연산의 방향이 오른쪽에서 왼쪽으로 실행 
		// + 산술연산자 => 복합 대입 연산자
		// (+ - * / %) => += -= *= /= %= 
		
		/* 
		누적 연산  
		A += B <=> A = A + B
		A -= B <=> A = A - B
		A *= B <=> A = A * B
		A /= B <=> A = A / B
		A  % B <=> A = A % B

		*/
		int A = 10;
		
		System.out.println(A += 20);
		System.out.println(A += 20);
		System.out.println(A);
		
		// 4. 증감연산자 (단항연산자) 
		// ++A A++		--A A-- 
		// => 변수의 앞, 뒤에 붙어서 1증가, 1감소 연산
		A = 100;
		System.out.println("A : " + A);
		A++;
		System.out.println("A : " + A);
		++A;
		System.out.println("A : " + A);
		A = 100;
		System.out.println("A++ : "+ (A++) );
		System.out.println("A   : "+ A );
		System.out.println("++A : "+ (++A) );
	
		// ++A(전위 연산자), A++ (후위연산자) 
		// -> ++A 는 변수 A를 실행할 때 증가 / 감소,
		// A++는 변수 A를 사용하고 증가 / 감소 (문장의 끝+ (세미콜론)을 기준 처리 
		
		// A = 102
		// -> 증감연산자를 사용해서 100으로 출력 
		
		--A; // 101
		A--; // 101
		System.out.println("A:" + A);// 100
		A++; // 100
		--A; // 101->100
		++A; //101
		++A; // 102
		System.out.println((A++)); // 102
		System.out.println((A--)); // 103
		System.out.println((A)); // 102
		
		
		// 5. 논리연산자 
		// && (AND연산자) || (OR연산자) (바티컬바)  !(NOT 연산자) 
		// => boolean 타입의 데이터를 사용한 연산
		
		// A && B, A || B, !A, !B 
		
		// < 논리표 > 
		// A	B	&&	||	
		// T	T 	T	T
		// T	F	F	T
		// F	T	F	T
		// F	F   F	F
		boolean T = true;
		boolean F = false;
		
		System.out.println("&&(AND연산)은 둘다 참일때만 참의 결과" + "둘중에 하나라도 거짓이 있을경우 거짓의 결과를 발생");
		System.out.println("T && T = " + (T&&T ));
		System.out.println("T && F = " + (T&&F ));
		System.out.println("F && T = " + (F&&T ));
		System.out.println("F && F = " + (F&&F ));
		
		System.out.println("||(OR연산)은 둘중에 하나라도 참일경우 참의 결과" + "둘다 거짓일 경우 거짓의 결과를 발생");
		System.out.println("T || T = " + (T||T ));
		System.out.println("T || F = " + (T||F ));
		System.out.println("F || T = " + (F||T ));
		System.out.println("F || F = " + (F||F ));
		
		String name = null;
		System.out.println((4<2) && (name.length() == 4));
	//	System.out.println((4>2) && (name.length() == 4));
		// -> 실행 X. 에러발생
		
		// 논리 연산을 사용해서 효율적인 계산이 가능하다.
		
	// 비트 연산자 ( & | ^ ~ ) 
		
	// 6. 삼항 (조건) 연산자 
	// 조건식 ? 값1(참) : 값2(거짓) ; 
	
	System.out.println((100 > 200) ? "100이 크다" : "200이 크다");
	System.out.println((100 >= 200) ? "100이 크다" : "200이 크다");
	
	// 삼항 조건 연산자를 사용해서 양수 인지를 판별
	int data = -100;
	
	System.out.println((data >= 0) ? "양수" : "양수가 아니에욥");
	System.out.println((data <= 0) ? "음수" : "음수가 아니에욥");
	// -> 음수 인지 판별
	System.out.println("\n");
	data = -10; 
	System.out.println((data < 0) ? "음수" : "음수가 아니네요");
	
	// -> data 값이 '정수' 인지를 판별
	data = 10; 
	System.out.println((data > -1) ? "정수" : "음수네요 ~ 으!딜! ");
		
	
//	System.out.println((data > 0) ? "양수":"음수/0");
	//								   A				A	    B
 	System.out.println((data > 0) ? "양수":(data<0) ? "음수/0":"0");
	
 	
 	// 과일 107개, 상자에는 과일은 5개씩 저장 가능
 	// -> 이때 필요한 상자의 개수는?
 	// (단, 상자를 5개씩 채우고 남는 과일이 있을 경우 새로운 상자를 사용해서 담는다)
 	
	int sizeOfbox1 =5;
	int fruit1 =107;
	int total1=fruit1/sizeOfbox1;
	// System.out.println( (107 % 5 != 0) ? total : "음");
	int samhang = fruit1 % sizeOfbox;
	System.out.println( (samhang !=0) ? "":"" );
	System.out.println("상자의 개수 " + total1 + "개");

 	
	}
}
