package Java0602;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test6 {

	public static void main(String[] args) throws IOException {
	
		File result = new File("Test1_copy.java");
		String path= "C:\\Users\\ITWILL\\OneDrive\\아이티윌 자료\\workspace_java6\\Java-정규태\\Java-정규태\\src\\Java0602\\Test1.java";
		
		FileInputStream fis = new FileInputStream(path);
		FileOutputStream copy = new FileOutputStream(result);
		
	
		try {
		
		int data = 0;
		int size = 0;
		
		
		while(	(data=fis.read()) != -1	) {// read()의 입력값이 없을경우 -1
		//	System.out.println(fis.read() + "");
			copy.write((char)data);
		}
		
		} catch (Exception e) {
		System.out.println("오류가 발생했다네" + e);	
		}
			finally { // 무조건
				
				fis.close(); // 자원해제
				copy.close(); // 자원해제	
		}
	}

}
