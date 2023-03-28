package sec1;

//정적 멤버 클래스
public class Surface {
	static class Inside {}
	
	//일반 필드
	Inside field1 = new Inside();
	
	//정적 필드
	public static Inside field2 = new Inside();
	
	//외부 클래스의 생성자 => 로컬 클래스
	Surface() {
		Inside in1 = new Inside();
	}
	
	//인스턴스 메소드 => 로컬 클래스
	void method1(){
		Inside in1 = new Inside();
	}
	
	//정적 메소드의 로컬 클래스
	static void method2() {
		Inside in1 = new Inside();
	}
}
