package sec1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OracleEx2 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	public static void main(String[] args) {
		Member mem = new Member();
		mem.setNo("20003");
		mem.setName("김기태");
		mem.setPhone("01012341004");
		mem.setAddress("화정동");
		mem.setRegdate("20231225");
		mem.setCtype("VIP");
		
		String sql = "insert into tbl_member_202201 values (member_seq.nextval, ?, ?, ?, ?, ?, ?)";
		int a = 0;
		conn = OracleDbc.getConnection();	//연결된 객체
		//.executeUpdate()는 insert, delete, update문일 때 사용하며, 반환타입이 int임
		try {
			pstmt = conn.prepareStatement(sql);	//sql 명령 추가
			pstmt.setString(1, mem.getNo());	//첫 번째 ?
			pstmt.setString(2, mem.getName());
			pstmt.setString(3, mem.getPhone());
			pstmt.setString(4, mem.getAddress());
			pstmt.setString(5, mem.getRegdate());
			pstmt.setString(6, mem.getCtype());
			
			a = pstmt.executeUpdate();	//추가된 sql 명령을 실행
			if(a>0){
				System.out.println("회원가입이 성공적으로 수행되었습니다.");
			} else {
				System.out.println("회원가입에 실패했습니다.");
			}
			
			OracleDbc.close(conn, pstmt);
		} catch (SQLException e) {
			System.out.println("SQL 실행이 정상적으로 실행되지 못했습니다.");
		}
	}
}
