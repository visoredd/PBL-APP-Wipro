import java.io.*;
import java.util.*;

public class E4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.next();
		int n = str.length();
		String s;
		if(n%2==0) {
			s = str.substring(0,n/2);
		}
		else {
			s=null;
		}
		System.out.println(s);
	}
}
