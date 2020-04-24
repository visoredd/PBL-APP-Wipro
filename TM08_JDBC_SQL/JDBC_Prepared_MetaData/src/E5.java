import java.sql.*;
public class E5
{
    public static void main(final String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "";
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
        int rollno = 0;
        try {
            rollno = Integer.parseInt(args[0]);
        }
        catch (Exception ex) {}
        try {
            if (rollno != 0) {
                sql = "SELECT * FROM stdnt WHERE ID = ?";
            }
            else {
                sql = "SELECT * FROM stdnt";
            }
            pstmt = conn.prepareStatement(sql);
            if (rollno != 0) {
                pstmt.setInt(1, rollno);
            }
            final ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                final int ROLLNO = rs.getInt("ID");
                final String STUDENTNAME = rs.getString("NAME");
                final String STANDARD = rs.getString("GRADE");
                final String DATE_OF_BIRTH = rs.getString("STDATE");
                final double FEES = rs.getDouble("FEE");
                System.out.println(String.valueOf(ROLLNO) + " " + STUDENTNAME + " " + STANDARD + " " + DATE_OF_BIRTH + " " + FEES);
            }
        }
        catch (SQLException e3) {
            e3.printStackTrace();
        }
    }
}