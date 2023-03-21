package sec5;
//현재 MixEx1과 Mix는 같은 클래스에 존재하므로 import가 필요 없음
//같은 패키지에 존재하는 Mix의 멤버중에서 public, protected, default는 접근 가능
public class MixEx1 {
	public static void main(String[] args) {
		Mix mix1 = new Mix();
		//필드의 접근
		mix1.field1 = 10;	//public
		mix1.field2 = 20;	//protected
		mix1.field3 = 30;	//default
		//mix1.field4 = 40; //private
		
		//메소드의 호출
		mix1.method1();	//public
		mix1.method2();	//protected
		mix1.method3();	//default
		//mix1.method4();	//private
	}

}
