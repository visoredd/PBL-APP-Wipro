import java.io.*;
import java.util.*;
public class E4 {
	public static void main(String args[]) {
		CountryH c = new CountryH();
		c.saveCountryNames("Japan");
		c.saveCountryNames("India");
		c.saveCountryNames("China");
		c.saveCountryNames("Russia");
		System.out.println(c.getCountry("Japan"));
	}
}
