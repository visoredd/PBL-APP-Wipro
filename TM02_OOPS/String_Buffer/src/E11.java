import java.io.*;
import java.util.*;

public class E11 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a Strings seperated by ',': ");
		String[] str = br.readLine().split(",");
		String str1 = str[0];
		String str2 = str[1];
		int n1 = str1.length();
		int n2 = str2.length();
		int pos;
		String result="";
		for(int i =0;i<n1-n2+1;i++) {
			pos = i;
			String s = str1.substring(i,n2+i);
			if(s.equals(str2)) {
				if(pos-1> 0) {
					result+=str1.charAt(pos-1);
				}
				if(pos+n2<str1.length()) {
					result+=str1.charAt(pos+n2);
				}
			}
		}
		System.out.println(result);
	}
	
}
