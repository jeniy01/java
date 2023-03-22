package sec2;

public class CustomEx2 {
	public static void main(String[] args) {
		Customer cus1; //선언만
		
		cus1 = new Customer();	//생성
		cus1.getCustom();
		
		cus1 = new Member();	//형변환(재생성) : 부모클래스로부터 선언된 객체는 자식생성자로 생성 가능
		cus1.getCustom();
		
		cus1 = new NonMember();	//형변환(재생성) : 부모클래스로부터 선언된 객체는 자식생성자로 생성 가능
		cus1.getCustom();
		
		Member cus2;
		
		cus2 = new Member();
	}

}
