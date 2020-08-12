package Java0605;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) {
		
		// Data 입출력 스트림 : 자바에서 제공하는 기본형타입 (8가지)를 사용해서
		// 입출력 사용가능
		
		boolean b = true;
		char ch = 'A';
		byte by = 10;
		short s = 1000;
		int i = 12312313;
		long l = 123123123123L;
		float f = 3.1234f;
		double d = 3.1231231231231;
		String str = "Hello";
		
		// 파일로 해당 자료형의 데이터를 전달 

		FileOutputStream 파일아웃 = null;
		DataOutputStream 데이터아웃 = null;
		
		try {
			파일아웃 = new FileOutputStream("test.txt");
			데이터아웃 = new DataOutputStream(파일아웃);
			
			데이터아웃.writeBoolean(b);
			데이터아웃.writeChar(ch);
			데이터아웃.writeByte(by);
			데이터아웃.writeShort(s);
			데이터아웃.writeInt(i);
			데이터아웃.writeLong(l);
			데이터아웃.writeFloat(f);
			데이터아웃.writeDouble(d);
			데이터아웃.writeUTF(str);
			
			System.out.println("DataOutStream 객체 사용 출력 완료");
			
			
		} catch (Exception e) {
			System.out.println("오류 발생!");
		} finally {
			try {
				데이터아웃.close();
				파일아웃.close();
				System.out.println("자원 해제 성공");
			} catch (IOException e) {
			}
		}
		

	}

}
