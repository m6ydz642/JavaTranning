
public class UseFunction {
	public static void aaa(String a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseFunction print = new UseFunction();

		int test = 1;
		double good = 3.14;
		String test2 = "아아 사용자 지정함수 \n";
		int test3 = 0;

		print.out("흠ㅡ \n");
		print.out("흠 ", "인자값 원하는데로 !!!!!! \n");
		print.out(test2);
		print.out(test, test2);
		print.out("인자테스트 = ", test);
		print.out("\n힝");
		


	}
	
	

	public String out(String good) {
		System.out.printf(good);

		return good; // 사용자 지정
	}

	public String out(String good, String not) {
		String result = good + not;
		System.out.printf(good + not);
		return result; // 사용자 지정
	}

	public String out(String good, int not) {
		String result = good + not;
		System.out.printf(good + not);
		return result; // 사용자 지정
	
	}

	public String out(int not, String good) {
		String result = not + good;
		System.out.printf(not + good);
		return result; // 사용자 지정
	}

	public int out() {
		System.out.println();
		return 0; // 사용자 지정
	}

	public int out(int a) {
		System.out.println(a);
		return a; // 사용자 지정
	}

	public double out(double b) {
		System.out.println(b);
		return b; // 사용자 지정
	}

	public float out(float c) {
		System.out.println(c);
		return c; // 사용자 지정
	}

	public int out(int c, int d) {
		System.out.print(c);
		d = c + d;
		return d; // 사용자 지정
	}

}
