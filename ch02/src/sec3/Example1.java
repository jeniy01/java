package sec3;

public class Example1 {
	public static void main(String[] args) {
		int i = 236;
		char c = 'K';
		char d = 'I';
		char e = 'M';
		String s = "Kim";
		float f = 3.14f;
		double h = 300.1234d;
		System.out.printf("i를 10진수로 출력 : %d\n", i);
		System.out.printf("i를 참/거짓 출력 : %b\n", i);
		System.out.printf("i를 8진수로 출력 : %o\n", i);
		System.out.printf("i를 16진수로 출력 : %X\n", i);
		System.out.printf("i를 16진수로 출력 : %x\n", i);
		//System.out.printf("i를 지수 형태로 출력 : %e\n", i);
		System.out.printf("%c%c%c", c, d, e);
		System.out.printf("문자열 : %s\n", s);
		System.out.printf("실수1 : %f\n", f);
		System.out.printf("실수2 : %f\n", h);
	}

}
