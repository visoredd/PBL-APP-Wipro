import java.io.*;
import java.util.*;

public class E3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Size of Array: ");
		int n = input.nextInt();
		System.out.println("Enter Element to Find: ");
		int k = input.nextInt();
		int pos = -1;
		int[] arr = new int[n];
		System.out.println("Enter Array: ");
		for(int i =0;i<n;i++) {
			arr[i] = input.nextInt();
			if(k==arr[i]) {
				pos = i;
			}	
		}
		System.out.println(pos);
	}
}
