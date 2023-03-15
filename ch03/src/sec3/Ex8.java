package sec3;

public class Ex8 {
	public static void main(String[] args) {
		double c=5.0;
		double y=0.0;
		double z=5%y;
		
		if(Double.isNaN(z)){ //isNaN(), isInfinite()
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result=z+10;
			System.out.println("결과 : "+result);
		}
	}

}
