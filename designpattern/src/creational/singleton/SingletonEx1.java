package creational.singleton;

public class SingletonEx1 {
	public static void main(String[] args) {
		//Singleton(싱글톤) : 하나의 객체만 만들 수 있도록 해당 클래스 내부에서 특정 메소드에 의해서만 객체가 생성할 수 있도록 하는 패턴
		SingleObject object1 = SingleObject.getInstance();
		SingleObject object2 = SingleObject.getInstance();
		
		object1.showMessage();
		object2.showMessage();
		System.out.println(object1==object2);
	}
}
