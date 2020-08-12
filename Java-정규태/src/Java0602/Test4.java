package Java0602;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test4 {

	public static void main(String[] args) throws IOException {
		// File : 데이터를 영구적으로 저장하도록 하는 방법
		// File 클래스 : 파일 및 디렉토리(폴더)를 관리하는 클래스 
		// java.io 패키지
		// => 파일 정보를 입력/출력하는 동작 메서드 X		
				
		File f = new File("Test1.java");
		System.out.println(f.getAbsolutePath()); // 절대경로
		System.out.println(f.getCanonicalPath()); // 표준경로
		System.out.println(f.length());
	
		
		//  현재 디렉토리(폴더)의 파일 목록 출력
		// [.][./] -> 현재 폴더
		// [/] -> 최상위 폴더 (root)
		// [../] -> 한단계 상위폴더  
		File f2 = new File("/");
		String[] dirs = f2.list();
		
		for (String s :dirs) {
			System.out.println(s);
		}

		// FileInputStream 클래스 (파일 읽기)
		
		//FileInputStream fis = new FileInputStream("파일객체");
		//FileInputStream fis = new FileInputStream("파일이름(경로)");
		System.out.println("------------------------------------------------");
		
		String path= "C:\\Users\\ITWILL\\OneDrive\\아이티윌 자료\\workspace_java6\\Java-정규태\\Java-정규태\\src\\Java0602\\Test1.java";
		FileInputStream fis = new FileInputStream(path);
		
		int data = 0;
		while(	(data=fis.read()) != -1	) {// read()의 입력값이 없을경우 -1
			
			 System.out.write((char)data);
			//System.out.print(data);
		}
		
	}

}
