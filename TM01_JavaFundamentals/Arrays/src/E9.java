import java.io.*;
import java.util.*;

public class E9 {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array with seperated space: ");
		String[] strr = br.readLine().split(" ");
		if(strr.length==4) {
			int count = 0;
			int[][] arr = new int[2][2];
			for(int i =0;i<2;i++) {
				for(int j=0;j<2;j++) {
					arr[i][j]= Integer.parseInt(strr[count++]);
				}
			}
			System.out.println("The given array is: ");
			for(int k =0;k<2;k++) {
				for(int l=0;l<2;l++) {
					System.out.print(arr[k][l]+" ");
				}
				System.out.println();
			}
			System.out.println("The reverse of the array is: ");
			for(int p =1;p>=0;p--) {
				for(int o=1;o>=0;o--) {
					System.out.print(arr[p][o]+" ");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Please enter 4 integer nmumber");
		}
		
	}
}
