package sec1;
//Mammal의 모든 멤버를 상속 받음 => class 자식클래스명 extends 부모클래스명
public class Lion extends Mammal {
	private String gender;	//새로 추가된 멤버

	@Override	//상속받은 다음에 내용을 달리 하고 싶으면 override하기
	public void cry() {
		System.out.println("사자가 어흥~!");	//여길 super에서 바꿔주기
	}
}
