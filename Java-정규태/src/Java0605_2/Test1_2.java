package Java0605_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

class MemberBean { // DTO, VO

	private String name;
	private String gender;
	private int age;
	private String jumin;
	
	
	public MemberBean () {	}

	public MemberBean(String name, String gender, int age, String jumin) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.jumin = jumin;
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
	
	
	@Override
	public String toString() {
		return "MemberBean [name=" + name + ", gender=" + gender + ", age=" + age + ", jumin=" + jumin + "]";
	}
	
	
	
}

public class Test1_2 {

	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/javadb";
	public static final String DBID = "root";
	public static final String DBPW = "1234";
	
public static void MemberJoin (String name, String gender, int age, String jumin){
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로드 성공!");

			// 2. DB접속

			Connection con = DriverManager.getConnection(DBURL, DBID, DBPW); // 변수에 넣은다음 변수로 가져와도됨
			
			System.out.println("DB접속 성공!");
			System.out.println(con);
			
			// 3. SQL문 작성 & Statement 객체 생성
			String sql = "insert into itwill_member"
				//	 + "values(null, ?,?,?,?)";
					  + "values(null,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			// ?채우기 
			pstmt.setString(1, name);
			pstmt.setString(2, gender);
			pstmt.setInt(3, age);
			pstmt.setString(4, jumin);
			
		
			// 4. SQL문 실행
			pstmt.executeUpdate(); // delete, insert, update는 executeUpdate써야됨 그냥 execute는 select만
			
			int result = pstmt.executeUpdate();
			System.out.println("pstmt회원 등록성공" + result);
			
			// executeUpdate - insert,update,delete
			// -> DB테이블에 영향을 주는경우(내용변경)
			// -> 변경된 ROW수 리턴
			// executeQuery - select
			// -> DB테이블에 영향을 안주는 경우(내용변경x)
			// 처리된 결과 리턴
			
			System.out.println("회원 등록 성공");
			
			// Statment stmt = sql;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("드라이버 로드 실패! or 알 수 없는 오류");
			System.out.println("sql구문 오류");
			e.printStackTrace();
		}
	}
/////////////////////////////////////////////////////////////////////////////////////////////
	public static void MemberJoin (MemberBean mb){
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로드 성공!");

			// 2. DB접속

			Connection con = DriverManager.getConnection(DBURL, DBID, DBPW); // 변수에 넣은다음 변수로 가져와도됨
			
			System.out.println("DB접속 성공!");
			System.out.println(con);
			
			// 3. SQL문 작성 & Statement 객체 생성
			String sql = "insert into itwill_member"
				//	 + "values(null, ?,?,?,?)";
					  + "values(null,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			// ?채우기 
			pstmt.setString(1, mb.getName());
			pstmt.setString(2, mb.getGender());
			pstmt.setInt(3, mb.getAge());
			pstmt.setString(4, mb.getJumin());
			
		
			// 4. SQL문 실행
			pstmt.executeUpdate(); // delete, insert, update는 executeUpdate써야됨 그냥 execute는 select만
			
			int result = pstmt.executeUpdate();
			System.out.println("pstmt회원 등록성공" + result);
			
			// executeUpdate - insert,update,delete
			// -> DB테이블에 영향을 주는경우(내용변경)
			// -> 변경된 ROW수 리턴
			// executeQuery - select
			// -> DB테이블에 영향을 안주는 경우(내용변경x)
			// 처리된 결과 리턴
			
			System.out.println("회원 등록 성공");
			
			// Statment stmt = sql;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("드라이버 로드 실패! or 알 수 없는 오류");
			System.out.println("sql구문 오류");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// 회원가입할 데이터 (입력받음)

		String name = "ㅋㅋㅋ";
		String gender = "M";
		int age = 22;
		String jumin = "900101-1212121";


		// MemberJoin(name, gender, age, jumin);
		MemberBean mb = new MemberBean(name, gender, age, jumin);
		System.out.println(mb);
		
		MemberJoin(mb);
//		mb.getName();
//		mb.getGender();
//		mb.getAge();
//		mb.getJumin();
		
	}

}
