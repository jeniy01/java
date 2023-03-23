package sec1;
//추상화 클래스 : 클래스를 만들 때 구체적인 내용을 기술하게 되면, 오히려 재사용성이 떨어진다.
//왜냐하면, 상위클래스에서 미리 구체적으로 기술한다면, 자식클래스에서 더 많이 수정해야 하기 때문이다.
//필드는 값을 설정하지 않고, 메소드는 구현 내용을 미리 기술하지 않고 선언만 한다.
//추상화클래스는 메소드에서 일반메소드일 경우는 그 구현할 내용을 기술해야 하고, 추상메소드일 경우는 선언만 하여, 그 구현 내용을 자식 클래스에서 구현할 수 있게끔 해야 한다.
public abstract class Abstract1 {
	public String field1;
	public int field2;
	public abstract String method1();	//추상화 : 선안만 한다.
	public String method2(){	//일반화 : 구현내용을 기술해야 한다.
		return "메소드2";
	}
}
