import java.io.*;
import java.util.*;
public class E4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 integers: ");
		try {
			int a1= sc.nextInt();
			int a2= sc.nextInt();
			int a3= sc.nextInt();
			int a4= sc.nextInt();
			int a5= sc.nextInt();
			int sum = a1+a2+a3+a4+a5;
			System.out.println("Sum: "+sum);
			int avg = sum/5;
			System.out.println("Average: "+avg);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NumberFormatException c) {
			System.out.println(c);
		}
		catch(InputMismatchException m) {
			System.out.println(m);
		}
	}
}
