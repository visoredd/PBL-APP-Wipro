import java.io.*;
import java.util.*;
public class Country {
	HashSet<String> H1 = new HashSet<>();
	public HashSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	public String getCountry(String CountryName) {
		Iterator<String> it = H1.iterator();
		while(it.hasNext()) {
			if(it.next()==CountryName) {
				return CountryName;
			}
		}
		return "null";
	}
}
