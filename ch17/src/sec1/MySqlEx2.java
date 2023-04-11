package sec1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLEx2 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	public static void main(String[] args) {
		Test2 test = new Test2();
		test.setId("vipdks");
		test.setPw("930103");
		test.setName("VIP도경수");
		String sql = "insert into test2 values (?, ?, ?)";
		int a = 0;
		conn = MySQL.getConnection();	//연결된 객체
		//.executeUpdate()는 insert, delete, update문일 때 사용하며, 반환타입이 int임
		try {
			pstmt = conn.prepareStatement(sql);	//sql 명령 추가
			pstmt.setString(1, test.getId());	//첫 번째 ?
			pstmt.setString(2, test.getPw());
			pstmt.setString(3, test.getName());
			a = pstmt.executeUpdate();	//추가된 sql 명령을 실행
			if(a>0){
				System.out.println("회원등록이 성공적으로 수행되었습니다.");
			} else {
				System.out.println("회원등록에 실패하였습니다.");
			}
			
			MySQL.close(conn, pstmt);
		} catch (SQLException e) {
			System.out.println("SQL 실행이 정상적으로 실행되지 못했습니다.");
		}
	}
}
