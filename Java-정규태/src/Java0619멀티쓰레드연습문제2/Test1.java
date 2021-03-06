package Java0619멀티쓰레드연습문제2;

import java.util.Scanner;

class Run extends Thread {

	String name;
	int meter;

	public Run() {
	}

	public Run(String name) {
		this.name = name;
	}

	public Run(String name, int meter) {
		this.name = name;
		this.meter = meter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				meter += 10;
				Thread.sleep(1000);
				System.out.println(meter + "미터");
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println("도착");
		}

	}

	public void People() {

	}

}

public class Test1 {

	public static void main(String[] args) {

		// 쓰레드를 사용한 달리기 경주

		// 몇명이서 달리기를 할건지 입력
		// 각각의 주자가 10m 마다 본인의 위치를 출력
		// 해당 주조가 100m에 도착하면 "도착" 달리기 완료

		// 주자(Runner)
		// 이름,위치(meter)
		// 0~100m 까지 이동 => run()
		// sleep() 메서드를 사용해서 10미터 마다 사용(다른값)

		Scanner scanner = new Scanner(System.in);
		System.out.println("몇명이서 달리기를 할껀가요? : ");
		int count = scanner.nextInt();

		for (int i = 1; i <= count; i++) {
			Thread b = new Run(i + "번 사용자");
			b.start();
		}

		System.out.println(count + "명이서 달리기를 시작합니다");

	}

}
