package Java0602;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test3 {

	public static void main(String[] args) {
		// 키보드 입력을 바이트 스트림의 형태로 입력받아서
				// 화면에 출력하는 프로그램을 작성
				// * InputStream,OutputStream 객체를 사용
				// * 혹시나 키보드 입력값중에서 'x' 'X' 있을경우 프로그램 종료
				// * 총 입력된 글자수를 출력 
				
		InputStream myIn = System.in;
		OutputStream myOut = System.out;
		int data =0;
		int count=0;
		try {
			while((data = myIn.read() ) != -1) {
				
				if(data == 88 | data == 120) {
					System.out.println(" 엑스가 발견되어 종료합니다");
					System.out.println("총 글자 횟수 : " + count);
					break;
				}
				
				count++;

				myOut.write(data);// 강제형변환 필요x, 한글 안깨짐
				
			
				
			}
		} catch (IOException e) {
			System.out.println("입력 관련 오류 발생!"); 
			e.printStackTrace();
		}
		
		

	}

}
