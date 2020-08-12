package Java0504;

class EMP {
	protected String name;
	protected int salary;
	
	public void employeePrint() {
		System.out.printf("일반직원 %s %d \n", name, salary);
	}
	
	
	
}
class MAN extends EMP{ // 관리자 객체 
	protected String depart; // 부서
	
	public void manPrint() {
		System.out.printf("관리자 %s %d %s \n", name, salary, depart);
	}
	
}

class Point2{
	protected int x=10;
	protected int y=20;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
class Point3 extends Point2{
	private int z = 30;
	
	public void prn() {
		System.out.println("x = " + x + ", y = " + y + " " + "z = " + z);
	}
	
}


public class Test2 {

	public static void main(String[] args) {
	/* protected 접근지정자
	 * : 상속이 적용되는 클래스에서 서브클래스가 슈퍼클래스 필드에 접근 가능하도록 하는 것
	 * 클래스 외부에서는 접근 불가능하게 하는 접근 지정자 
	 * -> 상속관계(서브클래스) : public, 외부클래스(상속x) : private 
	 * */

		Point3 p3 = new Point3();
		p3.prn();
		
		System.out.println(p3.x);
		
		
	/* 사원(emp) - 이름(name), 월급(salary)
	 * 해당 사원의 정보를 모두 출력하는 기능
	 * 객체(사원) 생성시 데이터를 초기화 ("홍길동",500)
	 * 
	 * 관리자(Manager) - 이름(name), 월급(salary), 부서(depart) 
	 * 관리자 정보를 출력하는 기능
	 * 객체 (관리자) 생성시 데이터 초기화 ("김팀장", 600, "개발팀") 
	 * 
	 * 
	 * */
		EMP employee = new EMP();
		employee.name = "김팀장";
		employee.salary = 500;
		employee.employeePrint();
		
		MAN man = new MAN();
		man.name = "관리자";
		man.salary = 1000;
		man.depart = "관리부서";
		man.manPrint();
	}

}
