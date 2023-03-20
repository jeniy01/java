package sec4;

public class Calculator {	//정적 클래스 : 정적 멤버로만 구성되어 있는 클래스로, 객체생성을 할 필요가 없다.
	static double pi = 3.14159;	//정적 필드
	static int plus(int x, int y){ return x+y;}	//정적 메소드
	static int minus(int x, int y){ return x-y;}
	static int multi(int x, int y){ return x*y;}
	static double div(int x, int y){ return (float) x/y;}
}
