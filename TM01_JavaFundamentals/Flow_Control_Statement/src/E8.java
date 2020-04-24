import java.io.*;
import java.util.*;

public class E8 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Character: ");
		char c1 = input.next().charAt(0);
		switch(c1) {
		case 'R':
			System.out.println("Red");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'W':
			System.out.println("White");
			break;
		default:
			System.out.println("Invalid Code");
		}
		
	}

}
