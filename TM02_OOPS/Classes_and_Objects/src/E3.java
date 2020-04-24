import java.io.*;
import java.util.*;

class Patient{
	public String patientName;
	public double height;
	public double weight;
	
	Patient(String pat,double hei,double wid) {
		patientName = pat;
		height = hei;
		weight = wid;
	}
	public String showpat() {
		return patientName;
	}
	public double computeBmi(){
		return weight/(Math.pow(height, 2));
	}
}
public class E3 {
	public static void main(String args[]) {
		Patient pat1 = new Patient("Shivam",1.83,75);
		System.out.print(pat1.showpat()+"'s BMI index is: ");
		System.out.println(pat1.computeBmi());
	}
}
