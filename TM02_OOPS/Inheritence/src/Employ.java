public class Employ extends Person{
	private double salary;
	private int year;
	private String insurance;
	Employ(String name,double salary, int year, String insurance){
		super(name);
		this.salary = salary;
		this.year = year;
		this.insurance = insurance;
	}
	public double getSalary() {
		return salary;
	}
	public int getYear() {
		return year;
	}
	public String insurance() {
		return insurance;
	}
	public void setSalary(double s) {
		this.salary = s;
	}
	public void setYear(int y) {
		this.year = y;
	}
	public void setInsurance(String i) {
		this.insurance = i;
	}
}
