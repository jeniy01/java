package sec1;
class MyFunction1 {
	void method1(){	//매개변수와 반환(리턴)이 없는 함수(메소드)
		System.out.println("메소드1을 호출하였습니다.");
	}
}
public class FunctionEx1{
	public static void main(String[] args) {
		MyFunction1 fnc1 = new MyFunction1();
		fnc1.method1();
	}
}