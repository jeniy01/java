package sec1;
//함수적 인터페이스 -> 람다식
public class LambdaEx4 {
	@FunctionalInterface	//매개변수도 있고, 반환(리턴)도 있는 람다식
	public interface MyFnc4{
		int getCalc(int n1, int n2);
	}
	public static void main(String[] args) {
		MyFnc4 add = (x, y) -> {return x+y;};
		MyFnc4 sub = (x, y) -> {return x-y;};
		MyFnc4 div = (x, y) -> {return x/y;};
		MyFnc4 mul = (x, y) -> {return x*y;};
		
		System.out.println("더한 결과 : "+add.getCalc(124, 428));
		System.out.println("뺀 결과 : "+sub.getCalc(436, 129));
		System.out.println("나눈 결과 : "+div.getCalc(1248, 42));
		System.out.println("곱한 결과 : "+mul.getCalc(38, 87));
	}
}
/*
매개변수와 반환(리턴)이 있는 람다식 : 
	1. 선언부
	@FunctionalInterface
	interface 인터페이스명 {
		반환타입 메소드명(매개변수타입 매개변수1, ..);
	}
	2. 구현부
	인터페이스명 객체명 = (매개변수1, ..) -> {실행문; return 반환값;}
	반환타입 변수 = 객체명.메소드명(값1, ..);
	또는
	System.out.println(객체명.메소드명(값1, ..));
	
	구현부는 별도의 클래스, 생성자, 내부의 인터페이스 등의 여러 방법으로 본인이 원하는 곳에 하면 된다.
*/