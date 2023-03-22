package sec3;
import sec2.*;
//함수의 객체 전달
public class SuperSubObjectEx1 {
	public static void main(String[] args) {
		//객체 선언
		Customer cus;
		
		cus = new Customer();	//객체 생성
		cus.setName("이제노");
		fnc1(cus);	//함수 호출
		
		cus = new Member();
		cus.setName("박지성");
		fnc1(cus);
		
		cus = new NonMember();
		cus.setName("비회원");
		fnc1(cus);
		
		//상속된 상황에서의 함수 매개객체의 타입은 부모타입의 매개객체로 설정해야 모두 받을 수 있음
	}
	public static void fnc1(Customer cus1){	//함수 오버로딩, 여기서 ()안에는 반드시 부모클래스로 할 것
		cus1.getCustom();
		System.out.println(cus1.getName());
	}
	public static void fnc1(Member cus1){
		cus1.getCustom();
		System.out.println(cus1.getName());
	}
	public static void fnc1(NonMember cus1){
		cus1.getCustom();
		System.out.println(cus1.getName());
	}
}
