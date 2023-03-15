package sec1;

public class Example2 {
	public static void main(String[] args) {
		//대입연산자
		int a=10;
		int b=15;
		System.out.println("a="+a);
		System.out.println("b="+b);
		a+=3;	//a=a+3
		b-=3;	//b=b-3
		System.out.println("a="+a);
		System.out.println("b="+b);
		a*=3;	//a=a*3 //바로 위에서 나온 a값을 대입
		b/=3;	//b=b/3	//바로 위에서 나온 b값을 대입
		System.out.println("a="+a);
		System.out.println("b="+b);
		a%=2;	//a=a%2	//바로 위에서 나온 a값을 대입
		
		int c=40;
		int d=40;
		c>>=2;	//c값에서 나누기 2씩 두 번
		d<<=2;	//d값에서 곱하기 2씩 두 번
		System.out.println("c>>=2 : "+c);
		System.out.println("d<<=2 : "+d);
	}

}
