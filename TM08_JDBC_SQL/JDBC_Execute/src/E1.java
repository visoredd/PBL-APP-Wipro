
import java.sql.*;
public class E1 {
	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		Connection conn = null;
		Statement stmt;
		ResultSet rs;		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
		System.out.println("Connection Established successfully");
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT * FROM EMPLOYEES");
		System.out.printf("%-10S%-10S\n", "empno", "ename");
		while(rs.next()) {
			System.out.printf("%-10S%-10S\n",rs.getString(1),rs.getString("LAST_NAME"));
		}
		conn.close();
		
	}

}