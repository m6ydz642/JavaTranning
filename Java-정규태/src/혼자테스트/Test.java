package wer;

public class Test {

	public static int test() {
		int test = 10;
		
		return test;
	}
	
	public static int test2() {
		int test2 = 10;
		
		return test2;
	}
	
	public static void main(String[] args) {

		if (test() == 10) {
			
			System.out.println(test() + "이 호출되네?");
		}else {
			System.out.println("값은 " + test());
		}
		if (test() == test2()) {
			System.out.println(test() + "와" + test2() + " 값이 같네?");
		}else{
			System.out.println("다른디");
		}


	}

}
