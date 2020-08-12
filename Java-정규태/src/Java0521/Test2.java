package Java0521;
import java.io.IOException;

/* 사용자 정의 예외 객체 */
class UserException extends Exception{ // Exception속성을 상속해서 만들수 있음
	public UserException() {}
	public UserException(String msg) {
		super(msg);
	System.err.println(msg);	
	
	}
	// Exception(msg)
			
}

public class Test2 {

	public static void exp(int num) { // 자체 예외
		System.out.println("static 메서드 실행 ");
		System.out.println("전달 값 : " + num);
		// 만약 전달값 0일 경우 예외를 발생 시켜보겠다 (NullPoint)
		
		if (num==0) {
			System.out.println("예외 발생 num : " + num);
			throw new NullPointerException();
		}
	}
	
	public static void exp2(int num) throws IOException { // 자체 예외, exception으로 할때는 try도 exception인데
														  // IOException으로 하면 try에 IOE가 들어감 
		if (num == 0) {
			throw new NullPointerException();
		}
		
	}

	public static void main(String[] args) {
		/* 예외가 발생시 JVM(컴파일러)에서 자동으로 해당되는 예외를 객체로 생성해서 처리하게 만듦
		 * 
		 * 사용자 정의 예외 (예외의 인위적 발생) (내가 만들어서 발생)
		 * 
		 * 개발자가 의도를 가지고 예외를 발생시킨다.  특수한 상황이 발생하게 되면 예외로 처리하겠다는 의미
		 * 자바 자체는 예외가 아닌데 내가 예외로 생간한다면
		 * 
		 * (ex)자판기 -> 상품이 다팔렸는데 주문이 들어왔다면, 예외로 따로 빼내는거 (돈을 다시 반환하거나 돈을 안 받거나)
		 * 예외 객체를 생성해서 던진다.
		 * 
		 *  throw 예외객체;
		 *  아니면 throw new 예외 클래스(); - 둘다 같은 이야기 
		 *    
		 * 
		 * */
		
		exp(10);
//		try {
//			
//		} catch (NullPointerException e) {
//				System.out.println("예외가 발생했어용 ");
//		}
//		try {
//			exp2(0);
//		} catch (Exception e) {
//			 // e.printStackTrace();
//			System.out.println("exp2 예외 발생");
//		}
		
		try {
			exp2(10);
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("exp2 예외 발생");
		}

		/* throw 키워드
		 * - 예외를 일부러 발생시키는 키워드
		 * throw new 예외클래스  
		 * 
		 * throws 키워드 (반드시 예외처리를 해라는 의미로 사용하면됨)
		 * 예외를 직접 처리하는게 아니라, 자신을 호출한 곳 (객체)에 
		 * 예외처리를 떠넘기는 동작 (키워드)
		 * public void 메서드 () throws 예외 객체 {		}
		 *  
		 * 사용자 정의 예외 객체
		 * */
		try {
			int a = - 100;
				if (a < 0) {
					throw new UserException("음수라서 예외가 발생함");
				}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
