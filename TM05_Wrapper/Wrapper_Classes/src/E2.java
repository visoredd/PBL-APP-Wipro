import java.io.*;
import java.util.*;
public class E2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int i = sc.nextInt();
		System.out.println("Given Number :"+i);
		System.out.println("Binary equivalent :"+Integer.toBinaryString(i));
		System.out.println("Octal quivalent: "+Integer.toOctalString(i));
		System.out.println("Hexadecimal quivalent: "+Integer.toHexString(i));
	}

}
