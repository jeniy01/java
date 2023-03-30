package sec1;
//Exception (예외) : 문법적 오류는 없지만 비정상적인 실행을 하게 되는 경우
//문법적 오류 : Syntex Error
//예외 처리 : 예외가 발생할 것을 대비하여 그 예외의 내용을 확인하고 정상적으로 처리하기 위한 방법
//try {실행할구문;} catch(Exception e) {예외상황메세지출력;}
//NullPointerException : 처리할 내용이 null일  경우
public class ExceptionEx1 {
	public static void main(String[] args) {
		String data = null;
		data = "이제노";
		try {
			System.out.println(data.toString());
		} catch(NullPointerException e){	//또는 Exception e로 해도 됨
			e.printStackTrace();	//예외의 내용을 출력
		}
	}
}
