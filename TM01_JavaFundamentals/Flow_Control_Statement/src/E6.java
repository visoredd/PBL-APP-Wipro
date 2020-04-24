import java.io.*;
import java.util.*;

public class E6 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Gender: ");
		String gender = input.nextLine();
		System.out.println("Enter Age: ");
		int age = input.nextInt();
		if(gender=="Female") {
			if(age>=1 && age <=58) {
				System.out.println("Percentage of interest is 8.2%.");
			}
			else {
				System.out.println("percentage of interest is 9.2%.");
			}
		}
		else {
			if(age>=1 && age <=58) {
				System.out.println("Percentage of interest is 8.4%.");
			}
			else {
				System.out.println("percentage of interest is 10.5%.");
			}
		}
	}

}
