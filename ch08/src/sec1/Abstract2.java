package sec1;

public class Abstract2 {
	public String field1;
	public int field2;
	//public abstract String method1();//추상화 메소드 선언 불가 - Abstract2가 추상화클래스가 아닌 일반클래스이므로 메소드를 추상화 할 수 없다.
	public String method2(){	//일반화 : 구현내용을 기술해야 한다.
		return "메소드2";
	}
}
