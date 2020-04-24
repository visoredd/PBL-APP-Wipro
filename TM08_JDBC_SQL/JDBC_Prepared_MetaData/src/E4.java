import java.sql.*;
import java.util.*;
public class E4
{
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
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
        catch (SQLException e1) {
            e1.printStackTrace();
        }
        int rollno = Integer.parseInt(args[0]);
        double fees = Double.parseDouble(args[1]);
        try {
            sql = "UPDATE stdnt SET FEE = ? WHERE ID = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setDouble(1, fees);
            pstmt.setInt(2, rollno);
            if (pstmt.executeUpdate() == 1) {
                System.out.println("Fees of student having rollno = " + rollno + " updated successfully");
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