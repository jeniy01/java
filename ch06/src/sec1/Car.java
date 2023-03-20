package sec1;

public class Car {
	//멤버필드 - 프리미티브(기본형) 타입
	//필드값에 직접 대입 및 저장하여 초기화
	private String company = "현대";	//제조사
	String model = "제네시스";	//모델명
	String color = "white";	//색상
	int maxSpeed = 400;	//최고속도
	int speed = 0;
	
	//멤버필드 - 레퍼런스 타입
	Body body;	//본체
	Engine engine;	//엔진
	Tire tire;	//타이어
	
	//생성자 함수 생략
	//public Car(){}
	
	//멤버 메서드
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}	
}
