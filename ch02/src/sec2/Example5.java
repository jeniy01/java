package sec2;

public class Example5 {
	public static void main(String[] args) {
		String a = "true";
		String b = "false";
		String c = "3.14";
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println(Boolean.parseBoolean(a));
		//System.out.println(Byte.parseByte(a));	문법 상 오류는 없지만 숫자이므로 문자는 바꿀 수 없음
		//System.out.println(Short.parseShort(a));	NumberFormatException
		//System.out.println(Integer.parseInteger(a));	NumberFormatException
		//System.out.println(Long.parseLong(a));	NumberFormatException
		System.out.println(Float.parseFloat(c));
		System.out.println(Double.parseDouble(c));
		
	}

}
