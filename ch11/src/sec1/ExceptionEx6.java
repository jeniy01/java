package sec1;
//외부자원을 쓰는 경우 무조건 예외처리(try~catch~) 해야 한다.
//ClassNotFoundException (클래스 부재) : 해당 클래스가 존재하지 않는 경우
//해당 클래스의 라이브러리를 빌드패스에 추가해 주어야 함.
public class ExceptionEx6 {
	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");	
		} catch(ClassNotFoundException e){
			System.out.println("해당 클래스를 찾을 수 없습니다.");
		}
	}
}
