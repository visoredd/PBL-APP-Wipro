import java.util.*;
import java.io.*;

class Employee{
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String email;
	private String address;
	Employee(String f,String l,String m, String e, String a){
		this.firstName = f;
		this.lastName = l;
		this.mobileNumber = m;
		this.email = e;
		this.address = a;
	}
	public String getLName() {
		return lastName;
	}
	public String getFName() {
		return firstName;
	}
	public String getMobile() {
		return mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public String getAdd() {
		return address;
	}
}
public class M1 {
	public static void main(String args[]) {
		ArrayList<Employee> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Employees");
		int n = sc.nextInt();
		while(n-->0) {
			System.out.println("Enter Employee Details:");
			System.out.println("Enter the Firstname");
			String name = sc.next();
			System.out.println("Enter the Lastname");
			String nam = sc.next();
			System.out.println("Enter the Mobile");
			String mobile = sc.next();
			System.out.println("Enter the Email");
			String email = sc.next();
			System.out.println("Enter the Address");
			String add = sc.next();
			Employee e = new Employee(name,nam,mobile,email,add);
			list.add(e);
		}
		Collections.sort(list,new Comparator<Employee>(){
			public int compare(final Employee entry1,final Employee entry2) {
				return entry1.getFName().compareTo(entry2.getFName());
			}
		});
		System.out.printf("%-15s %-15s %-15s %-30s %-15s","Fisrt Name","Last Name","Mobile Number","Email","Address");
		System.out.println();
		for(int i =0;i<list.size();i++) {
			Employee eo = list.get(i);
			System.out.printf("%-15s %-15s %-15s %-30s %-15s",eo.getFName(),eo.getLName(),eo.getMobile(),eo.getEmail(),eo.getAdd());
			System.out.println();
		}
		
	}
}