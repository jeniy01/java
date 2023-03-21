package dao;
//현재 MixEx1과 Mix는 다른 패키지에 존재하므로 import 해야 함
import sec5.*;	//내용 전체 import = *

public class MixEx1 {
	public static void main(String[] args) {
		Mix mix1 = new Mix();
		//필드의 접근
		mix1.field1 = 10;	//public
		//mix1.field2 = 20;	//protected
		//mix1.field3 = 30;	//default
		//mix1.field4 = 40; //private
		
		//메소드의 호출
		mix1.method1();	//public
		//mix1.method2();	//protected
		//mix1.method3();	//default
		//mix1.method4();	//private
		
		Mix2 mix2 = new Mix2();
		//필드의 접근
		mix2.field1 = 10;	//public
		mix2.field2 = 20;	//protected
		//mix2.field3 = 30;	//default
		//mix2.field4 = 40; //private
				
		//메소드의 호출
		mix2.method1();	//public
		mix2.method2();	//protected
		//mix2.method3();	//default
		//mix2.method4();	//private
	}
}
