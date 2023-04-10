package sec1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQL {
	//연결에 필요한 상수를 선언
	private final static String	DRIVER = "com.mysql.cj.jdbc.Driver";
	private final static String	URL = "jdbc:mysql://localhost:3306/sample?serverTimezone=Asia/Seoul";
	private final static String	USER = "root";
	private final static String	PASS = "1234";

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			try {
				conn = DriverManager.getConnection(URL,USER,PASS);
			} catch (SQLException e) {
				System.out.println("데이터베이스에 연결되지 못했습니다.");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 로딩하지 못했습니다.");
		}
		return conn; 
	}

	public static void close(Connection conn, PreparedStatement pstmt) {
		try {
			pstmt.close();
			try {
				conn.close();
			} catch(Exception e) {
				System.out.println("데이터베이스를 닫지 못했습니다.");
			}
		} catch (SQLException e) {
			System.out.println("데이터베이스의 상태 연결을 끊지 못했습니다.");
		}
	}

	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			try {
				pstmt.close();
				try {
					conn.close();
				} catch(Exception e) {
					System.out.println("데이터베이스를 닫지 못했습니다.");
				}
			} catch (SQLException e) {
				System.out.println("데이터베이스의 상태 연결을 끊지 못했습니다.");
			}
		} catch (SQLException e1) {
			System.out.println("쿼리를 종료하지 못했습니다.");
		}
	} 
}
