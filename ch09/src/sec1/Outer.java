package sec1;

public class Outer {
	class Inner1 { }	//인스턴스 멤버 클래스 : 외부 클래스의 객체를 생성하고, 그 후에 내부 클래스의 객체를 생성해야함
	Inner1 in1 = new Inner1();	//인스턴스 멤버 인스턴스
	Outer() {
		Inner1 in2 = new Inner1();
	}
	
	void method() {
		Inner1 in3 = new Inner1();
	}
}
