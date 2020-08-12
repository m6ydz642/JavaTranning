package 사용자관리0609;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.fabric.xmlrpc.base.Member;
import com.mysql.jdbc.UpdatableResultSet;

import 사용자관리0609.db.itwillDAO;
import 사용자관리0609.db.itwillDTO;

public class Itwill {

	public static itwillDTO inputData() {
		// 사용자 이름, 성별ㅎ 나이, 주민번호 입력 (키보드 입력)
		// -> itwillDTO객체에 저장해서 리턴

		Scanner scan = new Scanner(System.in);

		itwillDTO dto = new itwillDTO();

		System.out.println("사용자 정보 입력창 입니다");

		System.out.println("이름 >> ");
		String name = scan.nextLine();
		dto.setName(name);

		System.out.println("성별  >> ");
		String gender = scan.nextLine();
		dto.setGender(gender);

		System.out.println("나이 >> ");
		int age = scan.nextInt();

		dto.setAge(age);

		System.out.println("주민번호 >> ");
		String jumin = scan.nextLine();
		dto.setJumin(jumin);

		System.out.println(dto);
		return dto;

	}

	public static void showMemberList(ArrayList arr) {

		for (int i = 0; i < arr.size(); i++) {
			// System.out.println(arr.get(i)); //이렇게 해도 되고
			itwillDTO dto = (itwillDTO) arr.get(i);
			System.out.println("---------------------------------------------------");
			System.out.println(dto);
			System.out.println("---------------------------------------------------");

		}

		/*
		 * 확장 for문 for (itwillDTO dto: (itwillDTO)arr) {
		 * 
		 * }
		 * 
		 * 이터레이터? 문제 있어서 사용불가
		 */
	}
	
//	public static int showMemberList2(int num) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("수정하고싶은 idx번호를 입력하세요");
//		 num = scan.nextInt();
//		
//
//		return num;
//	}

	//////////////////////////////////////////////////////////////////////
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/javadb";
	public static final String DBID = "root";
	public static final String DBPW = "1234";

	public static Connection con = null;
	public static PreparedStatement pstmt = null;
	public static ResultSet rs = null;
	public static String sql = "";
	//////////////////////////////////////////////////////////////////////

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// ITWILL 회사의 사원 관리 프로그램
		Scanner scan = new Scanner(System.in);
		// 1. 회원 등록 -> 이름,성별,나이,주민번호를 등록
		// 2. 회원 조회 -> 이름/주민번호를 사용해서 검색 가능, 전체 목록보기 가능
		// 3. 회원 수정 -> 이름/주민번호를 제외한 나머지 정보만 수정 가능
		// 4. 회원 삭제 -> 이름/주민번호 입력시 회원 삭제 가능
		// * 프로그램 종료

		while (true) {
			System.out.println("(주) ITWILL 회원 관리 프로그램 ----------------------");
			System.out.println("1. 회원 등록 2. 회원 조회 3. 회원 수정 4. 회원 삭제 ");
			int input = scan.nextInt();
			Connection con = null;

			itwillDAO dao = new itwillDAO();
			// itwillDAO dd = new itwillDAO();

			switch (input) {

			case 1:
				itwillDTO dto = inputData();
				dao.memberJoin(dto);

				break;
			case 2: // 조회
				System.out.println("조회");
				// DAO로 이동해서 memberList()

				ArrayList memberList = dao.memberList();
				showMemberList(memberList);

			case 3: // 회원 수정
				// 수정하고자 하는 사람의 정보를 입력 (idx) 
				System.out.println("수정하고싶은 idx번호를 입력하세요");
			
				int num = scan.nextInt();
				 try {
					itwillDTO updateDTO = inputData();
					dao.getMember(num);
					updateDTO.setIdx(num);
					dao.updateMember(updateDTO);
					
					System.out.println("수정할 정보를 입력해주세요");
					

				} catch (Exception e) {
					System.out.println("getmember 가져오기 실패");
					e.printStackTrace();
				}
				 
				//  showMemberList2(showmember);
				// 내가 수정할 정보를 보여줌
				// 수정할 데이터를 입력 (이름, 성별, 나이, 주민번호) (무조건 다바꿀거임, 안그러면 복잡해서)
				// DAO객체 생성->updateMember();
				// 수정된 정보 출력			
			case 4: //삭제 
				System.out.println("삭제");
				// 삭제하고자하는 idx, name을 입력
				System.out.println("수정하고싶은 idx번호, name를 입력하세요");
				
				String num2 = scan.nextLine();
				int idx2 = scan.nextInt();
				
				// 두개의 정보가 일치하는 경우에만 삭제
			
				dao.deleteMember(idx2, num2);
				
				/// showMemberList(num, idx2);
				
			default:
				break;
			}

			System.out.println("로드 완료");

		}

	}

}
