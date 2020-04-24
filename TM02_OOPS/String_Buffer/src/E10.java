import java.io.*;
import java.util.*;

public class E10 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a Strings seperated by ',': ");
		String[] str = br.readLine().split(",");
		String s = str[0];
		int n = Integer.parseInt(str[1]);
		int l = s.length();
		String sb = s.substring(l-n);
		String result = "";
		while(n>0) {
			result+=sb;
			n--;
		}
		System.out.println(result);
	}
}
