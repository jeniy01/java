package sec5;

public class Mix {
	//public > protected > default > private
	public int field1;
	protected int field2;
	int field3;
	private int field4;
	
	public void method1(){
		System.out.println("public 메소드1");
	}
	public void method2(){
		System.out.println("protected 메소드2");
	}
	void method3(){
		System.out.println("default 메소드3");
	}
	public void method4(){
		System.out.println("private 메소드4");
	}
}
