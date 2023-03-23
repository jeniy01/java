package sec1;

public class AbstractEx1 {
	public static void main(String[] args) {
		//Abstract1 ab1 = new Abstract1(); - 주상클래스는 추상화 되어 있어 구현할 내용이 없으므로 객체를 생성할 수 없다.
		//추상클래스로부터 객체를 생성하기 위해 추상화된 메소드에 대하여 그 구현내용을 오버라이딩을 통해 기술하여 객체를 생성할 수 있다.
		
		//익명의 클래스 만들기
		Abstract1 ab1 = new Abstract1(){	//익명의 클래스를 직접 구현
			@Override
			public String method1(){
				return "익명클래스의 메소드1";
			}
		};
		
		ab1.method1();
		
		method2();	//메소드를 호출하면 추상클래스를 이용한 객체
	}
	
	static void method2(){	//익명의 클래스를 만들기 위한 메소드
		Abstract1 ab1 = new Abstract1(){
			@Override
			public String method1(){
				return "익명클래스의 메소드1";
			}
		};
		ab1.method1();
	}
	
	static void method3(Abstract1 ab1){	//익명의 클래스를 매개변수로 대입하가 위한 메소드
		ab1.method1();
	}
	//추상클래스를 이용하여 객체를 생성하기 위해서는 추상메소드에 대한 구현내용을 기술하면 된다.
}
