package Java0605_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Test3 {
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/javadb";
	public static final String DBID = "root";
	public static final String DBPW = "1234";
	
	public static Connection con = null;
	public static PreparedStatement pstmt = null;
	public static ResultSet rs = null;
	public static String sql = "";
	
	public static void main(String[] args) {

		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
			
			
			con = DriverManager.getConnection(DBURL, DBID, DBPW); 
			// 홍길동 삭제처리 
			String sql = "select name from itwill_member "
					+ "where idx = 21"; // sql작성, pstmt객체 생성
			pstmt = con.prepareStatement(sql);
			// 4.SQL실행
			rs = pstmt.executeQuery();
			
			
			if (rs.next()) { // idx가 21번인 사람이 있다.
				System.out.println("찾는사람이 있네여");
				if(rs.getString("name").equals("홍길동")) { // 이름을 비교해서 같을 경우 삭제, 다를경우 메시지
					sql="delete from itwill_member where name='홍길동' and idx=21";
					pstmt = con.prepareStatement(sql);
					pstmt.executeUpdate();
					System.out.println("삭제 완료");
				}else{
					System.out.println("잘못되었는디?");
				}			
			}else{
				System.out.println("그런 사람이 없는데여????????");
				// 없다
			}


			System.out.println("select구문 실행완료");
			


			
		} catch (Exception e) {
System.out.println("무슨 오류가 생겼을까?" + e );
			e.printStackTrace();
		}

	}

}
