import java.util.*;
import java.sql.*;
public class E3
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
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
        final int rollno = Integer.parseInt(args[0]);
        try {
            sql = "INSERT INTO stdnt_log SELECT ID,NAME,GRADE FROM stdnt WHERE ID = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, rollno);
            final int logged = pstmt.executeUpdate();
            sql = "DELETE FROM stdnt WHERE rollno = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, rollno);
            if (pstmt.executeUpdate() == 1 && logged == 1) {
                System.out.println("Student having rollno = " + rollno + " deleted successfully");
            }
            else {
                System.out.println("Error");
            }
        }
        catch (SQLException e3) {
            e3.printStackTrace();
        }
        sc.close();
    }
}