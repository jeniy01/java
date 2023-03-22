package sec3;

public class FinalEx1 {
	public static void main(String[] args) {
		Parent m1 = new Parent();
		m1.getPrint();
		m1.output();
		
		m1 = new Child();
		m1.getPrint();
		m1.output();
		//m1.setJob("개발자"); Child는 final클래스이므로 형 변환된 경우 멤버 필드 값을 추가할 수 없다.
		
		m1 = new Descendant();
		m1.getPrint();
		m1.output();
		//Descendant는 자식 클래스이므로 부모 클래스로 선언된 멤버는 자식 멤버를 접근할 수 없다.
	}
}
