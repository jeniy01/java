package sec1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlEx4 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	public static void main(String[] args) {
		Test2 test = new Test2();
		test.setId("vipdks");
		String sql = "delete from test2 where id=?";
		int a = 0;
		conn = MySQL.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, test.getId());
			a = pstmt.executeUpdate();
			if(a>0){
				System.out.println("정보 삭제가 성공적으로 수행되었습니다.");
			} else {
				System.out.println("정보 삭제에 실패하였습니다.");
			}
			MySQL.close(conn, pstmt);
		} catch(SQLException e){
			System.out.println("SQL 실행이 정상적으로 실행되지 못하였습니다.");
		}
	}
}
