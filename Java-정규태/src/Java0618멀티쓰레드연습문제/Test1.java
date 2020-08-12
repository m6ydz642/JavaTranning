package Java0618멀티쓰레드연습문제;

class TestThread implements Runnable {

	int count = 0;
	int num = 0;

	// 생성자를 사용해서 쓰레드가 도착할 최종 목적지(count의 크기)
	// 초기화
	public TestThread() {	}

	public TestThread(int cnt) {
		count = cnt;
	}

	@Override
	public void run() {

		// 무한루프
		// num 1씩 증가 -> count 크기까지 증가
		// 쓰레드의 이름 : num의 값을 출력
		while (true) {

			try {
				Thread.sleep(1000); // 1/1000초
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			num++;
			System.out.println(Thread.currentThread().getName() + " - " + num);

			if (num >= count)
				break;
		}

	}

}

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

		// 메인메서드 제외 3개의 쓰레드를 번갈아가면서 작동시켜서 해당 목표를 찾아가는 동작
		// runnable 인터페이스를 구현한 객체
		TestThread a = new TestThread(50);
		// thread객체
		Thread th1 = new Thread(a, "1번 쓰레드");
		th1.start();

		TestThread b = new TestThread(60);

		Thread th2 = new Thread(b, "2번 쓰레드");
		th2.start();
		 th2.join(); // -> 해당쓰레드를 완전히 실행 할 수 있도록 처리 (다른 쓰레드 대기)
		
		
		TestThread c = new TestThread(40);
		Thread th3 = new Thread(c, "3번 쓰레드");
		th3.start();
	}

}
