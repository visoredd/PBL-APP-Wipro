import java.io.*;
import java.util.*;

public class E5 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Character: ");
		char c1 = input.next().charAt(0);
		if(Character.isDigit(c1)) {
			System.out.println("Digit");
		}
		else if(Character.isLetter(c1)){
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Special Character");
		}
	}

}
