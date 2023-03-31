package sec5;
//Math : static 클래스로, 객체 생성 없이 사용
public class MathEx1 {
	public static void main(String[] args) {
		int a = 1004;
		float b = 3.14f;
		long c = 6553600;
		double d = 26500.3425d;
		
		int e = -1004;
		float f = 3.65f;
		long g = -6553600;
		double h = 26500.7425d;
		
		System.out.println("지수상수 : "+Math.E);
		System.out.println("원주율 : "+Math.PI);
		System.out.println("절대값 : a="+Math.abs(a)+", e="+Math.abs(c));
		System.out.println("올림값 : b="+Math.ceil(b)+", f="+Math.ceil(f));
		System.out.println("내림값 : b="+Math.floor(b)+", f="+Math.floor(f));
		System.out.println("반올림값 : b="+Math.round(b)+", f="+Math.round(f));
		System.out.println("최대값 : "+Math.max(a, b));
		System.out.println("최소값 : "+Math.min(a, b));
		System.out.println("랜덤값 : "+Math.random());
		
		System.out.println("제곱값 : "+Math.pow(a, 2));
		System.out.println("제곱근 : "+Math.sqrt(a));
		System.out.println("사인(sin) : "+Math.sin(30));
		System.out.println("코사인(cos) : "+Math.cos(30));
		System.out.println("탄젠트(tan) : "+Math.tan(30));
	}

}
