package sec3;

public class Parent {
	private String lastName;
	private String firstName;
	private int age;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//자식에게 변화를 허용할 경우
	public void getPrint(){
		System.out.println("부모1");
	}
	//자식에게 변화를 허용하기 싶지 않음
	public final void output(){
		System.out.println("부모2");
	}
}
