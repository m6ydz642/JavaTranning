package Java0618멀티쓰레드연습문제;

class DressRoom implements Runnable {

	@Override
	public void run() {
		// 한사람당 탈의실을 60초 동안 사용가능
		// 10초 단위로 앞사람의 남을 시간을 알려주는 동작
		// 2명~3명 사용자 동작


		synchronized (this) {

			for (int i = 10; i >= 0; i--) {
				try {
					// int rand = (int)((Math.random()*10000)%10);
					Thread.sleep(1000);
					System.out.println("똑똑 빨리나오시져?");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() +
						"님 옷 갈아입는중 " + (i*1) + "초전");
			}
			System.out.println(Thread.currentThread().getName() +
					"님 이용시간만료 ");
			
		}
	}

	// public synchronized void getcount() {
	// int count =60;
	//
	// if (count <= 0) {
	// System.out.println(Thread.currentThread().getName() + "님 잔여 티켓이 없습니다!");
	// System.out.println(" 시작 화면으로 돌아갑니다 \n\n\n\n\n ");
	// return;
	// }
	// }
	//
}

public class Test4 {

	public static void main(String[] args) {

		DressRoom a = new DressRoom();
		Thread b = new Thread(a, "1학생");
		Thread c = new Thread(a, "2학생");
		Thread d = new Thread(a, "3학생");

		b.start();
		c.start();
		d.start();
	}

}
