import java.sql.*;
public class E2 {
	public static void main(String args[])throws SQLException,ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		System.out.println("Connection Established Successfully");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEES WHERE SALARY > 10000 AND SALARY < 20000 ORDER BY SALARY");
		System.out.printf("%-10S%-10S%-10S%-10S\n","ename","job","sal","comm");
		while(rs.next()) {
			System.out.printf("%-10S%-10S%-10S%-10S\n",rs.getString("LAST_NAME"),rs.getString("JOB_ID"),rs.getString("SALARY"),rs.getString("COMMISSION_PCT"));
		}
		con.close();
	}
}
