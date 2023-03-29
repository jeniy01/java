package behavioral.observer;
//Observer (감시자) : 객체들 사이에 일 대 다의 의존 관계를 정의해 두어 어떤 객체의 상태가 변할 때 그 객체에 의존성을 가진 다른 객체들이 그 변화를 통지 받고 자동으로 갱신될 수 있게 만드는 패턴 
public class ObserverEx1 {
	public static void main(String[] args) {
      Subject subject = new Subject();

      new HexaObserver(subject);
      new OctalObserver(subject);
      new BinaryObserver(subject);

      System.out.println("First state change: 15");	
      subject.setState(15);
      System.out.println("Second state change: 10");	
      subject.setState(10);
	}
}
