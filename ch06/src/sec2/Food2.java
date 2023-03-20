package sec2;

public class Food2 {
	//1. 멤버 필드 : 해당 객체가 갖고 있는 값을 저장(명사)
	private String name;
	private int quantity;
	private int price = 1000;	//필드에 의한 값의 초기화
		
	//3. 생성자 함수 : 생성자 오버로딩을 통한 여러 가지 객체 생성 방법을 제공
	//생성자 함수에 의한 초기화
	public Food2(){	//생성자함수 : this()를 활용한 필드 값의 단계적인 초기화
		this("백반");
	}
	public Food2(String name){
		this(name, 500);
	}
	public Food2(String name, int quantity) {
		this(name, quantity, 10000);
	}
	public Food2(String name, int quantity, int price){
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	//2. 멤버 메소드 : 해당 객체의 기능이나 동작이 일어나도록 하는 멤버(동사)
	public String getName() {
		return name;
	}
	public void setName(String name) {	//setter를 통한 값의 초기화가 가능함
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Food2 [name=" + name + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
}
