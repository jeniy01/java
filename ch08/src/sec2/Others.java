package sec2;

public class Others implements Mix{

	@Override
	public String method1() {
		return "기타";
	}
	@Override
	public int method2() {
		return 2;
	}
	@Override
	public String method3() {
		return "접근";
	}
	@Override
	public int method4() {
		return 4;
	}
	@Override
	public void method5() {
		System.out.println("생성자");
	}
	@Override
	public void method6() {
		System.out.println("함수");
	}
}
