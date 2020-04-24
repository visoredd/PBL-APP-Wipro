import java.sql.*;
import java.io.*;
import java.util.*;
class DAOClass {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	public DAOClass()  throws SQLException,ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		System.out.println("Connection Established Successfully");
	}
	public boolean insert(int rollno, String name, String grade, String dob, int fee) {		
		String sql = "INSERT INTO STDNT VALUES(?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			pstmt.setString(2, name);
			pstmt.setString(3, grade);
			pstmt.setString(4, dob);
			pstmt.setInt(5, fee);
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public boolean delete(int rollno) {
		String sql = "DELETE stdnt WHERE ID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public boolean modify(int rollno, int fee) {
		String sql = "UPDATE stdnt SET FEE = ? WHERE ID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, fee);
			pstmt.setInt(2, rollno);
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public boolean display(int rollno) {
		String sql = "SELECT * FROM stdnt WHERE ID = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			
			while (rs.next()) {
				StringBuilder sb = new StringBuilder();
				
				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					String colName = rsmd.getColumnName(i);
					
					sb.append(rs.getObject(colName));
					if (i != rsmd.getColumnCount()) sb.append(", ");
				}
				System.out.println(sb);
			}
			
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public boolean display() {
		String sql = "SELECT * FROM stdnt";
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			
			while (rs.next()) {
				StringBuilder sb = new StringBuilder();
				
				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					String colName = rsmd.getColumnName(i);
					
					sb.append(rs.getObject(colName));
					if (i != rsmd.getColumnCount()) sb.append(", ");
				}
				
				System.out.println(sb);
			}
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
}
public class JDBCalls {

	public static void main(String[] args)throws SQLException,ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		DAOClass dao = new DAOClass();
		int option;
		do {
			System.out.println("MAIN MENU");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Update");
			System.out.println("4. Display");
			System.out.println("5. EXIT");
			System.out.println("Enter your choice: ");
		option = sc.nextInt();
		
		switch (option) {
		case 1: // insert: java JDBCCalls 1 101 Ajit IV 20-Nov-2001 4000
			System.out.println("Roll No: ");
			int rollno = sc.nextInt();
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Grade");
			String grade = sc.next();
			System.out.println("DOB");
			String dob = sc.next();
			System.out.println("Fee: ");
			int fee = sc.nextInt();
			
			if (dao.insert(rollno, name, grade, dob, fee))
				System.out.println("Inserted successfully");
			else 
				System.out.println("Insertion error");
			break;
			
		case 2: // delete: java JDBCCalls 2 101 
			System.out.println("Roll No.: ");
			rollno = sc.nextInt();
			
			if (dao.delete(rollno))
				System.out.println("Deleted successfully");
			else 
				System.out.println("Deletion error");
			
			break;
			
		case 3: // update: java JDBCCalls 3 101 4500
			System.out.println("Roll No.");
			rollno = sc.nextInt();
			System.out.println("Fee: ");
			fee = sc.nextInt();
			
			if (dao.modify(rollno, fee))
				System.out.println("Modified successfully");
			else 
				System.out.println("Modification error");
			break;
			
		case 4: // select: java JDBCCalls 4 101
			System.out.println("1. Display All");
			System.out.println("2. Display Single Student");
			System.out.println("Enter your choice");
			int c = sc.nextInt();
			switch(c) {
			case 1:
				dao.display();
				break;
			case 2:
				System.out.println("Roll No.:");
				rollno = sc.nextInt();
				dao.display(rollno);
				break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
			break;
		case 5:
			System.out.println("EXITINGG.....");
			break;
		}
		}while(option!=5);
	}
}