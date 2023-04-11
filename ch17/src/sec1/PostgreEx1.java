package sec1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PostgreEx1 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	public static void main(String[] args) {
		String sql = "select * from tbl_emp_202108";
		conn = Postgre.getConnection();
		ArrayList<Emp> empList = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Emp emp = new Emp();
				emp.setEmpno(rs.getString("empno"));
				emp.setEmpname(rs.getString("empname"));
				emp.setTel1(rs.getString("tel1"));
				emp.setTel2(rs.getString("tel2"));
				emp.setTel3(rs.getInt("tel3"));
				emp.setDeptcode(rs.getString("deptcode"));
				emp.setPosition(rs.getString("position"));
				empList.add(emp);
			}
			Postgre.close(conn, pstmt, rs);
		} catch (SQLException e) {
			System.out.println("SQL 실행이 정상적으로 실행되지 못했습니다.");
		}
		for(Emp e : empList){
			System.out.println(e.toString());
		}
	}
}
