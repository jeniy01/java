package behavioral.momento;
//Memento (기념품) : 캡슐화를 위배하지 않은 채로 어떤 객체의 내부 상태를 잡아내고 실체화시켜, 이후에 해당 객체가 그 상태로 되돌아올 수 있도록 하는 패턴
public class MementoEx1 {
	public static void main(String[] args) {
	      Originator originator = new Originator();
	      CareTaker careTaker = new CareTaker();
	      
	      originator.setState("State #1");
	      originator.setState("State #2");
	      careTaker.add(originator.saveStateToMemento());
	      
	      originator.setState("State #3");
	      careTaker.add(originator.saveStateToMemento());
	      
	      originator.setState("State #4");
	      System.out.println("Current State: " + originator.getState());		
	      
	      originator.getStateFromMemento(careTaker.get(0));
	      System.out.println("First saved State: " + originator.getState());
	      originator.getStateFromMemento(careTaker.get(1));
	      System.out.println("Second saved State: " + originator.getState());
	}
}
