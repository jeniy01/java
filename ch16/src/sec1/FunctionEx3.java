package sec1;
class MyFunction3 {
	void mathod3(int x, int y){	//매개변수는 있고, 반환(리턴)이 없는 메소드
		System.out.println("x+y="+(x+y));
		System.out.println("x-y="+(x-y));
		System.out.println("x*y="+(x*y));
		System.out.println("x/y="+(x/y));
	}
}
public class FunctionEx3 {
	public static void main(String[] args) {
		MyFunction3 fnc3 = new MyFunction3();
		fnc3.mathod3(120, 33);
	}
}
