import java.util.*;
import java.io.*;
public class E8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String with *: ");
		String str = sc.next();
		if(str.contains("*")) {
			int n = str.indexOf("*");
			String s = str.substring(n-1,n+2);
			str = str.replace(s,"");
			System.out.println(str);
		}
		else {
			System.out.println("String doesnt contain '*'");
		}
	}
}
