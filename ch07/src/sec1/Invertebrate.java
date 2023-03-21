package sec1;
//무척추동물
public class Invertebrate extends Animal {
	private String plankton;	//먹이-새로 추가된 멤버
	private String place;	//사는 곳-새로 추가된 멤버
	
	public String getPlankton() {
		return plankton;
	}
	public void setPlankton(String plankton) {
		this.plankton = plankton;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	@Override
	public void cry() {
		System.out.println("무척추동물이 웁니다.");
	}
}
