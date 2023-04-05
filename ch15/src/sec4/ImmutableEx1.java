package sec4;

public class ImmutableEx1 {
	public static void main(String[] args) {
		MutablePerson person1 = new MutablePerson(27, "이다영");
		person1.age = 28;
		person1.name = "이지영";
		
		ImmutablePerson person2 = new ImmutablePerson(27, "이다영");
		//person2.age = 28;	//age가 private final로 설정 되어 있으므로 생성시의 값을 변경하지 못함
		//person2.name = "이지영";

		System.out.println(person1.age);
		System.out.println(person1.name);
		System.out.println();
		System.out.println(person2.getAge());
		System.out.println(person2.getName());
	}
}
