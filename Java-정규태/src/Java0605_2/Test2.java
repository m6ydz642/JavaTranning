package Java0605_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test2 {
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/javadb";
	public static final String DBID = "root";
	public static final String DBPW = "1234";

	public static Connection con = null;
	public static PreparedStatement pstmt = null;
	public static ResultSet rs = null;
	public static String sql = "";

	public static void main(String[] args) throws SQLException {
		// 0.드라이버 설치
		// 1. 드라이버 로드
		try {
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("드라이버 로드 성공!");

			// 2. 디비 연결
			con = DriverManager.getConnection(DBURL, DBID, DBPW); // 변수에
																	// 넣은다음
																	// 변수로
																	// 가져와도됨
			// => 확인
			System.out.println("DB접속 성공!");
			System.out.println(con);

			// 3. SQL 구문 실행
			String sql = "select * from itwill_member";

			pstmt = con.prepareStatement(sql);

			// 4. 실행
			rs = pstmt.executeQuery();
			System.out.println("select구문 실행완료");
			// System.out.println(sql);

			// 5.결과
			// select 구문의 결과 -> 레코드 셋 -> 처리하는 자바 객체 Result Set
			while(rs.next()){
				// 결과중 한row씩 정보를 사용 
				
				// 결과 가져오기 
				// rs.getXXX(); => 데이터 타입에 따라서 메서드 변경 
				// rs.getXXX("컬럼명"); or rs.getXXX(인덱스 번호);
				System.out.print(" id : "+rs.getInt("idx"));
				System.out.print(" name : "+rs.getString("name"));
				System.out.print(" gender : "+rs.getString("gender"));
				System.out.print(" age : "+rs.getInt("age"));
				System.out.print(" jumin : "+rs.getString("jumin"));
				
				System.out.println("\n------------------------------");				
			} // while 끝
			
			System.out.println("SELECT 구문 정상 실행 ");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
