import java.io.*;
import java.util.*;

public class E19 {
	public static void main(String args[]) {
		int count = 0;
		int num = 1;
		while(count<5) {
			if(num%2==0 && num%3==0 && num%5==0) {
				count+=1;
				System.out.println(num);
			}
			num+=1;
		}
	}
}
