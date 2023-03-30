package sec1;
//NumberFormatException : 숫자형식이 아닌 데이터의 실행 시도를 했을 경우
public class ExceptionEx3 {
	public static void main(String[] args) {
		String data1 = "1004";
		String data2 = "김1004";
		try{
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			System.out.println("val1="+val1);
			System.out.println("val2="+val2);
		} catch(NumberFormatException e){
			System.out.println("숫자의 형식이 아닌 데이터가 존재합니다.");
		}
	}
}
