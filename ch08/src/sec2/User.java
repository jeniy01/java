package sec2;
//인터페이스 = 완전추상체
//인터페이스 안의 메소드는 무조건 다 추상메소드
public interface User {
	public String FIELD1 = "이동혁";	//인터페이스 안의 기본 필드는 상수(final static)
	public String method1();	//추상메소드
	public int method2();
	default void play1(){	//인터페이스 안에서 구현메소드 만드는 법 1 - 호출 불가
		System.out.println("재생합니다.1");
	}
	static void play2(){	//인터페이스 안에서 구현메소드 만드는 법 2 - 인터페이스로 직접 호출 가능
		System.out.println("호출합니다.1");
	}
}
