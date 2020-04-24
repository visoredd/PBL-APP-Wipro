import java.io.*;
import java.util.*;
public class E3 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer between 1 & 255: ");
		int i = sc.nextInt();
		if(i>0 & i<255) {
			String str = Integer.toBinaryString(i);
			int l = 8-str.length();
			String zeros = "";
			for(int j =0;j<l;j++) {
				zeros+="0";
			}
			System.out.println(zeros+str);
			
		}else {
			System.out.println("Number is out of Range.");
		}
	}
}
