package sec1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostgreEx3 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	public static void main(String[] args) {
		Emp c = new Emp();
		c.setEmpno("1008");
		c.setEmpname("최대리");
		c.setTel3(1004);
		
		String sql = "update tbl_emp_202108 set empname=?, tel3=? where empno=?";
		int a = 0;
		conn = Postgre.getConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getEmpname());
			pstmt.setInt(2, c.getTel3());
			pstmt.setString(3, c.getEmpno());
			
			a = pstmt.executeUpdate();
			if(a>0){
				System.out.println("사원 정보 수정이 성공적으로 수행되었습니다.");
			} else {
				System.out.println("사원 정보 수정이 실패되었습니다.");
			}
			Postgre.close(conn, pstmt);
		} catch (SQLException e) {
			System.out.println("SQL 구문이 처리되지 못했습니다.");
		}
	}
}