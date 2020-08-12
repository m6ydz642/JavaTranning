package Java0602;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test5 {

	public static void main(String[] args) throws IOException {
		// 파일 출력
		// FileOutputStream 클래스 (파일 생성)
		
		int data = 0;
		// 파일 생성 (출력 결과)
		

		//File result = new File("test.txt");
		// File result = new File("C:\\Users\\ITWILL\\Desktop\\NEWHELLO.txt"); // 강사님 경로
		
		File result = new File("test.txt");
		
		FileOutputStream fis = new FileOutputStream(result);
		
		while((data = System.in.read()) != -1) {
			fis.write((char)data);
			
		}
		

	}

}
