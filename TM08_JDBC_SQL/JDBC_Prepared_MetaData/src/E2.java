import java.io.*;
import java.sql.*;
import java.util.*;
public class E2 {
	public static void main(final String[] args) throws SQLException {
        final Scanner sc = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e2) {
            e2.printStackTrace();
        }
        int rollno = 0;
        do {
            System.out.print("Enter rollno: ");
            final String rollstr = sc.nextLine();
            try {
                rollno = Integer.parseInt(rollstr);
                if (String.valueOf(rollno).length() == 4) {
                    continue;
                }
                rollno = 0;
            }
            catch (Exception ex) {}
        } while (rollno == 0);
        String studentName = "";
        boolean lowercasefound;
        do {
            System.out.print("Enter name: ");
            studentName = sc.nextLine();
            lowercasefound = false;
            for (int i = 0; i < studentName.length(); ++i) {
                if (Character.isLowerCase(studentName.charAt(i))) {
                    lowercasefound = true;
                    break;
                }
            }
        } while (studentName.length() > 20 || lowercasefound);
        String standard = "";
        final String[] standards = { "I", "II", "III", "IV", "V", "Vi", "VII", "VIII", "IX", "X" };
        final List<String> list = new ArrayList<String>(Arrays.asList(standards));
        do {
            System.out.print("Enter standard: ");
            standard = sc.nextLine();
        } while (!list.contains(standard));
        System.out.print("Enter D.O.B.: ");
        final String dob = sc.nextLine();
        Double fees = 0.0;
        do {
            System.out.print("Enter fees: ");
            if (sc.hasNextDouble()) {
                fees = sc.nextDouble();
            }
        } while (fees == 0.0);
        final String sql = "INSERT INTO stdnt VALUES(?, ?, ?, ?, ?)";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, rollno);
            pstmt.setString(2, studentName);
            pstmt.setString(3, standard);
            pstmt.setString(4, dob);
            pstmt.setDouble(5, fees);
            pstmt.executeQuery();
            System.out.println("Student added successfully");
        }
        catch (SQLException e3) {
            e3.printStackTrace();
            System.out.println("Error");
            pstmt.close();
            conn.close();
        }
        sc.close();
    }
}
