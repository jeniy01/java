package sec2;
//finally 구절은 try의 성공이나 실패와 관계없이 무조건 실행해야 하는 구문이 있을 경우 지정
public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			String data = null;
			//data = "이제노";
			System.out.println(data.toString());
		} catch(Exception e){
			System.out.println("이유를 알 수 없는 예외가 발생하였습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}
