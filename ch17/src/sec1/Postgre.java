package sec1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Postgre {
	private final static String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost/sample";
	private final static String USER = "postgres";
	private final static String PASS = "1234";
	
	static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			try {
				conn = DriverManager.getConnection(URL,USER,PASS);
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결 실패");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		}
		return conn;
	}
	
	static void close(Connection conn, PreparedStatement pstmt){
		try {
			pstmt.close();
			try {
				conn.close();
			} catch (Exception e) {
				System.out.println("데이터베이스 닫기 실패");
			}
		} catch(SQLException e){
			System.out.println("데이터베이스 로딩 실패");
		}
	}
	
	static void close(Connection conn, PreparedStatement pstmt, ResultSet rs){
		try {
			rs.close();
			try {
				pstmt.close();
				try {
					conn.close();
				} catch (SQLException e) {
					System.out.println("데이터베이스 닫기 실패");
				}
			} catch (SQLException e) {
				System.out.println("데이터베이스 로딩 실패");
			}
		} catch (SQLException e) {
			System.out.println("쿼리 종료 실패");
		}
	}
}
