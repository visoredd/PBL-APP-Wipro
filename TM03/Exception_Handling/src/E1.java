import java.io.*;
import java.util.*;

public class E1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		String str = sc.next();
		try {
			int i = Integer.parseInt(str);
			i = (int)Math.pow(i,2);
			System.out.println("The squared value is "+i);
		}
		catch(NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer.");
		}
	}
}
