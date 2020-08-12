package Java0409;


public class Test2 {

	public static void main(String[] args) {

		// 숫자 판독프로그램 생성
		// -> 숫자로만 이루어진 문자열의 경우만 숫자로 판다.
		// -> 문자열 (string) 데이터가 각각의 방에 따로 저장. 각방의 번호는 0번부터 시작
		// charAt(위치) -> 해당위치의 문자 데이터를 가져올 수 있음.

		String str = "12a45";
		char ch = ' ';
		boolean isNumber = true; // 뭔 용도인지를 모르겠다

		for (int i = 0; i <= 4; i++) {
			
			 if (str.charAt(i) <= 'Z') {
				 ch = str.charAt(i);
				 
				 System.out.print(str.charAt(i));
				 System.out.println("<<--- 내용 ");
		 	}
			 else {
				 System.out.print(str.charAt(i) + " <---- 문자가 포함되어있는데욥? 으~~딜 사기를 \n" ); // 문자가 포함되어있다면 
				 isNumber = false;
				 // ch = str.charAt(i);
				 System.out.print(str.charAt(i) + "<--- 가 문자인걸 들켰습니다\n" ); // 문자가 포함되어있다면
			 }
			

		}
//		if (!isNumber) { // 이건 왜 만들었지????????????
//			System.out.println("숫자가 아닌 또다른 무언가가 있습니다");
//		}
		System.out.println("str은 " + isNumber + "입니다");
		
	}

}
