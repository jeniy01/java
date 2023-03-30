package sec5;
//References안에 속하는 것들 : Wrapper(Integer, Byte, Float, Double, ...), Class
public class WrapperEx1 {
	public static void main(String[] args) {
		//Boxing(Wrapping) : 기본형을 래퍼형으로 바꿀 경우
		int a = 1004;	//기본형
		Integer b = a;	//래퍼형(참조형, 대문자로 시작)
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		float f1 = 3.14f;	//기본형
		Float f2 = f1;	//래퍼형(참조형, 대문자로 시작)
		System.out.println("f1="+f1);
		System.out.println("f2="+f2);
		
		//Unboxing : 래퍼형을 기본형으로 바꿀 경우
		int c = b;
		float f3 = f2;
		Integer d = 1004;
		
		System.out.println("비교 : "+(a==d));	//기본형 값 비교 = 같음
		System.out.println("비교 : "+(b==d));	//래퍼형 주소 비교 = 다름
		System.out.println("비교 : "+(b.equals(d)));	//래퍼형 값 비교 = 같음
	}

}
