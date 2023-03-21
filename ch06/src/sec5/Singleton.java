package sec5;
//싱글톤(Singleton)
public class Singleton {	//객체를 하나만 만들게 끔(static) 해주므로 객제를 딱 하나만 만들 때 사용
	//private static 클래스명 singleton(객체이름) = new 생성자함수() - 외부에서 생성(호출)하지 못하게 끔
	private static Singleton singleton = new Singleton();
	//private 생성자함수() {} - 외부에서 생성(호출)하지 못하게 끔
	private Singleton(){}
	//public static 클래스명 getInstance(){return singleton;}
	public static Singleton getInstance(){return singleton;} //호출법
}
