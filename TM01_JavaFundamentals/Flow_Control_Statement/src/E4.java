import java.io.*;
import java.util.*;

public class E4 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Character: ");
		char c1 = input.next().charAt(0);
		System.out.println("Enter Character: ");
		char c2 = input.next().charAt(0);
		
		if(c1<c2) {
			System.out.println(c1+","+c2);
		}
		else {
			System.out.println(c2+","+c1);
		}
	}

}
