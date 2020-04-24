import java.util.*;
import java.io.*;
public class E7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.next();
		String result = str;
		int n = str.length();
		if(str.charAt(0)=='x' && str.charAt(n-1)=='x') {
			result = str.substring(1,n-1);
		}
		System.out.println(result);
	}
}
