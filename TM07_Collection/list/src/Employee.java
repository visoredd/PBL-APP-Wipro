public class Employee{
	public int empid;
	public String empName;
	public String email;
	public String gender;
	public float salary;
	Employee(int empId,String name,String email,String Gender,float salary){
		this.empid = empId;
		this.empName =name;
		this.email = email;
		this.gender = Gender;
		this.salary = salary;
	}
	public int getid() {
		return empid;
	}
	public float getSalary() {
		return salary;
	}
	void GetEmployDetails() {
		System.out.println(empid+" "+empName+" "+email+" "+gender+" "+salary); 
	}
}