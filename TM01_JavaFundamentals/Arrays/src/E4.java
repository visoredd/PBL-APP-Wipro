import java.io.*;
import java.util.*;

public class E4 {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array seperated by space: ");
		String[] strr = br.readLine().split(" ");
		int num = 0;
		for(int i =0;i<strr.length;i++) {
			num = Integer.parseInt(strr[i]);
			System.out.print((char)num + " ");
		}
		System.out.println();
		
	}
}
