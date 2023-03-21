package sec1;
//최상위클래스 = 슈퍼클래스 = 부모클래스
public class Animal {
	private String type;
	private String name;
	private String color;
	private boolean spine;
	private int legs;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isSpine() {
		return spine;
	}
	public void setSpine(boolean spine) {
		this.spine = spine;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public void cry(){
		System.out.println("동물이 웁니다.");
	}
}
