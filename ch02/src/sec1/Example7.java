package sec1;

public class Example7 {

	public static void main(String[] args) {
		//long
		long a = 123456789000L;
		long b = 365L;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("long타입 표현범위");
		System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		System.out.println("a의 메모리 주소 : "+System.identityHashCode(a));
	}

}
