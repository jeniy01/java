package sec2;

public class Example1 {
	public static void main(String[] args) {
		// 자동 형변환(자료형이 자동으로 변환됨) = auto casting = promotion
		// 프로그램에서 byte가 작은 자료형의 데이터를 큰 자료형에 대입하거나 계산되어 입력될 때 발생
		byte a = 120;	//1byte
		short b = a;	//2byte
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		char c = 'B';
		int d = c;
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		//강제 형변환 : 큰 자료형에서 작은 자료형으로 형 변환
		byte e = (byte) c;	//강제 형변환1
		short f = 200;
		byte g = (byte) f;	//강제 형변환2(X)
		System.out.println("e="+e);	//66
		System.out.println("f="+f);
		System.out.println("g="+g);	//200 -> -56
		
	}

}
