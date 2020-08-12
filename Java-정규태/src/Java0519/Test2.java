package Java0519;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Test2 {

	public static void main(String[] args) {
		/* 문자열 클래스들
		 * 
		 * String 클래스 
		 * 
		 * 1. "문자열 상수"
		 * 2. new 문자열 객체()
		 * 
		 * */
		
		String str1 = new String ("hello");
		String str2 = new String ("hello");
		
		if(str1 == str2) {
			System.out.println("같다");
		}else{
			System.out.println("다르다");
			System.out.println("객체의 주소가 달라서");
		}
		
		
		String str3 = "hello";
		String str4 = "hello";
		
		if(str3 == str4) 
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		
		System.out.println(str1.length() );
		System.out.println(str1.substring(0));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.indexOf('o'));
		
		
		System.out.println(str1.trim()); // 문자열 앞뒤 공백 제거 
		
		
		System.out.println("------------------------------------------------------");
		str4 = "Hello Java";
		String test = str4.toUpperCase(); // 대문자 변경 메서드
		System.out.println(test);
		System.out.println(str4); // 해당 메서드의 처리결과를 String 타입의 변수에 다시 저장하지 않음
		
		/*
		 * string 타입 메서드 처리시 정보를 저장하지 않을 경우 
		 기존의 값이 유지됨 
		 
		 --------------------------------------------------------------------------------------------
		 
		StringBUffer 클래스 
		Buffer : 메모리 저장공간 (임시)
		
		
		StringTokenizer
		하나의 문자열을 여러개의 문자열로 나누는 작업하는 클래스
	 	
		*/
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		System.out.println(sb);
		
		StringTokenizer stk = new StringTokenizer("홍길동z갑돌이@김학생","@");
		
		// 파싱된 문자열의 개수
		System.out.println(stk.countTokens());
		
		Calendar cal = Calendar.getInstance();
		// 시스템의 날짜정보를 가져와서 사용 (싱글턴 패턴)
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		
		
		System.out.println("-----------------------------------------------");
		SimpleDateFormat format2 = new SimpleDateFormat ( "yyyy년 MM월dd일 HH시mm분ss초");
		String format_time2 = format2.format(cal.getTime());
		
		System.out.println(format_time2);
		
		
	}

}

