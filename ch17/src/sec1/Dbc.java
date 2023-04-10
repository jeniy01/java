package sec1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//DBConnecter : DB를 연결하고, 종료하기 위한 클래스
public interface Dbc {
	public Connection getConnection();
	public void close(Connection conn, PreparedStatement pstmt);
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs);
}
