package Java0529;

import java.util.Set;
import java.util.Vector;

public class Test4 {

	public static void main(String[] args) {
		Vector<Integer> 키 = new Vector<Integer>();

		키.add(120); // 2000년도
		키.add(122);
		키.add(125);
		키.add(130);
		키.add(139);
		키.add(160);
		키.add(169);
		키.add(173);
		키.add(175);
		키.add(177); // 2009년도
		// Set<Integer> 년도 = ;
		
		System.out.println(키);
		int max = 키.get(1) - 키.get(0);
		int sum=0;
		int sum2=0;
		int year = 0;
		
	// System.out.println(키.get(1) - 키.get(0));
	
	
		for (int i=0; i<9; i++) {
			
		
			int tmp=(키.get(i+1) - 키.get(i));
			
			if (max < tmp) {
				max = tmp;
				System.out.println(max);
			}
		
		}
		System.out.println("많이 자란 년도의 키" + max);
	}

}
