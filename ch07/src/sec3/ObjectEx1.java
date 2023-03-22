package sec3;
//함수의 객체 전달2
//리턴타입 함수([매개변수타입 매개변수명]){처리할 문장;}
//1. void 함수(){처리할 문장;}
//2. void 함수 (매개변수타입 매개변수명){처리할 문장;}
//3. 리턴타입 함수(){처리할 문장; return 리턴타입값 또는 리턴타입변수;}
//4. 리턴타입 함수(매개변수타입 매개변수명){처리할 문장; return 리턴타입 또는 리턴타입변수;}
public class ObjectEx1 {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.setAge(22);
		p1.setFirstName("제노");
		p1.setLastName("이");
		fnc1(p1);
		
		Parent p2 = fnc2();
		System.out.println(p2.getLastName()+p2.getFirstName()+p2.getAge());
		
		Parent pt = new Parent();	//전송할 데이터
		pt.setAge(22);
		pt.setFirstName("인준");
		pt.setLastName("황");
		Parent p3 = fnc3(pt);
		System.out.println(p3.getLastName()+p3.getFirstName()+p3.getAge());
	}
	
	public static void fnc0(){
		System.out.println("fnc0을 호출");
	}
	public static void fnc1(Parent p){	//1. 받기만 함
		System.out.println(p.getLastName()+p.getFirstName()+p.getAge());
	}
	public static Parent fnc2(){	//제일 많이 쓰는 형태, 2. 받는 것은 없이 주기만 함
		Parent p = new Parent();
		p.setAge(22);
		p.setFirstName("재민");
		p.setLastName("나");
		return p;
	}
	public static Parent fnc3(Parent p){	//데이터를 받는 곳, 3. 받는 것도 있고 주는 것도 있음
		Parent pr = new Parent();
		pr.setAge(p.getAge());
		pr.setFirstName(p.getFirstName());
		pr.setLastName(p.getLastName());
		return pr;	//그 결과를 반환
	}
}
