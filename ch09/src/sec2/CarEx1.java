package sec2;

public class CarEx1 {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.run1();
		
		car.run2();
		
		//익명의 객체로 roll 메소드를 오버라이딩하여 전달
		car.run3(new Tire(){	//Car 안에 있는 tire4에 roll의 내용을 오버라이딩하여 전달
			@Override
			public void roll() {
				System.out.println("Tire를 매개변수로 하는 타이어가 굴러갑니다.");
			}
		});
	}
}
