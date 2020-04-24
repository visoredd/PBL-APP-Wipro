import java.io.*;
import java.util.*;

public class E7 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Character: ");
		char c1 = input.next().charAt(0);
		if(Character.isUpperCase(c1)) {
			System.out.println(Character.toLowerCase(c1));
		}
		else {
			System.out.println(Character.toUpperCase(c1));
		}
	}

}
