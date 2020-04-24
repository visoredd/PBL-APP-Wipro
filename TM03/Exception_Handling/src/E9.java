import java.io.*;
import java.util.*;
public class E9 {
	public static void main(String[] args)throws InputMismatchException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			int quotient = a/b;
			System.out.println("The quotient of " + a + " / " + b + " = " + quotient);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage() + " caught");
		} finally {
			System.out.println("Inside finally block");
		}

		sc.close();
	}
}
