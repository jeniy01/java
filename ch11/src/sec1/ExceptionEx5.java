package sec1;
//ArithmeticException (산술연산예외) : 부적절한 연산을 하는 경우 발생하는 예외
public class ExceptionEx5 {
	public static void main(String[] args) {
		int a = 0;
		int b = 40;
		try {
			System.out.println(b/a);
		} catch(ArithmeticException e){
			System.out.println("부적절한 연산이 실행되었습니다.");
		}
	}
}
