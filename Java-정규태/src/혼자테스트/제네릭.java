package 혼자테스트;

class 제네릭테스트<ㅈㄴㄹ> { // 제네릭 변수
	private ㅈㄴㄹ 제네릭;

	public ㅈㄴㄹ get제네릭() {
		return 제네릭;
	}

	public void set제네릭(ㅈㄴㄹ 제네릭) {
		this.제네릭 = 제네릭;
	}
}

public class 제네릭 {

	public static void main(String[] args) {
		제네릭테스트<String> 테스트 = new 제네릭테스트();
		테스트.set제네릭("흠 잘되넹");
		System.out.println(테스트.get제네릭());
		
// https://ict-nroo.tistory.com/42
	}

}
