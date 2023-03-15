package sec1;

public class Example1 {
	public static void main(String[] args) {
		//산술연산자(+, -, *, /, %)
		int a=100;
		int b=140;
		
		int c=a+b;
		System.out.println("a+b="+c);
		int d=a-b;
		System.out.println("a-b="+d);
		int e=a*b;
		System.out.println("a*b="+e);
		float f=(float)b/a;
		System.out.println("b/a="+f);	//나누기(형변환 주의)
		int g=b%a;
		System.out.println("b%a="+g);	//나눈 나머지
		int h=b/0;	//Infinity 부정 연산자
		System.out.println("b/0="+h);
		int i='김'/b;	//NaN(Not a Number) 불능 연산자
		System.out.println("김/b="+i);
	}

}
