package sec1;
//함수적 인터페이스의 람다식
@FunctionalInterface
interface MyFnc3 {	//매개변수는 있고, 반환(리턴)이 없는 람다식
	void fnc3(int a);
}
public class LambdaEx3 {
	public LambdaEx3(){
		MyFnc3 f1 = (a) -> {System.out.println(a+"가 입력되었습니다.");};
		f1.fnc3(100);
		MyFnc3 f2 = (a) -> {System.out.println((a+1004)+"가 연산되었습니다.");};
		f2.fnc3(50);
		MyFnc3 f3 = (a) -> {
			if(a>=80){
				System.out.println("합격");
			} else{
				System.out.println("불합격");
			}
		};
		f3.fnc3(85);
	}
	public static void main(String[] args) {
		new LambdaEx3();
	}
}
/*
	1. 선언부
	@FunctionalInterface
	interface 인터페이스명 {
		void 메소드명();
	}
	2. 구현부
	인터페이스명 객체명 = () -> {실행내용;}
	객체명.메소드명();
*/