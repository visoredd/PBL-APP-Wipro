package com.wipro.sales.util;
import java.sql.*;
public class DBUtil {
	public static Connection getDBConnection(){
		Connection conn = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			return conn;
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
