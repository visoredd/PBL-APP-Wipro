import java.io.*;
import java.util.*;
public class E1 {
	public static void main(String args[]) {
		Country c = new Country();
		c.saveCountryNames("Japan");
		c.saveCountryNames("India");
		c.saveCountryNames("China");
		c.saveCountryNames("Russia");
		System.out.println(c.getCountry("Japan"));
	}
}
