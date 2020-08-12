import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

import org.omg.CORBA.portable.InputStream;
public class Test2 {

	public static void main(String[] args) {

		try {
			// URL url = new URL("https://www.naver.com/index.html");
			URL url = new URL("http://www.itwillbs.co.kr/index.html");
			
			System.out.println(" URL 프로토콜 : "+url.getProtocol());
			System.out.println(" URL 포트 : "+url.getPort());
			System.out.println(" URL 호스트명 : "+url.getHost());
			System.out.println(" URL 파일위치 : "+url.getFile());
			
			System.out.println("----------------------------------");
			
			InputStream in;
			try {
				in = (InputStream) url.openStream();
				InputStreamReader reader = new InputStreamReader(in);				
				BufferedReader buffer = new BufferedReader(reader); 
				
				String str = "";
				while( (str=buffer.readLine()) != null) {
					System.out.println(str);
					
				}
				
				System.out.println("----------------------------------");
				
				// 인코딩 - 디코딩
				String testData = "Java안녕하세요 12345";
				
			String endcodeStr =	URLEncoder.encode(testData, "UTF-8");
			String decodeStr = URLDecoder.decode(endcodeStr, "UTF-8");	
			
				System.out.println("원본 : " + testData);
				System.out.println("인코딩 : " + endcodeStr);
				System.out.println("인코딩 : " + decodeStr);
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		} catch (MalformedURLException e) {
			

			e.printStackTrace();
		}
		
	}

}
