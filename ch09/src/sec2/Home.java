package sec2;
//3가지 방법 중 하나 선택(3번 추천)
public class Home {
	//1. 인터페이스로멤버객체로 선언하고, 구현 내용을 직접 기술하는 방법
	private RemoteControl tv = new RemoteControl(){
		@Override
		public void turnOn(){
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff(){
			System.out.println("TV를 끕니다.");
		}
	};
	public void user1(){
		tv.turnOn();
		tv.turnOff();
	}
	
	//2. 멤버메소드의 안에 구현 객체를 만들고 호출하는 방법
	public void user2(){
		RemoteControl aircon = new RemoteControl(){
		@Override
		public void turnOn(){
			System.out.println("에어컨을 켭니다.");
		}
		@Override
		public void turnOff(){
			System.out.println("에어컨을 끕니다.");
		}
	};
	aircon.turnOn();
	aircon.turnOff();
	}
	
	//3. 매개변수로 실행할 부분에서 인터페이스의 구현 내용을 받아서 실행하는 방법
	public void user3(RemoteControl heater){
		tv.turnOn();
		tv.turnOff();
	}
}
