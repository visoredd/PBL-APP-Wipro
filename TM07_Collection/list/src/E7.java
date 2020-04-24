import java.io.*;
import java.util.*;
class EmployeeV {
	private int id;
	private String name;
	private String email;
	private String gender;
	private Double salary;
	
	public EmployeeV(int id, String name, String email,String gender, Double salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}
	public String toString() {
		return "Employee : id= " + id + ", name= " + name + ", email= " + email + ", gender= " + gender + ", salary= " + salary ;
	}
}

public class E7 {

	public static void main(String[] args) {
		Vector<EmployeeV> list = new Vector<>(); 
		list.add(new EmployeeV(1001,"Aayush","gupta@gmail.com","Male",80000.0));
		list.add(new EmployeeV(1002,"Riya","rj1992@gmail.com","Female",70000.0));
		list.add(new EmployeeV(1003,"Shivam","shivam@gmail.com","Male",90000.0));
		list.add(new EmployeeV(1004,"Vaishali","vaishali@gmail.com","Female",100000.0));
		Iterator<EmployeeV> it = list.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
		

	}

}