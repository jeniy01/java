package sec2;

public class Car {
	private Tire tire1 = new Tire();

	private Tire tire2 = new Tire() {	//익명의 자식 객체
		@Override
		public void roll() {
			System.out.println("이름이 없는 타이어가 굴러 갑니다.");
		}
	};
	
	public void run1() {
		tire1.roll();	//타이어가 굴러 갑니다.
		tire2.roll();	//이름이 없는 타이어가 굴러 갑니다. - 익명 객체
	}
	
	public void run2() { //로컬 영역 안에 익명 객체
		Tire tire3 = new Tire(){	//익명의 로컬 변수 이므로 내부에서만 접근이 가능하다.
			@Override
			public void roll() {
				System.out.println("이름없는 익명 객체의 메소드 호출");
			}
		};
		tire3.roll();
	}
	
	public void run3(Tire tire4){ //매개변수를 익명의 객체로 받아서 처리
		tire4.roll();
	}
}
