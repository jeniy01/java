package sec2;

public class Customer {
	private String name;
	private String tel;
	private String email;
	private String addr;
	private int age;
	
	//생성자함수
	public Customer(){}
	public Customer(String name){
		this.name = name;
	}
	public Customer(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public Customer(String name, String tel, String email) {
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	public Customer(String name, String tel, String email, String addr) {
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.addr = addr;
	}
	public Customer(String name, String tel, String email, String addr, int age) {
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.addr = addr;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void getCustom(){
		System.out.println("고객님 감사합니다.");
	}
}
