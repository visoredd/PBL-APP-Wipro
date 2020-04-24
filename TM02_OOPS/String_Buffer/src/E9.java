import java.util.*;
import java.io.*;
public class E9 {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a Strings seperated by ',': ");
		String[] str = br.readLine().split(",");
		String result = "";
		if(str[0].length()<str[1].length()) {
			for(int i =0;i<str[0].length();i++) {
				result +=str[0].charAt(i);
				result+=str[1].charAt(i);
			}
			result+=str[1].substring(str[0].length());
		}
		else {
			for(int i =0;i<str[1].length();i++) {
				result +=str[0].charAt(i);
				result+=str[1].charAt(i);
			}
			result+=str[0].substring(str[1].length());
		}
		System.out.println(result);
	}
}
