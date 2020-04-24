import java.io.*;
import java.util.*;

public class E2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Integer: ");
		int num1 = input.nextInt();
		if(num1%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
