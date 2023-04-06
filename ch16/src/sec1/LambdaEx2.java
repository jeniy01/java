package sec1;
@FunctionalInterface
interface MyFnc2 {	//매개변수는 없고, 반환(리턴)이 있는 람다식
	int fnc2();
}
public class LambdaEx2 {
	public LambdaEx2() {
		MyFnc2 f1 = () -> {return 1004;};
		System.out.println("결과1 : "+f1.fnc2());
		MyFnc2 f2 = () -> {return 7979;};
		System.out.println("결과2 : "+f2.fnc2());
	}
	public static void main(String[] args) {
		new LambdaEx2();
	}
}
/*
매개변수와 반환(리턴)이 없는 람다식 : 
	1. 선언부
	@FunctionalInterface
	interface 인터페이스명 {
		void 메소드명();
	}
	2. 구현부
	인터페이스명 객체명 = () -> {실행내용;}
	객체명.메소드명();
	
매개변수는 없고 반환(리턴)이 있는 람다식 :
	1. 선언부
	@FunctionalInterface
	interface 인터페이스명 {
		반환타입 메소드명();
	}
	2. 구현부
	인터페이스명 객체명 = () -> {return 반환값;}
	객체명.메소드명();
*/