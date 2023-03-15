package sec2;

public class Example4 {
	public static void main(String[] args) {
		//문자열을 기본 타입으로 형변환
		String a = "1004";
		String b = "7979";
		System.out.println(a+b);
		System.out.println(Short.parseShort(a)+Short.parseShort(b));
		System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
		System.out.println(Long.parseLong(a)+Long.parseLong(b));
		System.out.println(Float.parseFloat(a)+Float.parseFloat(b));
		System.out.println(Double.parseDouble(a)+Double.parseDouble(b));
	}

}
