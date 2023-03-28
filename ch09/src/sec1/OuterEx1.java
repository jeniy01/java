package sec1;

public class OuterEx1 {
	public static void main(String[] args) {
		Outer out = new Outer();	//외부 클래스로 부터 객체 생성
		Outer.Inner1 in = out.new Inner1();	//내부 클래스로 부터 객체 생성
	}
}
