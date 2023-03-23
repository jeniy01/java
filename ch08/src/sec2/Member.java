package sec2;
//클래스로부터 클래스로 상속받을 경우 : extends
//인터스페이스로부터 클래스로 상속받을 경우 : implements
//인터페이스로부터 인터스페이스로 상속받을 경우 : extends
//클래스로부터 인터스페이스로 상속받을 경우 : 불가능 - 클래스는 구현체이고 인터스페이스는 추상체이기 때문
//다중 상속 : 여러 인터페이스로부터 상속받은 인터페이스 : extends
public class Member implements User{
	@Override
	public String method1() {
		return "회원";
	}
	@Override
	public int method2() {
		return 2;
	}
}
