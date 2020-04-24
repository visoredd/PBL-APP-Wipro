import java.io.*;
import java.util.*;

abstract class Compartment{
	public abstract String notice();
}

class FirstClass extends Compartment{
	public String notice() {
		String s = "Welcome to First Class";
		return s;
	}
}

class Ladies extends Compartment{
	public String notice() {
		String s = "Welcome to Ladies";
		return s;
	}
}

class General extends Compartment{
	public String notice() {
		String s = "Welcome to General";
		return s;
	}
}

class Luggage extends Compartment{
	public String notice() {
		String s = "Welcome to Luggage";
		return s;
	}
}

public class TestCompartment {
	public static void main(String args[]) {
		Random rand = new Random();
		Compartment[] comp = new Compartment[10];
		int n= rand.nextInt(3)+1;
		switch(n) {
		case 1:
			comp[1] = new FirstClass();
			break;
		case 2:
			comp[2] = new General();
			break;
		case 3:
			comp[3] = new Ladies();
			break;
		case 4:
			comp[4] = new Luggage();
			break;
		}
		System.out.println(comp[n].notice());
	}
}
