package sec4;

public class CalEx1 {

	public static void main(String[] args) {
		//Calculator는 객체 생성이 필요 없는 static으로만 구성되어 있어 객체 생성을 할 필요가 없음
		double circle_area = 10*10*Calculator.pi;
		System.out.println("반지름이 10인 원의 넓이 : "+circle_area);
		int res1 = Calculator.plus(10, 20);
		System.out.println("더한 결과 : "+res1);
		int res2 = Calculator.minus(40, 20);
		System.out.println("뺀 결과 : "+res2);
		int res3 = Calculator.multi(36, 17);
		System.out.println("곱한 결과 : "+res3);
		double res4 = Calculator.div(36, 15);
		System.out.println("나눈 결과 : "+res4);
	}

}
