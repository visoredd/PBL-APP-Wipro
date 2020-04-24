import java.io.*;
import java.util.*;

public class E13 {
	public static void main(String args[]) {
		int flag =0;
		for(int num=10;num<=99;num++) {	
			for(int i =2;i<=num/2;i++) {
					if(num%i==0) {
						flag = 1;
						break;
					}
					else{
						flag = 0;
					}
				}
			
			if(flag==0) {
				System.out.println(num);
			}
		}
	}

}
