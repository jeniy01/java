package sec2;

public class InterfaceEx1 {
	public static void main(String[] args) {
		//User,play1(); 불가능
		//User 인터페이스에서 default로 선언되어 있으므로 객체생성을 통하여 호출 가능
		User us;
		us = new Member();
		us.play1();
		
		User.play2();	//User 인터페이스에서 static으로 선언되어 있으므로 인터페이스로 직접 메소드 호출 가능
		System.out.println(User.FIELD1);	//인터페이스에서 선언된 필드는 final static(상수)로, 객체생성을 하여 사용할 수도 있고, 인터페이스에서 직접 접근하여 사용할 수도 있다.
		
		Member us2;
		us2 = new Member();
		us2.play1();
		//us2.play2(); 객체를 생성하지 않고 User 인터페이스로 직접 호출해야 한다.
		System.out.println(us2.FIELD1);
	}
}
