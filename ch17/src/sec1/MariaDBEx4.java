package sec1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//delete from course_tbl where id='40002';
//delete from course_tbl where id=?;
//id
public class MariaDBEx4 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	public static void main(String[] args) {
		Course c3 = new Course();
		c3.setId("40002");
		String sql = "delete from course_tbl where id=?";
		int a = 0;
		conn = MariaDB.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c3.getId());
			a = pstmt.executeUpdate();
			if(a>0){
				System.out.println("정보 삭제가 성공적으로 수행되었습니다.");
			} else {
				System.out.println("정보 삭제에 실패하였습니다.");
			}
			MariaDB.close(conn, pstmt);
		} catch(SQLException e) {
			System.out.println("SQL 실행이 정상적으로 실행되지 못하였습니다.");
		}
	}
}
