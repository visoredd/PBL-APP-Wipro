import java.io.*;
import java.util.*;
public class M1 {
	public static void main(String args[])throws IOException,ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("file.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		FileInputStream fis = new FileInputStream("file.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		int c;
		do {
			System.out.println("Main Menu");
			System.out.println("1. Add an Employee");
			System.out.println("2. Display All");
			System.out.println("3. Exit");
			c = sc.nextInt();
			switch(c) {
			case 1:
				Employee emp = new Employee(0,"",0,0);
				System.out.println("Enter Employee ID: ");
				emp.setId(sc.nextInt());
				System.out.println("Enter Employee Name: ");
				emp.setName(sc.next());
				System.out.println("Enter Employee Age: ");
				emp.setAge(sc.nextInt());
				System.out.println("Enter Employee Salary: ");
				emp.setSalary(sc.nextDouble());
				
				oos.writeObject(emp);
				break;
			case 2:
				System.out.println("----Report----");
				emp = null;
				while(fis.available()>0) {
					emp = (Employee) ois.readObject();
					System.out.println(emp);
				}
				System.out.println("----End of Report----");
				break;
			case 3:
				System.out.println("Exitting.....");
				System.exit(0);
				break;
			}
		}while(c!=3);
		fis.close();
		ois.close();
		fos.close();
		oos.close();
	}
}
