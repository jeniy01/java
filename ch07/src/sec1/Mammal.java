package sec1;
//척추동물
//Animal의 자식클래스 = 서브클래스
public class Mammal extends Animal {
	private String foods;	//먹이-새로 추기된 멤버
	private String birthType;	//난생/태생/반태생-새로 추가된 멤버
	/*
	상속 받은 멤버 필드
	private String type;
	private String name;
	private String color;
	private boolean spine;
	private int legs;
	
	상속 받은 메소드
	getter/setter/cry
	*/
	public String getFoods() {
		return foods;
	}

	public void setFoods(String foods) {
		this.foods = foods;
	}

	public String getBirthType() {
		return birthType;
	}

	public void setBirthType(String birthType) {
		this.birthType = birthType;
	}
	
	//오버라이딩 : 상속 받은 메소드에 대하여 처리할 내용을 새로 기술하는 것
	@Override	//상속받은 다음에 내용을 달리 하고 싶으면 override하기
	public void cry() {
		System.out.println("척추 동물이 웁니다.");	//여길 super에서 바꿔주기
	}	
}
