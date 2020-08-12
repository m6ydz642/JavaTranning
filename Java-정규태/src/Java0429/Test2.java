package Java0429;

class Rect{
private int width;
private int height;

	public int getWidht() {
		return width;
	}

	public void setWidht(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getArea() {

		return width * height;
	}

	public int Sum(int width, int height) {
		this.height = height;
		this.width = width;
		return width + height;
	}

}

class DrawBox {
	/* 
	 * 사각형 (가로, 세로)을 박스의 형태로 출력하는 객체 DrawBox 
	 * 가로, 세로 길이 사각형의 모양 (그림 그릴 모양 정보)
	 * 그림 그리는 동작(draw) : 저장된 가로 / 세로길이를 바탕으로 해당 모양으로 그림그린다. 
	 * 모양의 정보를 지정하는 동작 : (fill)
	 * 객체 생성시 전달받은 크기로 초기화해서 그림을 그린다.
	 * 전달정보가 하나도 없을 경우 (10*1 사각형을 그린다)
	 * 
	 *(10, 1) - **********
	 *(3, 3)
	 *	  @@@
	 *	  @@@
	 *	  @@@
	 * */
	private int width,height;
	private char ch;

	public DrawBox() {
		width = 10;
		height = 1;
	}
	public DrawBox(int width, int height) {
		this.width = width;
		this.height = height;
		}

	
	public void fill(char c) {
		ch = c;
	}
	
	public void draw() {
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				System.out.println(ch);
			}
			System.out.println("");
		}
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		/* 사각형의 정보를 저장하는 객체 Rect 
		 * width, height
		 * 객체 생성시 초기화 가능, 외부접근 불가능
		 * 사각형의 넓이를 계산하는 동작 (가로 * 세로)
		 * 5개의 사각형을 생성해서 5개 사각형의 넓이의 합을 출력
		 * */
		
		Rect a = new Rect(1,5);
		Rect b = new Rect(2,5);
		Rect c = new Rect(3,5);
		Rect d = new Rect(4,5);
		Rect e = new Rect(5,5);
		
		System.out.println(a.getArea());
		System.out.println(b.getArea());
		System.out.println(c.getArea());
		System.out.println(d.getArea());
		System.out.println(e.getArea());
	
		int sum = a.getArea() + b.getArea() + c.getArea() + d.getArea() + e.getArea();
		System.out.println("합 : " + sum);
		
		Rect[] rect = new Rect[5]; // 객체 배열
		
		rect[0] = a;
		rect[1] = b;
		rect[2] = c;
		rect[3] = d;
		rect[4] = e;
		
		sum = 0;
		for (int i=0; i<rect.length; i++) {
			sum += rect[i].getArea();
		}
		System.out.println("합 : " + sum);
		

		
		Rect r1 = new Rect(20, 30);
	
		DrawBox a1 =  new DrawBox();
		a1.fill('?');
		a1.draw();
		
		DrawBox a2 = new DrawBox(10,20);
		a2.fill('*');
		a2.draw();
	}

}
