
public class Test2 {

	public static void main(String[] args) {
		// 기본형타입 8가지 출력

		System.out.println("논리형-boolean-1byte");
		System.out.println("문자형-char-2byte");
		System.out.println("정수형-byte-1byte");
		System.out.println("정수형-short-2byte");
		System.out.println("정수형-int-4byte");
		System.out.println("정수형-long-8byte");
		System.out.println("실수형-float-4byte");
		System.out.println("실수형-double-8byte");

		// 논리형 데이터 타입 - boolean

		// 논리형 타입의 변수 TRUE 생성 => True라는 이름의 1byte(8bit) 저장공간이 만들어짐
		// -> 참, 거짓을 표현하는 데이터 타입. 소문자 true, false 사용
		// TURE, FALSE(x), 0,1(x)

		boolean TRUE = true;

		System.out.println("TRUE변수에 들어있는 값 : " + TRUE);

		boolean FALSE = false;

		System.out.println("FALSE변수에 들어있는 값 : " + FALSE);

		// 문자형 데이터 타입 - char
		// => 반드시 하나의 문자만 저장 가능 (16비트(2byte)의 유니코드 사용)
		// *char형은 기본적으로 정수형에 속한다. => 문자를 정수로 표현이 가능
		// ''사용하여 표현한다.
		// char charValue; => 변수 선언
		// char charValue = 'a'; 변수(상자)안에 있는 a값을 저장(담아, 대입하여) 사용하겠다.
		// char charValue = 'ab' = 에러 발생

		char charValue = 'a';
		System.out.println("문자형 데이터 값 : " + charValue);

		char charValue2 = 65;
		System.out.println("문자형 데이터 값 : " + charValue2);

		char charValue3 = 'a' + 10;
		System.out.println("문자형 데이터 값: " + charValue3);
		// 'a'는 정수값 , "a"는 문자열
		// = 는 대입이란 뜻 (오른쪽 값은 왼쪽에 담겠다)

		// 정수형 데이터 타입 - byte(-128~127), short(-32000~...), int, long
		// -> 소수점이 없는 정수를 표현하는 데이터 타입 (2/8/16진수 표현 가능)
		// * int 타입이 정수형타입의 기본형
		// * long 타입 데이터는 숫자 끝에 L/l 추가하여야 사용 가능

		// byte byteNum = -128;
		// -> 데이터타입의 범위를 벗어난 경우(over flow) 항상 기본형타입 (int)으로 처리
		byte byteNum = -128;
		System.out.println("byte타입의 값: " + byteNum);
		short shortNum = -32000;
		System.out.println("short타입의 값 " + shortNum);
		int intNum = 1000000000;
		System.out.println("int타입의 값 " + intNum);
		long longNum1 = 1000000000;
		System.out.println("long타입의 값 " + longNum1);
		long longNum2 = 10000000000L;
		System.out.println("long타입의 값 " + longNum2);

		// 실수형 데이터 타입 - float, double
		// -> 소수점 이하가 있는 데이터 타입
		// double타입이 기본형
		// float 타입의 데이터 값은 f,F를 붙여서 사용
		// double 타입 데이터 값에 d,D를 붙여서 사용해도 되고 생략도 가능

		float Float1 = 3;
		System.out.println("float타입의 값 " + Float1);
		float Float2 = 3.111111111f;
		System.out.println("float타입의 값 " + Float2);
		double Double1 = 3.1111111111111111111;
		System.out.println("double타입의 값" + Double1);
		double Double2 = 3.1111111111111111111D;
		System.out.println("double타입의 값" + Double2);

		System.out.println("-------------------------------");
		System.out.println("문자형 리터럴 (유니코드 사용)");
		char chValue = '\uBDC1';
		System.out.println("값 : " + chValue);
		// 유니코드로는 여러개의 글자로 살수 있다
		char chValue0 = '\uAE40';
		char chVAlue0 = '\uC9C4';
		char chVALue0 = '\uC601';
		System.out.println(chValue0);
		System.out.println(chVAlue0);
		System.out.println(chVALue0);

		// \n 줄바꿈 \t 여백생성(tab)
		System.out.println("안녕하세요 \n자바시간\t입니다.");

		// char chValue20='\';
		char chValue20 = '\\';
		System.out.println("이스케이프 문자 사용 " + chValue20);

		// 자바 설치 경로를 찾아서 출력하시오
		System.out.println("C:\\Program Files\\Java\\jdk1.8.0_121\\bin\\java.exe");

		// 정수형 리터럴
		// 234(10) / 030(8) / 0xA4(16) / 0b1010(2진수)

		// 상수 : 값(리터럴)을 변경하지 못하는 변수
		// 선언
		// final [타입] [상수명(암묵적으로 모두 대문자로 만든다)] = 초기값;
		// char, int, double 상수 생성

		char CHAR = 'a';
		CHAR = 75;
		// 값을 a에서 g로 바꿈 final이 없을 때는 변수기 때문에 바뀜.
		// char CHAR = 75로 선언문 내 'a'를 75로 바꾸는 것은 데이터를 바꾸는 것x 값을 초기화 후 다시 대입한 것.
		System.out.println(CHAR);
		final int INT = 23;
		// int = 42 (x)
		System.out.println(INT);
		final double DOUBLE = 12.3125156612312312313;
		System.out.println(DOUBLE);

		//변수의 사용
		// 1. 변수 선언
		// 2. 변수 초기화
		// 3. 변수 사용(값을 변경)
		
		int num=100;
		//100이라는 리터럴 값을 num에 저장해 둔 코드
		// 1. 변수 선언
		// int num;
		// 2. 변수 초기화(왼쪽은 초기화 , 엄밀히 말하면 오른쪽은 1.+2.)
		// num = 100; / int num = 100;
		// 3. 사용
		// -> 변수의 이름을 호출(사용(해당코드의 이름을 사용))한다
		System.out.println(num);
		// 3-1. 재사용 (덮어쓰기)
		num=200;
		// * int num = 200; 은 에러가 난다. 
		// 변수를 선언과 초기화를 동시에 하는 것으로 앞에 동일한 변수명이 없어야 한다.
		// C 언어에서는 재사용을 할 경우 쓰레기 값이 나온다. JAVA는 덮어쓰기 할 경우 100을 못쓴다.
		// 메모리 할당 관계 등 처리 되는 로직을 공부하자
		// * 스케쥴링에 대해서,, 
		
		// int a; 
		// System.out.println(a); 
		// * 참조형 변수 - String / "값" / 저장공간 4byte
		//stack 에 변수를 만들고 heap에 쓰인 값을 stack에 있는 변수가 heap에 있는 값을 찾아 담아간다? (책장에서 책을 꺼내와서 책상에 쓰는 것)
		// 기본형은 stack에 변수에 그안에 값이 저장됨 (책상에서 바로 꺼내는거)
		
		// 						/ 기본형 타입 형변환
		// 데이터 타입 변환 (형변환) 
		//						\ 참조형 타입 형변환
		
		// * 기본형 타입 형변환
		// 1. 묵시적 형변환(자동 형변환)
		//  : 필요한 메모리의 크기가 작은 데이터 타입에서 큰 데이터 타입으로 이동 할 때 발생
		
		byte b = 10;
		int i = b; // 묵시적 형변환 발생(byte(1) -> int(4))
		System.out.println(i);
		
		// 2. 명시적 형변환(강제 형변환)
		//  : 필요한 메모리의 크기가 큰곳에서 작은곳으로 이동할 때 발생
		
		int i2 = 100000000;
		byte b2 =(byte) i2;
		System.out.println(b2);
		
		
		// 연산시 데이터 형변환
		// -> 기본형 타입의 데이터보다 적은 메모리를 사용하는 타입의 경우
		// 연산시 메모리 오버플로우 (넘침)로 인한 계산 오류가 발생할 수 있음
		// 그래서 기본형 타입 int 로 바꿔서 처리 한다. 
		// -> 형변환은 연산이 끝난후에 처리 해야 함.

		
		short s1 = 10;
		short s2 = 20;
		// short s3 = (short)s1 + (short)s2; // int 기본형 (x)
		// short s3 = (short)(s1 + s2); // int 기본형 (o)
		int s3 = s1+s2; // int 기본형
		
		int a = 8 / 3;
		System.out.println("나누기 몫결과 " + a);
		
		// -> 2.666666
		
		// -> 정수형 / 정수형 -> 정수형 
		double b1 = (double)8/(double)3;
		// -> 실수형 / 실수형 -> 실수형 
		double b21=  8/3d;
		
		System.out.println(b1);
		
		System.out.println(12345+5432l);
		
		
		
		
		
		
		
		
		
	}

}
