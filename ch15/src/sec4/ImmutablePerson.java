package sec4;
//Immutable Collection FrameWork : 객체 생성시에만 값이 저장되고, 그 값을 변경할 수 없도록 하는 컬렉션 프레임워크
//각 필드가 private final로 구성하고, 각 필드의 접근을 위한 getter/setter 메소드를 만들지 않는다.
public class ImmutablePerson {
	private final int age;
	private final String name;
	public ImmutablePerson(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}
