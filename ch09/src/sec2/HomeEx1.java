package sec2;

public class HomeEx1 {
	public static void main(String[] args) {
		Home home = new Home();
		
		home.user1();
		
		home.user2();
		
		home.user3(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("난방을 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("난방을 끔니다.");
			}
		});
	}
}
