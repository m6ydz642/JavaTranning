
public class Test3 {

	public static void main(String[] args) {

		// String msg = "Hello";

		// System.out.println(msg.charAt(2));

		// * charAt(위치)
		// -> 문자열 변수에있는 값중에 해당 위치에 있는 문자형 데이터를 가져온다.
		//

		// 해당 변수 3번방에 있는 (index:3) 값에 따라서 각각 다른 메시지를 출력

		// A/a -> "Apple"
		// B/b -> "Banana"
		// G/g-> "Grape"
		// O/o -> "Orange"
		// 그외 문자 -> "처리 불가능한 문자 입니다"
		String msg = "abcde";
		int number = 3; // 방번호
		switch (msg.charAt(number)) {
		case 'A':
		case 'a':
			System.out.println("Apple");
			break;
		case 'b':
		case 'B':
			System.out.println("Banana");
			break;
		case 'g':
		case 'G':
			System.out.println("Grape");
			break;
		case 'o':
		case 'O':
			System.out.println("orange");
			break;
		default:
			System.out.printf("%d번방 의 값은 \n", number);
			System.out.println("입력받은 값은 "+ msg.charAt(number) + " 입니다");
			
			break;
		}


	}

}
