class Personn{
	private String name;
	private String dateOfBirth;
	Personn(String name,String dob){
		this.name = name;
		this.dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name = n;
	}
	public String getDob() {
		return dateOfBirth;
	}
	public void setDob(String d) {
		this.dateOfBirth = d;
	}
}

class Teacher extends Personn{
	private double salary;
	private String subject;
	Teacher(String name,String dob,double salary,String subject){
		super(name,dob);
		this.salary = salary;
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double s) {
		this.salary = s;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String sb) {
		this.subject = sb;
	}
	public String toString() {
		return "Teacher Name: "+getName()+", DOB: "+getDob()+", Salary: "+getSalary()+", Subject: "+getSubject();
	}
}

class Student extends Personn{
	private int studentId;
	Student(String name,String dob,int studentId){
		super(name,dob);
		this.studentId = studentId;
		
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int i) {
		this.studentId = i;
	}
	public String toString() {
		return "Student's Name: "+getName()+", DOB: "+getDob()+", StudentId: "+getStudentId();
	}
}

class College extends Student{
	private String year;
	private String collegeName;
	College(String name,String dob,int studentId,String collegeName,String year){
		super(name,dob,studentId);
		this.collegeName = collegeName;
		this.year = year;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String c) {
		this.collegeName = c;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String sb) {
		this.year = sb;
	}
	public String toString() {
		return "College Student's Name: "+getName()+", DOB: "+getDob()+", StudentId: "+getStudentId()+", CollegeName: "+getCollegeName()+", CollegeYear: "+getYear();
	}
}


public class E3 {
	public static void main(String args[]) {
		Teacher t = new Teacher("Anuradha","03/08/1995",100000,"Mathematics");
		Student s = new Student("Aayush","31/08/1998",18);
		College c = new College("Aayush","31/08/1998",18,"VIT University","Fourth");
		System.out.println(t);
		System.out.println(s);
		System.out.println(c);
	}
}
