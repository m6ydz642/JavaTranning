package Java0512;
class Person{ }
class Student extends Person{ }
class Researcher extends Person{ }
class Professor extends Researcher { }

public class Test2 {

	public static void result(Person p){
		if (p instanceof Person)
			System.out.println("p는 Person 타입입니다.");
		if (p instanceof Student)
			System.out.println("p는 Student 타입입니다.");
		if (p instanceof Researcher)
			System.out.println("p는 Researcher 타입입니다.");
		if (p instanceof Professor)
			System.out.println("p는 Professor 타입입니다.");
		
		System.out.println("--------------------------------");
	}
	
	
	
	public static void main(String[] args) {
 
	/* 객체간의 상속관계를 확인
	 * 
	 */
	    Person p = new Person();
		Student s = new Student();
		Researcher r = new Researcher(); 
		Professor P = new Professor();
		
//		if (p instanceof Person) {
//			System.out.println("b객체와 Person()는 같다잉? ");
//		} else {
//			System.out.println("다르다잉? ");
//		}
//		if (s instanceof Student) {
//			System.out.println("학생객체와 Student()는 같다잉? ");
//		} else {
//			System.out.println("다르다잉? ");
//		}
//		
//		if (r instanceof Person) {
//			System.out.println("조교객체와 사람객체는 같다잉? ");
//		} else {
//			System.out.println("다르다잉? ");
//		}
//		
//		if (P instanceof Person) {
//			System.out.println("교수객체와 조교는 같다잉? ");
//		} else {
//			System.out.println("다르다잉? ");
//		}
//		if (p instanceof Student) {
//			System.out.println("교수객체와 조교는 같다잉? ");0
//		} else {
//			System.out.println("다르다잉? ");
//		}

		System.out.println("--------------------------------");
		result(new Person()); // Person p = new Person(); 
		result(new Student()); // Person p = new Student(); 
		result(p);
		result(r);

	}

}
