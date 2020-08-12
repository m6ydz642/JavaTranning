package 사용자관리0609.db;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.annotation.Resource;

import com.mysql.fabric.xmlrpc.base.Array;
import com.mysql.jdbc.Driver;

public class itwillDAO {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String DBURL = "jdbc:mysql://localhost:3306/javadb";
	private static final String DBID = "root";
	private static final String DBPW = "1234";

	// 데이터 처리객체 (DB관련된 작업)
	public Connection con = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;
	public String sql = "";

	// 1. 드라이버로드
	// 2. 디비 연결
	// -> 동작처리 (메서드)
	private Connection getConn() throws Exception {
		Class.forName(DRIVER);
		con = DriverManager.getConnection(DBURL, DBID, DBPW);
		System.out.println("드라이버로드 & 디비연결 성공 : " + con);
		return con;
	}
	// 3. SQL 작성, 문장 작성
	// 4. pstmt객체 생성
	// 5. 결과 확인

	// 자원해제 메서드 
	public void closeDB() {
		try {
			if (rs != null) rs.close();
			if (pstmt != null) pstmt.close();
			if (con != null) con.close();
		} catch (SQLException e) {
			System.out.println("자원해제");
			
			e.printStackTrace();
		}
		
	}
	
	
	// 회원등록
	public void memberJoin(itwillDTO idto) {
		System.out.println("memberJoin() 실행");
		try {
			getConn();
			System.out.println("전달된 회원정보  " + idto);

			// 3.
			sql = "insert into itwill_member values (null,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, idto.getName());
			pstmt.setString(2, idto.getGender());
			pstmt.setInt(3, idto.getAge());
			pstmt.setString(4, idto.getJumin());

			pstmt.executeUpdate();

			System.out.println("회원정보 등록완료");

		} catch (Exception e) {
			System.out.println("드라이버 로드 실패");
		}

		// 회원 조회

	}

	public void memberSelect(itwillDTO test) throws SQLException {

		String sql2 = "select * from itwill_member";
		pstmt = con.prepareStatement(sql2);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			// 결과중 한row씩 정보를 사용

			// 결과 가져오기
			// rs.getXXX(); => 데이터 타입에 따라서 메서드 변경
			// rs.getXXX("컬럼명"); or rs.getXXX(인덱스 번호);
			System.out.print(" id : " + rs.getInt("idx"));
			System.out.print(" name : " + rs.getString("name"));
			System.out.print(" gender : " + rs.getString("gender"));
			System.out.print(" age : " + rs.getInt("age"));
			System.out.print(" jumin : " + rs.getString("jumin"));

			System.out.println("\n------------------------------");
		} // while 끝
	}

	public ArrayList memberList() throws SQLException {

		ArrayList memberList = new ArrayList();
		
		try {
			// 1, 2 드라이버로드 & 디비연결
			con = getConn();

			// 3. SQL구문(select) 작성준비 (pstmt)
			sql = "select * from itwill_member";
			// 4. SQL실행 -> 결과 rs저장 
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
		
			while (rs.next()) {
				itwillDTO dto = new itwillDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setName(rs.getString("Name"));
				dto.setGender(rs.getString("gender"));
				dto.setAge(rs.getInt("age"));
				dto.setJumin(rs.getString("jumin"));
					// arrayList한칸에 한명(itwillDTO) 의 정보 저장
				memberList.add(dto);
				
			}
			
			System.out.println(" 회원 정보 조회 성공 ");
			
		} catch (Exception e) {
			System.out.println("접속 오류" + e);
			e.printStackTrace();
		}finally {
			closeDB(); // 자원해제 함수
		}
	
		
		
		// 5. 리턴
		return memberList; // 회원조회
	}
	
	public void getMember(int num) throws Exception { // 회원 수정

		
		try {
			con = getConn();
		// 3. SQL구문(select) 작성준비 (pstmt)
			sql = "select * from itwill_member where idx = ?";
		// 4. SQL실행 -> 결과 rs저장 
		
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,num);
	
			rs = pstmt.executeQuery();
		// 결과 처리
			
			if (rs.next()) {
				System.out.println("회원정보 표시");
				System.out.println(rs.getInt("idx"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("gender"));
				System.out.println(rs.getInt("age"));
				System.out.println(rs.getString("jumin"));
			}else{
				
			}
			
		} catch (SQLException e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}finally {
			closeDB();
		}
		

		
	}
	
	// 회원 수정
	public void updateMember(itwillDTO dto) {
		try {
			// 디비연결
			con = getConn();
			sql = "update itwill_member set name = ?, gender = ?, age = ?, jumin = ? "
					+ "where idx = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getGender());
			pstmt.setInt(3, dto.getAge());
			pstmt.setString(4, dto.getJumin());
			pstmt.setInt(5, dto.getIdx());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			
		}
	}
	
	public void deleteMember(int idx, String name) {
		try {
			con = getConn();
			sql = "select * from itwill_member where idx = ? and name = '?'";
			pstmt.setInt(1, idx);
			pstmt.setString(2, name);
			
			pstmt = con.prepareStatement(sql);
			// rs = pstmt.executeUpdate();
			 pstmt.executeUpdate();
			 System.out.println("회원정보 표시");
				System.out.println("삭제가 완료되었습니다");

			
		} catch (Exception e) {


			e.printStackTrace();
		}
		
	}

}
