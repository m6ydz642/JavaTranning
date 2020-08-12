package 사용자관리0609.db;

public class itwillDTO {
	// 자바빈(bean) 개념 -> 객체를 저장해서 사용
	// 테이블에 있는 정보를 한번에 저장하기 위해서 사용 - 주목적
	
	private int idx;
	private String name;
	private String gender;
	private int age;
	private String jumin;
	
	@Override
	public String toString() {
		return "itwillDTO [idx=" + idx + ", name=" + name + ", gender=" + gender + ", age=" + age + ", jumin=" + jumin
				+ "]";
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	
}
