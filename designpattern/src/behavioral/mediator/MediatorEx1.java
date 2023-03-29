package behavioral.mediator;
//Mediator (중재자) : 한 집합에 속해있는 객체들의 상호작용을 캡슐화하는 객체를 정의하는 패턴
public class MediatorEx1 {
	public static void main(String[] args) {
      User robert = new User("Robert");
      User john = new User("John");

      robert.sendMessage("Hi! John!");
      john.sendMessage("Hello! Robert!");
	}
}
