package sec1;

public class Example8 {

	public static void main(String[] args) {
		//char
		char a = 'A';
		char b = 65;
		char c = '가';
		char d = 44032;
		int e = Character.MIN_VALUE;
		int f = Character.MAX_VALUE;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("character의 바이트 크기 : "+Character.BYTES);
		//character의 표현범위
		System.out.println(e+"~"+f);
	}

}
