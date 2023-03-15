package sec1;

public class Example5 {

	public static void main(String[] args) {
		//short
		short a = 1234;
		short b = 4321;
		short c = -30000;
		short d = 32000;
		short e = -0;
		byte f = 124;
		Short g = a;
		Byte i = f;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
		System.out.println("f="+f);
		System.out.println("a 자료형 : "+g.getClass().getName());
		System.out.println("f 자료형 : "+i.getClass().getName());
		System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println("a 메모리 주소 : "+System.identityHashCode(a));
		
	}

}
