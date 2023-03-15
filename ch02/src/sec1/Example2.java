package sec1;

public class Example2 {
	public static void main(String[] args) {
		//java의 기본 자료형(primitive type) : 하나의 자료만 저장할 수 있음
		//변수는 반드시 초기화 되어야 한다.
		//byte, bool, short, int, long, float, double, char
		//String
		byte a=127; //1byte(-128~127)
		boolean b=true; //1byte(true, false)
		short c=30000; //2byte(-2의 15승~+2의 15승-1)
		int d=65536; //4byte(-2의 31승~+2의 31승-1)
		long e=655360000; //8byte(-2의 63승~+2의 63승-1)
		float f=3.14f; //4byte(실수=소숫점 이하가 있는 수)
		double g=3.14d; //8byte(실수)
		//실수 = 부동소수점수(Floating point number)
		char h='k'; //2byte
		char i=65+26;
		System.out.println("i="+i);
	}

}
