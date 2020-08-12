package Java0521;

import java.sql.Connection;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/* 예외 처리  try ~ catch (+ finally) try ~ with*/
		
		try {
			// 예외가 발생할 수 있는 코드
			
		} catch (Exception e) {
			// 예외를 처리하는 코드 작성
			
		}
		/* Throwable 	(최상위 객체)
		* /				\
Exception(실행시 예외)	Error (컴파일 에러)
		 * 
		 * */
///////////////////////////////////////////////////////////////////
		int a = 10, b1 = 0, b2 = 2, c = 10;
		System.out.println("A : " + a);
		
		try {
			// 예외가 발생할 수 있는 코드
		
			System.out.println("C : " + c);
			c = a / b2;
			System.out.println("예외코드 C : " + c);
			c = a / b1; // 0으로 나누는 예외 발생
			System.out.println(" C : " + c);

		} catch (Exception e) {
			// 예외를 처리하는 코드 작성
			System.out.println("코드 예외 발생");
			c = a / b2;
			System.out.println("예외 내용 C : " + c);
			System.out.println("예외 정보 " + e);
		}

	
		System.out.println("여기까지 도착시 정상 종료됨 c : " + c);
		
		System.out.println("--------------------------------------------------------");
// 중복 catch
		
		
		Scanner s = null;
		try {
			System.out.println("try구문 실행"); 
			int aa = 5 / 0 ;
			
			s = new Scanner(System.in);
			
		} catch (ArithmeticException e) {
				System.out.println("수학적 예외 발생" + e);
			}catch (Exception e) { // 모든 상황에 대한 처리가 가능하다 
				/* 모든 예외 객체는 Exception 객체를 상속하고 있다. 
				 그러므로 모든 타입의 예외는 Exception 타입으로 업캐스팅 가능하다
				 구체적인 예외를 먼저 처리하고, 그 다음 Exception을 처리한다.
				*/
				// 예외처리
				
			}finally { 
				// 예외 발생 유무와 상관없이 반드시 실행해야하는 문장을 작성
			System.out.println("finally !!");
			s.close(); // 자원해제
			}
		/*	try ~ catch ~ finally
		 * 1 - try 구문 진입 
		 * 2 - try 예외 발생시 예외정보를 객체로 생성해서 던짐
		 * 3 - catch구문에서 받아서 처리 (순차적으로 체크하면서 해당 예외를 찾아감)
		 * 4 - 해당 예외에 맞는 예외 / 에러 처리
		 * 5 - finally 구문을 실행 
		 * */
		
		// try ~ with 구문 (jdk 7.0 이후 사용 가능)
		/* try(AutoCooseable 객체) {
		}catch(Exception e) {
				
			}
		} 
		try구문 발생시 정상처리 / 예외발생후 자동으로 자원해제 처리
		
		*/

		/*NullPointerException = 객체의 참조값이 NULL인 경우
		 * 
		 * - 객체를 만들어서 참조했는데 객체의 참조값이 NULL 
		 * 
		 * 컴파일러가 가장 높은 우선순위로 가지고 있는게 널 포인터 
		 * - 굉장히 많은 상황에서 발생하고 원인이 동일하지 않다. 
		 * 
		 * 말 그대로 NULL이기 때문에 발생하는 값
		 * 
		 * 
		 * 그 다음 많이 볼 수 있는 경우
		 * ArrayIndexOutOfBoundsException : 배열 범위 참조 에러
		 * 배열 인덱스(위치)가 범위를 넘어갔다
		 * 배열의 범위가 넘어갔을때 발생하는 예외
		 * 
		 * */
		try{
			int [] arr = new int[3]; // 크기가 3인 배열 
			arr[3] = 100; // 배열이 0,1,2밖에 없는데 3번으로 접근해서 범위 초과
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("에러 발생 : " + e);
		}
		
		
		
		
		
		
	}

}