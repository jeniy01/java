package sec1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//insert into course_tbl values('40002','모바일운영체제', 3, '3', 4, 1400, 1700);
//insert into course_tbl values(?, ?, ?, ?, ?, ?, ?);	sql구문
//id, name, credit, lecturer, week, start_hour, end_end
public class MariaDBEx2 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	public static void main(String[] args) {
		Course c1 = new Course();
		c1.setId("40002");
		c1.setName("모바일운영체제");
		c1.setCredit(3);
		c1.setLecturer("3");
		c1.setWeek(4);
		c1.setStart(1400);
		c1.setEnd(1700);
		String sql = "insert into course_tbl values(?, ?, ?, ?, ?, ?, ?)";
		int a = 0;
		conn = MariaDB.getConnection();	//연결
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c1.getId());
			pstmt.setString(2, c1.getName());
			pstmt.setInt(3, c1.getCredit());
			pstmt.setString(4, c1.getLecturer());
			pstmt.setInt(5, c1.getWeek());
			pstmt.setInt(6, c1.getStart());
			pstmt.setInt(7, c1.getEnd());
			a = pstmt.executeUpdate();
			if(a>0){
				System.out.println("강좌가 등록되었습니다.");
			} else {
				System.out.println("강좌가 등록되지 않았습니다.");
			}
			MariaDB.close(conn, pstmt);	//쓰는 순서 중요
		} catch (SQLException e) {
			System.out.println("SQL 실행이 정상적으로 실행되지 못했습니다.");
		}
	}
}
