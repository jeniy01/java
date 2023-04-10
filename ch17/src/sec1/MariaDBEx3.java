package sec1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//update course_tbl set week=3, start_hour=1300, end_end=1600, where id='40002';
//update course_tbl set week=?, start_hour=?, end_end=? where id=?;
//week, start_hour, end_end, id
public class MariaDBEx3 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	public static void main(String[] args) {
		Course c2 = new Course();
		c2.setWeek(3);
		c2.setStart(1300);
		c2.setEnd(1600);
		c2.setId("40002");
		String sql = "update course_tbl set week=?, start_hour=?, end_end=? where id=?";
		int a = 0;
		conn = MariaDB.getConnection();
		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, c2.getWeek());
			pstmt.setInt(2, c2.getStart());
			pstmt.setInt(3, c2.getEnd());
			pstmt.setString(4, c2.getId());
			a = pstmt.executeUpdate();
			if(a>0){
				System.out.println("강좌 정보 수정이 정상적으로 수행되었습니다.");
			} else {
				System.out.println("강좌 정보 수정에 실패했습니다.");
			}
			MariaDB.close(conn, pstmt);	//쓰는 순서 중요
		} catch(SQLException e){
			System.out.println("SQL 실행이 정상적으로 실행되지 못했습니다.");
		}
	}
}
