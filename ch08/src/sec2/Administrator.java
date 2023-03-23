package sec2;

public class Administrator implements User{
	@Override
	public String method1() {
		return "관리자";
	}
	@Override
	public int method2() {
		return 3;
	}
}
