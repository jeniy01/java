package sec5;
//다른 패키지에 있는 클래스를 사용하려면 import를 해야 함
import dao.Product;	//import.1차패키지명.(2차패키치명.)클래스명
//import dao.Stuff;	Stuff클래스는 접근제한이 default이므로 다른 클래스에서 import하여 사용할 수 없음
import dao.Services;

public class ProductEx1 {	//Product로 부터 상속(extends Product)
	public static void main(String[] args) {
		Product pro1 = new Product();
		pro1.name = "우정반지";	//접근제한이 public이므로 다른 패키지에서도 접근 가능
		//pro.pid = "A001";	접근체한이 default이므로 같은 패키지에서만 접근 가능
		pro1.setPid("A001");	//접근제한이 걸려있을 경우, 이처럼 getter-setter로 선언할 수 있음
		//pro1.style = "RING";	접근제한이 protected일 경우 상속관계나 포함관꼐일 경우 접근 가능
		pro1.setStyle("RING");
		//pro1.acount = "7";	접근제한이 private일 경우 현재 클래스에서만 접근 가능
		pro1.setAcount(7);
		
		//Stuff sf1 = new Stuff();
		/*
		★public : 클래스, 필드, 생성자, 메소드 - 다른 패키지에서도 import를 통하여 접근 가능
		protected : 필드, 생성자, 메소드 - 같은 패키지이거나 다른 패키지에서도 "상속"관게에 있는 클래스에서 접근 가능
		default : 클래스, 필드, 생성자, 메소드 - 무조건 같은 패키지여야만 접근 가능
		★private : 필드, 생성자, 메소드 - 무조건 같은 클래스 내에서만 접근 가능하고, 일반적으로는 public타입의 getter/setter를 통하여 접근 가능, 정보은폐/정보은닉
		접근제한의 범주 : public > protected > default > private
		클래스는 public 아니면 default만 가능
		*/
		
		Services s1 = new Services();
		s1.name = "";
		s1.setStage();
		s1.setSid();
	}
}
