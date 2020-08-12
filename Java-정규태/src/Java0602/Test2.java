package Java0602;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Test2 {

	public static void main(String[] args) {

		int data = 0;
		InputStream myIn = System.in;
		
		OutputStream myOut = System.out;
		
		try {
			while((data = myIn.read() ) != -1) {
				// System.out.println((char)data);
				// myOut.print(data); // X
				myOut.write(data);// 강제형변환 필요x, 한글 안깨짐
			}
		} catch (IOException e) {
			System.out.println("입력 관련 오류 발생!"); 
			e.printStackTrace();
		}

		// OutputStream 클래스 
		// 1) 추상클래스, 2) 바이트 출력스트림의 최상위 클래스 
		
		
		
		
	}

}
