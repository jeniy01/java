package structual.proxy;
//Proxy(프록시) : 어떤 다른 객체로 접근하는 것을 통제하기 위해서 그 객체의 대리자(surrogate) 또는 자리채움자(placeholder)를 제공하는 패턴
public class ProxyEx1 {
	public static void main(String[] args) {
	      Image image = new ProxyImage("test_10mb.jpg");

	      image.display(); 
	      System.out.println("");
	      
	      image.display(); 
	}
}
