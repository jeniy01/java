package sec1;
//select문 빼고는 한 번씩만 실행
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//DBConnecter : DB를 연결하고, 종료하기 위한 클래스
public class OracleDbc {
	//연결에 필요한 상수를 선언
	private final static String	DRIVER = "oracle.jdbc.driver.OracleDriver";	//안바뀌는 상수이므로 private final static 붙이기
	private final static String	URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final static String	USER = "system";
	private final static String	PASS = "1234";
	//Connection conn = DBC.getConnection();
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName(DRIVER);	//1. DRIVER 로딩
			try {
				conn = DriverManager.getConnection(URL, USER, PASS);	//2. 드라이버 연결
			} catch (SQLException e) {
				System.out.println("데이터베이스에 연결되지 못했습니다.");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 로딩하지 못했습니다.");
		}
		return conn;
	}
	//Connection : 연결, [Prepare]Statement : 스위치 켜기, ResultSet(select문) : 결과 산출
	public static void close(Connection conn, PreparedStatement pstmt){
		try {
			pstmt.close();
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("데이터베이스를 닫지 못했습니다.");
			}
		} catch (SQLException e) {
			System.out.println("데이버베이스의 상태 연결을 끊지 못했습니다.");
		}
	}
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs){
		try {
			rs.close();
			try {
				pstmt.close();
				try {
					conn.close();
				} catch (SQLException e) {
					System.out.println("데이터베이스를 닫지 못했습니다.");
				}
			} catch (SQLException e) {
				System.out.println("데이버베이스의 상태 연결을 끊지 못했습니다.");
			}
		} catch (SQLException e) {
			System.out.println("쿼리를 종료하지 못했습니다.");
		}
	}
}
