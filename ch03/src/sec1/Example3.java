package sec1;

public class Example3 {
	public static void main(String[] args) {
		//부호연산자 및 증감연산자
		int a=30;
		int b=50;
		int c=a-b;
		c=-c;	//부호연산자 -
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		int sw=1;
		System.out.println("sw="+sw);
		sw=sw*-1;	//부호연산자 -1
		System.out.println("sw="+sw);
		sw=sw*-1;
		System.out.println("sw="+sw);
		
		a=20;
		b=20;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println(a++);	//증가식 : a=a+1 : 후위연산으로 먼저 출력 후에 a를 1 증가
		System.out.println(++b);	//증가식 : b=b+1 : 전위연산으로 먼저 b를 1 증가 후에 출력
		int x=20;
		int y=20;
		System.out.println("x--="+x);	//감소식 : x=x-1 : 후위연산으로 먼저 출력 후에 a를 1 감소
		System.out.println("--y="+y);	//감소식 : y=y-1 : 전위연산으로 먼저 y를 1 감소 후에 출력
	}

}
