import java.io.*;
import java.util.*;

public class E16 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter an Integer: ");
		int num = input.nextInt();
		for(int i =1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
