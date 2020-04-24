import java.io.*;
import java.util.*;

public class E12 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int flag =0;
		System.out.println("Enter Integer: ");
		int num = input.nextInt();
		for(int i =2;i<=num/2;i++) {
			if(num%i==0) {
				flag = 1;
				break;
			}
			else{
				flag = 0;
			}
		}
		if(num==1 || num==0) {
			System.out.println(num+ " is neither prime nor composite");
		}
		else if(flag==1) {
			System.out.println(num+" is not a prime number");
		}
		else {
			System.out.println(num+ "is a prime number");
		}
	}

}
