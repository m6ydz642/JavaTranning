package Java0605;
import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.Date;


// 객체 직렬화 위한 클래스 설계
class ItwillMember implements Serializable, Externalizable{

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}


	
	
}


public class Test4 {

	public static void main(String[] args) {
		// 스트림은 문자단위 출력 기반의 형태 
		// -> 텍스트 전체출력 기반의 형태 : PrintStream 클래스 
		// print(), println()
		try {
			PrintStream ps =  new PrintStream("흠.txt");
			ps.println("흠");
			ps.println("흠");
			ps.println("흠");
			ps.println("흠");
			
			ps.close();
			
			// * 객체 직렬화 :  데이터를 한줄로 만들어서 스트림을 통해서 전달
			// 객체를 파일이나, 네트워크상으로 출력하면 객체를 연속된바이트의 형태로 변경
			
			// 객체 입출력 스트림 : 객체 전체를 저장해서 객체 단위로 전달하는 입출력 스트림
			// ObjectInputStream / ObjectOutputStream
			
			String name = new String("오잉");
			Date today = new Date();
			
			
			FileOutputStream fos = new FileOutputStream("Object.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(name);
			oos.writeObject(today);
			oos.flush();
			oos.close();
			fos.close();
			System.out.println("객체 전달 성공");
			
 			
			
		} catch (Exception e) {
			System.out.println("어휴 이놈의 예외처리 ㅡㅡ;");

			e.printStackTrace();
		}finally {
			
		}
		

	}

}
