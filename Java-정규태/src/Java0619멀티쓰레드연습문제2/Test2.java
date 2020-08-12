package Java0619멀티쓰레드연습문제2;

class Gugu extends Thread {
	int dan;

	public Gugu() { }

	public Gugu(int dan) {
		this.dan = dan;
	}

	public void run() {

		long time = (long)(Math.random()*500);
		System.out.println(dan+"단" + time + "만큼 sleep() ");
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		


		for (int i = 2; i <= 9; i++) {

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
		}
	}

}

public class Test2 {

	public static void main(String[] args) {

		// 구구단을 출력 (세로)
		// 2~9단 (랜덤한 순서로)
		// => 구구단 객체를 생성해서 사용
		// Gugu a = new Gugu();
	
		Thread gugu = new Thread(new Gugu(1));
		Thread gugu2 = new Thread(new Gugu(2));
		Thread gugu3 = new Thread(new Gugu(3));
		Thread gugu4 = new Thread(new Gugu(4));
		Thread gugu5 = new Thread(new Gugu(5));
		gugu.start();
		gugu2.start();
		gugu3.start();
		gugu4.start();
		gugu5.start();
		
	}
}
