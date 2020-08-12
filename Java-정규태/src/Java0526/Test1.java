package Java0526;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Test1 {

	public static void main(String[] args) {
		// List - Vector 클래스
		Vector vec = new Vector(); // 공간의 크기 : 10
		
		System.out.println(" 백터의 크기 : "+vec.size());
		System.out.println(" 백터의 용량 : "+vec.capacity());
		
		for(int i=0;i<10;i++)
			vec.add(i*10);
		System.out.println("------------------------------");
		System.out.println(" 백터의 크기 : "+vec.size());
		System.out.println(" 백터의 용량 : "+vec.capacity());

		vec.add(1000);
		System.out.println("------------------------------");
		System.out.println(" 백터의 크기 : "+vec.size());
		System.out.println(" 백터의 용량 : "+vec.capacity());
		
		System.out.println("---------------------------------");
		Vector vec2 = new Vector(4, 3);
		
		System.out.println(vec2.size());
		System.out.println(vec2.capacity());
		
		for(int i=0;i<5;i++)
			vec2.add(i);
		System.out.println("---------------------------------");
		System.out.println(vec2.size());
		System.out.println(vec2.capacity());
		
		System.out.println(vec2);
		System.out.println("----------------------------------");
		// 벡터의 요소 출력
	    System.out.println( vec2.firstElement());
	    System.out.println( vec2.lastElement());
	    System.out.println( vec2.get(1));
		
	    System.out.println("----------------------------------");
	    
	    double[] arr = new double[]{38.6, 9.2, 45.3, 6.1, 7.4, 1.6};
	    
	    // 배열의 모든 요소의 값을 백터 객체를 생성해서 값을 옮겨 담기
	    Vector v = new Vector();
	    
	    // v.add(arr[0]);
	    for(int i=0;i<arr.length;i++){
	    	v.add(arr[i]);
	    }
	    // 백터의 모든 요소를 출력 (toString(),get(),iterator)
	    System.out.println(v);
	    System.out.println(v.toString());
	    
	    for(int i=0;i<v.size();i++){
	    	System.out.print(v.get(i)+" ");
	    }
	    System.out.println();
	    
	    Iterator iter = v.iterator();
	    while(iter.hasNext()){
	    	System.out.print(iter.next()+" ");
	    }
		System.out.println();
		
		// Vector/HashTable,map
		Enumeration Enum = v.elements();
		while(Enum.hasMoreElements()){
			System.out.print(Enum.nextElement()+" ");
		}
		System.out.println();
		
		System.out.println("---------------------------");
		// 데이터 삽입
		v.add(3.123);
		System.out.println(v);
		v.add(1	, 1.111);
		System.out.println(v);
		v.add(6.1);
		System.out.println(v);
		
		System.out.println("---------------------------");
		// 데이터 검색
		
		double searchData = 66.1;
		int result = v.indexOf(searchData);
		// indexOf(값) : 해당 값의 인덱스를 리턴, 없을경우 -1 리턴 
		System.out.println("result : "+result);
		
		
		if (result != -1) {
			System.out.println("인덱스가 있네요");
			System.out.println(result);
		}else {
			System.out.println(searchData + "라는 인덱스가 없네요");
		}
		System.out.println("---------------------------");
		// 데이터 삭제
		double delDate = 45.3;
		
		if(v.contains(delDate)) { // constains 메서드 -> 백터에 값이 포함되어 있으면 t / f
			System.out.println(delDate + "라는 데이터를 지웠습니다");
			v.remove(delDate);
			System.out.println("삭제 완료");
		}
		
		System.out.println(v);
		
		

	}

}
