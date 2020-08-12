package com.itwillbs.Model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;

public class CustomerDAO {
	/*
	 * DAO -> Data Access Object (데이터 처리 객체)
	 * -> DB처리
	 *  
	 * 
	 */
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = "";
	
	// 회원 목록 전부를 저장하는 백터 
	Vector data = new Vector();
	
	// 디비 연결 
	@SuppressWarnings("unused")
	private void connectDB(){
		
		final String DRIVER = "com.mysql.jdbc.Driver";
		final String DBURL = "jdbc:mysql://localhost:3306/javadb";
		final String DBID = "root";
		final String DBPW = "1234";
		
		try {
			Class.forName(DRIVER);
			System.out.println("드라이버 로드 완료");
			try {
				con = (Connection) DriverManager.getConnection(DBURL,DBID,DBPW );
			} catch (SQLException e) {
				System.out.println("디비 연결 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		}
		
	}// 디비 연결 해제
	
	
	// 회원 가입 처리
	public int insertCustomer(CustomerDTO dto){
	
		
		int result=0;

		try {
			connectDB(); // DB연결 
			sql= "insert into customer values (null, ?,?,?,?)";
			pstmt = (PreparedStatement) con.prepareStatement(sql);
			
			// 3-1 ?
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getId());
			pstmt.setString(3, dto.getPasswd());
			pstmt.setString(4, dto.getJumin());
			
			// 실행 
			// pstmt.executeUpdate();
			
			 result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("SQL구문 오류");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("기타 오류" + e);
		}finally {
			colseDB();
		}
		
		return result;
	} // 회원 가입 처리
	
	public void colseDB(){ // 연결 해제
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}


	public DefaultTableModel selectCustomer() { // TableModel형식
	// 회원 검색 처리 
		
	
		
		// sql생성
	
		try {
			connectDB(); // DB연결 
			
			// sql 생성 pstmt 객체
			sql= "select * from customer";
			pstmt = (PreparedStatement) con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		// new DefaultTableModel (vector, vector)
		
		// 컬럼명 저장 백터 
		Vector<String> columnNames = new Vector<String>();
		columnNames.add("번호");
		columnNames.add("이름");
		columnNames.add("아이디");
		columnNames.add("비밀번호");
		columnNames.add("주민번호");
		
		// DB(rs) -> 백터 저장
		
		while(rs.next()) { // 데이터 있을때 마다 처리
			Vector rowData = new Vector<>();
			
			
			rowData.add(rs.getInt("idx"));
			rowData.add(rs.getString("name"));
			rowData.add(rs.getString("id"));
			rowData.add(rs.getString("password"));
			rowData.add(rs.getString("jumin"));
			
			data.add(rowData);
		} // rs
		
		// DefaultTableModel 리턴
														// 벡터데이터, vector  컬럼명
		DefaultTableModel dtm = new DefaultTableModel(data, columnNames){

			@Override
			public boolean isCellEditable(int row, int column) {
				// 셀 수정이 가능한가 판단 -> 수정 불가 
				
				return false;
			}
			
		}; // 익명클래스 
		// dtm.isCellEditable(row, column);
		return dtm;
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//실행

		
		return null;
	}


	public int deleteCustomer(int idx) {
		int result = 0;
		connectDB(); // DB연결 
		sql= "delete from customer where idx = ?";
		try {
			pstmt = (PreparedStatement) con.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.executeUpdate();
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		 
		return result;
		
	}
	
	

}

