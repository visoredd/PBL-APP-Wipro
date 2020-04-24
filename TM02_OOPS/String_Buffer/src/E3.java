import java.io.*;
import java.util.*;

public class E3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		int n = s.length();
		String sb = s.substring(0,2);
		String result = "";
		while(n>0) {
			result+=sb;
			n--;
		}
		System.out.println(result);
	}
}
