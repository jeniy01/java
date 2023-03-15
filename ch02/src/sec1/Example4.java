package sec1;

public class Example4 {
	public static void main(String[] args) {
		//byte
		byte a=127;
		byte b=0;
		byte c=-127;
		byte d=0b110101;
		byte e=-128;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
		System.out.println("byte : "+Byte.BYTES);
		System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println("a 메모리 주소 : "+System.identityHashCode(a));
		System.out.println("b 메모리 주소 : "+System.identityHashCode(b));
		System.out.println("c 메모리 주소 : "+System.identityHashCode(c));
		System.out.println("d 메모리 주소 : "+System.identityHashCode(d));
		System.out.println("e 메모리 주소 : "+System.identityHashCode(e));
	}

}
