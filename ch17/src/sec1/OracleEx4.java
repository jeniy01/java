package sec1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OracleEx4 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	public static void main(String[] args) {
		Member mem = new Member();
		mem.setNo("20003");
		//PreparedStatement
		String sql = "delete from tbl_member_202201 where c_no=?";
		int a = 0;
		conn = OracleDbc.getConnection();	//연결된 객체
		try {
			pstmt = conn.prepareStatement(sql);	//sql 명령 추가
			pstmt.setString(1, mem.getNo());
			a = pstmt.executeUpdate();	//추가된 sql 명령을 실행
			if(a>0){
				System.out.println("회원 탈퇴가 성공적으로 수행되었습니다.");
			} else {
				System.out.println("회원 탈퇴에 실패했습니다.");
			}
			
			OracleDbc.close(conn, pstmt);
		} catch (SQLException e) {
			System.out.println("SQL 실행이 정상적으로 실행되지 못했습니다.");
		}
	}
}
