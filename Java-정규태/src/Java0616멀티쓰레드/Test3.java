package Java0616멀티쓰레드;

class ThreadEx {

	String name;

	public ThreadEx() {
	}

	public ThreadEx(String s) {
		name = s;
	}

	public void start() {
		run();
	}

	public void run() {
		for (int num = 1; num <= 5; num++) {
			for (int i = 0; i < 100000000L; i++)
				;
			System.out.println(name + " : " + num);
		}
	}

}

class Thread implements Runnable {

	@Override
	public void run() {
		for (int num = 1; num <= 5; num++) {
			for (int i = 0; i < 100000000L; i++)
				;
			System.out.println(Thread.currentThread().getName() + " : " + num);
		}
	}

}

public class Test3 {
	public static void main(String[] args) {

		// main 쓰레드(단일 쓰레드)만 동작하는 프로그램
		// => 멀티쓰레딩의 결과를 볼수 없음.

		ThreadEx th1 = new ThreadEx("1번 쓰레드");
		ThreadEx th2 = new ThreadEx("2번 쓰레드");
		
		// Runnable 인터페이스 구현시(상속)
		// 구현한 객체를 생성 -> Thread(x)
		// => Runnable 객체를 실행할 Thread 객체가 필요하다( 별도의 객체 생성 )
		// th1.start();
		// th2.start();
		
		ThreadTest tt1 = new ThreadTest();

		Thread t = new Thread(tt1);
		t.start();

		// new ThreadTest(); // 익명클래스 
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for (int num = 1; num <= 5; num++) {
					for (int i = 0; i < 100000000L; i++);
					System.out.println(Thread.currentThread().getName() + " : " + num);
				}
				
			}
		};

		// * 쓰레드 상태 (4가지 형태)
		
		/*
		  new  ->			
			start() - new 상태에서는 안됨 반드시 start
		        runnable         blocked 
				   run()
		  dead
		*/
		// new 상태 : 쓰레드 객체를 생성한 상태
		// runnable 상태 : run을 실행할 수 있는 상태
		// *new 상태 runnable 상태  : start()를 통해서 상태 변경
		
		// blocked 상태 : 하나 이상의 쓰레드가 작동중이기 때문에 작업이 끝날때 까지
		// 대기중인 상태
		
		
		// dead 상태 : 쓰레드가 소멸된 상태
		
				// runnable <-> blocked 상태를 변경시키는 메서드/동작
				// 1) sleep / done sleep
				// 2) suspend / resume
				// 3) wait / notify
				// 4) block On IO / IO Complete
		
	
	}
}
