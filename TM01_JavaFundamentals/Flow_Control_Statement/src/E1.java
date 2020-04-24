import java.io.*;
import java.util.*;

public class E1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Integer: ");
		int num1 = input.nextInt();
		if(num1>0) {
			System.out.println("Positive");
		}
		else if(num1<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
	}

}
