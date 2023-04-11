package sec1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLEx3 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	public static void main(String[] args) {
		Test2 test = new Test2();
		test.setId("vipdks");
		test.setPw("100479");
		test.setName("도경수친구");
		String sql = "update test2 set pw=?, name=? where id=?";
		int a = 0;
		conn = MySQL.getConnection();
		try{
			pstmt = conn.prepareStatement(sql);	//sql 명령 추가
			pstmt.setString(1, test.getPw());	//첫 번째 ?
			pstmt.setString(2, test.getName());
			pstmt.setString(3, test.getId());
			a = pstmt.executeUpdate();	//추가된 sql 명령을 실행
			if(a>0){
				System.out.println("회원정보 수정이 성공적으로 수행되었습니다.");
			} else {
				System.out.println("회원정보 수정에 실패하였습니다.");
			}
			
			MySQL.close(conn, pstmt);
		} catch (SQLException e) {
			System.out.println("SQL 실행이 정상적으로 실행되지 못했습니다.");
		}
	}
}