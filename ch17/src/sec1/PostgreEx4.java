package sec1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostgreEx4 {
	static Connection conn = null;
	static PreparedStatement pstmt= null;
	public static void main(String[] args) {
		Emp c = new Emp();
		c.setEmpno("1008");
		
		String sql = "delete from tbl_emp_202108 where empno=?";
		int a = 0;
		conn = Postgre.getConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getEmpno());
			
			a = pstmt.executeUpdate();
			if(a>0){
				System.out.println("사원 정보를 삭제하였습니다.");
			} else {
				System.out.println("사원 정보를 삭제하지 못했습니다.");
			}
			Postgre.close(conn, pstmt);
		} catch (SQLException e) {
			System.out.println("SQL 구문이 정상적으로 처리되지 못했습니다.");
		}
	}
}