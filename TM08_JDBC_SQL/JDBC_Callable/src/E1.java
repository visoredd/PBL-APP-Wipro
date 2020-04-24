import java.sql.*;
public class E1
{
    public static void main(final String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        CallableStatement cstmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e2) {
            e2.printStackTrace();
        }
        final String sql = "SELECT * FROM emp";
        try {
            stmt = conn.createStatement();
            final ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                final int empno = rs.getInt("empno");
                final String ename = rs.getString("ename");
                double netSalary = 0.0;
                final String sql2 = "{ call calculate_salary(?, ?) }";
                cstmt = conn.prepareCall(sql2);
                cstmt.setInt(1, empno);
                cstmt.registerOutParameter(2, 8);
                cstmt.executeQuery();
                netSalary = cstmt.getDouble(2);
                System.out.println("empno: " + empno + ", ename: " + ename + ", net salary: " + netSalary);
            }
        }
        catch (SQLException e3) {
            e3.printStackTrace();
            System.out.println("Error");
            stmt.close();
            cstmt.close();
            conn.close();
        }
    }
}