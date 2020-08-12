package Java0714;

interface Test{
	public void a();
}

class SubTest implements Test{

	@Override
	public void a() {
		System.out.println("서브 클래스 호출");
		
	}
	
}

@FunctionalInterface
interface Test_Parm {
	public void a(int x, int y);
	
}


public class Test2 {

	public static void main(String[] args) {
		// 2. 익명 클래스 
		Test t = new Test() {
			
			@Override
			public void a() {
				System.out.println("익명클래스 호출");
				
			}
		};
		t.a();
		
		SubTest a = new SubTest();
		a.a();
		
		// 람다식
		Test b = () -> System.out.println("람다식 클래스 호출");
		b.a();

	
		/*************************************************/
		// 익명클래스 
		Test_Parm c = new Test_Parm() {
			
			@Override
			public void a(int x, int y) {
				System.out.println("Test_Param 익명클래스" +" " + x + " " + y);
			}
		};
		
		c.a(10, 30);
		
		
		Test_Parm d = (x, y) -> System.out.println("Test_Param 익명클래스2" +" " + x + " " + y);
		d.a(10, 30);
		
		
		// 멀티쓰레드 처리
		// 멀티쓰레드 처리 (익명클래스/람다식) 
		System.out.println("익명 클래스 사용");
		new Thread() {

			@Override
			public void run() {
				while(true)
					try {
						Thread.sleep(1000);
						System.out.println("쓰레드 익명 클래스 " + System.currentTimeMillis());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
			} // while
			
		}.start(); // new Thread()
		
		////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("람다 표현식");
		
		
		new Thread( 
/*****************************************************************************************************/
// 쓰레드 생성자 요소				
				() -> {
				while(true)
					try {
						Thread.sleep(1000);
						System.out.println("쓰레드 익명 클래스2 람다식" + System.currentTimeMillis());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			} // while
/*****************************************************************************************************/		
		).start(); // new Thread()
	
	}

}
