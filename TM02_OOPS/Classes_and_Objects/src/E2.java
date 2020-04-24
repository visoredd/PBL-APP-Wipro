import java.io.*;
import java.util.*;

class Calculator{
	public static int intPower(int num1, int num2) {
		return (int)Math.pow(num1, num2);
	}
	public static double doublePower(double num1, double num2) {
		return Math.pow(num1, num2);
	}
}

public class E2 {
	public static void main(String args[]) {
		System.out.println("Int Power: "+Calculator.intPower(10, 2));
		System.out.println("Double Power: "+Calculator.doublePower(10, 3));
	}
}
