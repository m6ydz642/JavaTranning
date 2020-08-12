package Java0605_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {

	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/javadb";
	public static final String DBID = "root";
	public static final String DBPW = "1234";

	public static void main(String[] args) {
		// 회원가입할 데이터 (입력받음)
		String name = "박학생";
		String gender = "M";
		int age = 22;
		String jumin = "900101-1212121";
		
		
		// 자바-> 데이터 저장 -> 변수
		// -> 객체 -> 파일(DB)

		// JDBC (Java DataBase Connectivity) : 자바와 데이터베이스간의 연결정보를
		// 관리/처리하는 클래스들

		// C:\Program Files\Java\jdk1.8.0_121\jre\lib\ext
		// => 해당 파일 복사

		// 0. 라이브러리 설치(JDBC 설치) *.jar
		// 1. 드라이버 로드
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로드 성공!");

			// 2. DB접속
			
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "1234");
			Connection con = DriverManager.getConnection(DBURL, DBID, DBPW); // 변수에 넣은다음 변수로 가져와도됨
			
			System.out.println("DB접속 성공!");
			System.out.println(con);
			
			// 3. SQL문 작성 & Statement 객체 생성
			String sql = "insert into itwill_member "
				//	 + "values(?,?,?,?,?)";
				//	+ "values(null, '정규태','M',20,'901233-1231231')";
					+ "values(null,'"+name+"','"+gender+"',"+age+",'"+jumin+"')";
			
			// Statement : 쿼리문을 실행 객체
			
			Statement stmt = con.createStatement();
			
			// 4. SQL문 실행
			stmt.executeUpdate(sql); // delete, insert, update는 executeUpdate써야됨 그냥 execute는 select만
			
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

}
