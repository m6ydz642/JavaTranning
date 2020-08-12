package Java0618멀티쓰레드연습문제;

class ATM implements Runnable {

	int acount = 0;

	public ATM() {

	}

	public ATM(int count) {
		acount = count;
	}

	@Override
	public void run() {

		for (int i=0; i<3; i++) {
		// System.out.println("계좌 정보 : " + acount);
			try {
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + "님 계좌 정보 " + acount);
			} catch (InterruptedException e) {


				e.printStackTrace();
			}
	
		}
		System.out.println("인터넷 뱅킹 끝");
	}

	public void deposit(int count) { // 입금
		acount = count;
	
		getMoney(count);
	}

	public void withdraw(int count) { // 출금
		
		acount = acount - count;
		System.out.println(count + "원 출금");
		getMoney(acount);
	}

	public void getMoney(int count) {
		acount = count;
		System.out.println("남은 잔액 : " + acount);
	}
}

public class Test5 {

	public static void main(String[] args) {

		// 계좌 정보를 ATM 클래스
		// - 잔액 정보
		// - 계좌 개설시 입금 가능
		// - 입금 동작(deposit) : 금액을 받아서 잔액에 추가
		// - 출금 동작(withdraw) : 금액을 받아서 잔액에서 감소, 잔액이 있을때만 출금가능
		// - 잔액 조회(getMoney) : 현재 남은 잔액

		// 사용자 AtmUser 클래스
		// 3명의 사용자가 1개의 계좌정보를 사용
		// 출금을 진행 -> 입금 : 총 5번 진행
		// 객체 생성시 본인의 이름, 계좌정보를 초기화 가능
		ATM a = new ATM();
		a.deposit(50000); // 입금
		a.withdraw(5000); // 출금
		
		a.getMoney(a.acount);
		Thread b = new Thread(a, "삼성"); 
		b.start();
		a.getMoney(a.acount);
		a.deposit(100000); // 입금
		a.withdraw(1000); // 출금
		
		Thread c = new Thread(a, "신한"); 
		
		a.deposit(8000); // 입금
		a.withdraw(1000); // 출금
		c.start();
		

		Thread d = new Thread(a, "국민"); 
		a.deposit(80000); // 입금
		a.withdraw(4500); // 출금
		d.start();

		// System.out.println(a.acount = 2000);

	}

}
