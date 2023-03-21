package sec5;

public class Method {	//어떤 객체에 소속되어 있으면 method, 아니면 함수
	public int field1;
	public String field2;
	
	public void method1(){	//반환X, 매개변수X
		System.out.println("메소드1을 호출하였습니다.");
	}
	public void method2(int field1, String field2){	//반환X, 매개변수O
		System.out.println("메소드2를 호출하였습니다.");
		System.out.println("입력 값 : "+field1);
		System.out.println("출력 값 : "+field2);
		this.field1 = field1;
		this.field2 = field2;
	}
	public int method3(){	//반환O, 매개변수X
		System.out.println("메소드3을 호출하였습니다.");
		return this.field1;
	}
	/*public int method4(String field2){	//반환O, 매개변수O
		System.out.println("메소드4를 호출하였습니다.");
		
	}*/
}
