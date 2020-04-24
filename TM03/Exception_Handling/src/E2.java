import java.util.*;
import java.io.*;

public class E2 {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number of elements in the array");
	 int n = sc.nextInt();
	 System.out.println("Enters the elements in the array");
	 int[] arr = new int[n];
	 for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
	 }
	 System.out.println("Enter the index of the array element you want to access");
	 int k = sc.nextInt();
	 try {
		 System.out.println("The array element at index "+k+" = "+arr[k]);
	 }
	 catch(ArrayIndexOutOfBoundsException e) {
		 System.out.println(e);
	 }
 }
}
