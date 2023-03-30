package sec2;
//떠넘기기
public class ExceptionThrows {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}
}
