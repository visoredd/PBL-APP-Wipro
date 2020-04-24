import java.io.*;
import java.util.*;

public class E1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s = sc.next();
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		sb1.append(s);
		sb2.append(s);
		sb2.reverse();
		System.out.print("Palinrome: ");
		System.out.println(sb1.toString().contentEquals(sb2.toString()));
		
	}
}
