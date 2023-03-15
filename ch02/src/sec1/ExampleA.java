package sec1;

public class ExampleA {

	public static void main(String[] args) {
		//double
		double a = 123.456; //float로 간주
		double b = 123.456d; //double
		double c = 'Q'; //Q에 해당하는 81.0으로 대입
		double d = 0764.321; //8진수 float로 대입
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("double의 표현범위 : ");
		System.out.println(Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		System.out.println("double의 바이트 수 : "+Double.BYTES);
	}

}
