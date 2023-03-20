package sec2;

public class CarEx1 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.company = "도요타";
		car1.model = "프리우스";
		car1.cc = 3000;
		car1.startUp();
		for(int i=0;i<71;i++){
			car1.speedUp();
		}
		System.out.println("현재 속도 : "+car1.speed);
		for(int i=0;i<71;i++){
			car1.speedDown();
		}
		System.out.println("현재 속도 : "+car1.speed);
		car1.turnOff();
	}	
}