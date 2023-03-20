package sec1;

public class CarEx1 {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("제조사 : "+car1.getCompany());
		car1.setCompany("기아");
		System.out.println("모델명 : "+car1.model);
		car1.model = "그랜저";
		System.out.println("모델명 : "+car1.model);
		
		//car1의 Body 설정
		Body body1 = new Body();
		System.out.println("기본값 : "+body1.toString());
		body1.setStyle("쿠페");
		body1.setFrendar("투썹");
		body1.setBumper("솔리드");
		car1.setBody(body1);
		
		//car1의 Body 값 불러오기
		Body body2 = new Body();
		body2 = car1.getBody();
		System.out.println(body2.toString());
		
		//car1의 Engine 설정
		Engine eng1 = new Engine();
		System.out.println("기본값 : "+eng1.toString());
		eng1.setFue1("디젤");
		eng1.setCc(3500);
		eng1.setDisplace(4);
		car1.setEngine(eng1);
		
		//car1의 Engine 값 불러오기
		Engine eng2 = new Engine();
		eng2 = car1.getEngine();
		System.out.println(eng2.toString());
		
		//car1의 Tire 설정
		Tire tire1 = new Tire();
		System.out.println("기본값 : "+tire1.toString());
		tire1.setName("금호타이어");
		tire1.setCount(4);
		car1.setTire(tire1);
		
		//car1의 Tire 값 불러오기
		Tire tire2 = new Tire();
		tire2 = car1.getTire();
		System.out.println(tire1.toString());
		
	}

}
