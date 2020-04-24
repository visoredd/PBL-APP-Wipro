import java.io.*;
public class E2{
	public static void main(String[] args) {
		Employ e = new Employ("Shivam",600000,2020,"3C5D66842");
		System.out.println("Employ Name: "+e.getName());
		System.out.println("Annual Salary: "+e.getSalary());
		e.setName("Aayush");
		System.out.println("Employ Name: "+e.getName());
		System.out.println("Annual Salary: "+e.getSalary());
	}
	
}
