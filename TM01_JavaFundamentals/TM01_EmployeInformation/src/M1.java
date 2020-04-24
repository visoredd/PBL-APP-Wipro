import java.io.*;
import java.util.*;

public class M1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Employe No: ");
		if(input.hasNextInt()) {
			int n = input.nextInt();
			String[] str = {"Emp No","Emp Name","Join Date","Designation Code","Department","Basic","HRA","IT"};
			String[][] m_str = {
					{"1001","1002","1003","1004","1005","1006","1007"},
					{"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"},
					{"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"},
					{"e","c","k","r","m","e","c"},
					{"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"},
					{"20000","30000","10000","12000","50000","23000","29000"},
					{"8000","12000","8000","6000","20000","9000","12000"},
					{"3000","9000","1000","2000","20000","4400","10000"}
			};
			String eid = Integer.toString(n);
			boolean test = false;
			int pos = 0;
			for(int i =0;i<m_str[0].length;i++) {
				if(m_str[0][i].equals(eid)) {
					test = true;
					pos = i;
					break;
				}
			}
			int salary = 0;
			String dc = "";
			int da = 0;
			String d = "";
			if(test==true){
				dc = m_str[3][pos];
				salary = Integer.parseInt(m_str[5][pos]) + Integer.parseInt(m_str[6][pos]) - Integer.parseInt(m_str[7][pos]);
				switch(dc) {
				case "e":
					d = "Engineer";
					da = 20000;
					break;
				case "c":
					d = "Consultant";
					da = 32000;
					break;
				case "k":
					d = "Clerk";
					da = 12000;
					break;
				case "r":
					d = "Receptionist";
					da = 15000;
					break;
				case "m":
					d = "Manager";
					da = 40000;
					break;
					
				}
				salary += da;
				System.out.printf("%7s %12s %12s %12s %8s","Emp No.","Emp Name","Department","Designation","Salary");
				System.out.println();
				System.out.printf("%4s %12s %12s %14s %10d",n,m_str[1][pos],m_str[4][pos],d,salary);
			}
			else {
				System.out.println("There is no Employe with emp_id: "+ eid);
			}
		}
		else {
			System.out.println("Please Enter Emp_ID");
		}
	}
}
