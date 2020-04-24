import java.io.*;
import java.util.*;
class CountryH {
	Hashtable<String,String> M1 = new Hashtable<>();
	public Hashtable saveCountryCapital(String CountryName, String capital) {
		M1.put(CountryName,capital);
		return M1;
	}
	public String getCapital(String CountryName) {
		for(Map.Entry<String,String> entry:M1.entrySet()) {
			if(entry.getKey()==CountryName) {
				return entry.getValue();
			}
		}
		return "Country Name Not Found in Hash Map";
	}
	public String getCountry(String capitalName) {
		for(Map.Entry<String,String> entry:M1.entrySet()) {
			if(entry.getValue()==capitalName) {
				return entry.getKey();
			}
		}
		return "Capital Name Not Found in Hash Map";
	}
	public Hashtable capital() {
		Hashtable<String,String> M2 = new Hashtable<>();
		for(Map.Entry<String,String> entry:M1.entrySet()) {
			M2.put(entry.getValue(), entry.getKey());
		}
		return M2;
	}
	public ArrayList array() {
		ArrayList<String> M2 = new ArrayList<>();
		for(Map.Entry<String,String> entry:M1.entrySet()) {
			M2.add(entry.getKey());
		}
		return M2;
	}
}

public class E6 {
	public static void main(String args[]) {
		CountryH c = new CountryH();
		c.saveCountryCapital("India","Delhi");
		c.saveCountryCapital("Tokyo","Japan");
		System.out.println(c.getCapital("Tokyo"));
		System.out.println(c.getCountry("Delhi"));
		System.out.println(c.capital());
		System.out.println(c.array());
	}
}
