package Java0416;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Test1 {

	public static void main(String[] args) {

		// 2차원 배열 (다차원 배열)
		// -> 반복문의 개수 증가 : 이중for 다중 for
		// 1.new 연산자
		// 2. 직접 초기화
		// 5X3 행렬을 표현하기 위한 2차원 배열 생성(정수형)

		// int[][] arr = new int[5][3];
		// int arr[][] = new int[5][3];
		int[] arr[] = new int[5][3]; 	// 데이터 타입에 있던 이름에 있던 상관없음

		arr[0][0] = 10; arr[0][1] = 90; arr[0][2] = 70; // 0행
		arr[1][0] = 60; arr[1][1] = 80; arr[1][2] = 56; // 1행
		arr[2][0] = 55; arr[2][1] = 60; arr[2][2] = 85; // 2행
		arr[3][0] = 90; arr[3][1] = 75; arr[3][2] = 95; // 3행
		arr[4][0] = 60; arr[4][1] = 30; arr[4][2] = 80; // 4행

		
	// 2차원 배열의 모양 그대로 출력 
		for (int row=0; row<5; row++) { // row : 0~4까지
			for (int col=0; col<3; col++) {
				// 총 실행 횟수 15
				System.out.printf("[%d.%d]줄 = ", row,col);
				System.out.print("[" + arr[row][col] + "]" + " ");
			}
			System.out.println("");
		}
		
		System.out.println("---------------------------------------------------");
		
		int arr2[][] = {
				{80,70,60}, // 0행
				{80,60,70}, // 1행
				{90,80,70}, // 2행
				{30,50,60}, // 3행
				{20,75,70},	// 4행	
		};

		for (int row=0; row<5; row++) { // row : 0~4까지
			for (int col=0; col<3; col++) {
				// 총 실행 횟수 15
				System.out.printf("[%d.%d]줄 = ", row,col);
				System.out.print(arr2[row][col]+ " ");
			}
			System.out.println("");
		}
		

		// 과목 총점, 학생 총점
		// 가로 3개 더함
		// 세로(과목별 점수) 만 더함
		int sum=0, sum2=0;

		int score[][] = {
				{80,70,60}, // 0행
				{80,60,70}, // 1행
				{90,80,70}, // 2행
				{30,50,60}, // 3행
				{20,75,70},	// 4행	
		};
		for (int student=0; student<5; student++) { // row : 0~4까지
		sum = 0;
			for (int class2=0; class2<3; class2++) {
				sum += score[student][class2];
				
				// sum2 += score[student][class2]; // 컬럼만
				System.out.print( sum + " ");
			}
			System.out.println( (student +1) + "번 학생 : " + sum);
			System.out.println("");
		}
		System.out.println("-----------------------------------");
		// 과목별 점수 출력
		int []subject = new int[3];
		
		for (int student=0; student<3; student++) { // 0~2까지
			sum = 0;
				for (int class2=0; class2<5; class2++) {
				// 열별로 정보를 저장
					subject[student] += score[class2][student];
				}
				System.out.println( "과목 총합 : " + subject[student]);
	}
		System.out.println("-----------------------------------");
		
		// 배열의 선언, 초기화 모습 (o,x)
		/* 
		 * 1. int[] arr[];   (O)
		 * 2. int[] arr = {1,2,4,}; (O)
		 * 3. int[] arr = new int[5]; (O)
		 * 4. int[] arr = new int[4] {1,2,3,4}; (x)
		 * 4-1  int[] arr = new int[] {1,2,3,4};  (O)
		 * 5. int arr[5]; (x)
		 * 6. int arr[] = new int [3][]; (O)
		 * 6-1. int arr[] = new int [][3]; (x)
		  */
		
		int [][] arr3 = {
				{5,5,5,5},
				{10,10,10},
				{20,20,20,20},
				{30,30}
		};
		 
//		for (int i=0; i<5; i++) {
//			
//				for (int j=0; j<5; j++) {
		
//				}
		System.out.println(arr3[3].length);		
				// -> 배열이름[위치].legnth : (2차원배열)해당 행의 길이를 측정 
		System.out.println(arr3.length);
				// -> 배열이름.length : (2차월배열) 행의 개수를 측정
		
		System.out.println("-----------------------------------");
//	}
		
		// 2차원 배열의 모든 요소의 합, 평균
		int [][] arr4 = { 
				{5,5,5,5},
				{10,10,10,10},
				{20,20,20,20},
				{30,30,30,30}
		};
		sum =0;
		double average=0;
		for (int i=0; i<4; i++) {

			for (int j=0; j<4; j++) {
				sum += arr4[i][j];	
			}
			average = sum / 16;
		
		}
		System.out.println("합" + sum);
		System.out.println("평균" + average);
		// * int 보다 크기가 작은 데이터타입의 경우 연산시 int(기본형) 변경후 연산
		// 데이터 그기가 큰쪽에 따라 연산이 처리됨
		//  int / double => double
		
		
		sum =0 ;
		int[] arr5 = {10,20,30,40,50};
		// 합 출력 
		for (int i=0; i<=4; i++) {
			sum += arr5[i];
		}
		System.out.println(sum);
		}
		
	}

