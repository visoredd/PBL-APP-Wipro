import java.io.*;
import java.util.*;
public class M1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String S1: ");
		String S1 = sc.next();
		System.out.println("Enter String S2: ");
		String S2 = sc.next();
		String str = "";
		for(int i=0;i<S1.length();i++) {
			if(i%2==0) {
				str+=S2;
			}
			else {
				str+=String.valueOf(S1.charAt(i));
			}
		}
		System.out.println("1. "+str);
		int n1 = S1.length();
		int n2 = S2.length();
		int count = 0;
		
		for(int i =0;i<n1-n2+1;i++) {
			str = S1.substring(i,n2+i);
			if(str.contentEquals(S2)) {
				count++;
			}
		}
		if(count>1) {
			int los2 = S1.lastIndexOf(S2.charAt(0));
			StringBuffer sb = new StringBuffer(S2);
			sb.reverse();
			String sr = String.valueOf(sb);
			str = S1.substring(0,los2)+sr+S1.substring(los2+S2.length());
		}
		else {
			str= S1+S2;
		}
		System.out.println("2. "+str);
		if(count>1) {
			int los2 = S1.indexOf(String.valueOf(S2.charAt(0)));
			String sr = "";
			str = S1.substring(0,los2)+sr+S1.substring(los2+S2.length());
		}
		else {
			str= S1;
		}
		System.out.println("3. "+str);
		if(n2%2==0) {
			str = S2.substring(0,n2/2)+S1+S2.substring(n2/2);
		}
		else {
			str = S2.substring(0,(n2/2)+1)+S1+S2.substring((n2/2)+1);
		}
		System.out.println("4. "+str);
		str = "";
		count =0;
		for(int i =0;i<S1.length();i++) {
			if(S2.contains(String.valueOf(S1.charAt(i)))) {
				str+="*";
				count++;
			}
			else {
				str+=String.valueOf(S1.charAt(i));
			}
		}
		System.out.println("5. "+str);
	}
}
