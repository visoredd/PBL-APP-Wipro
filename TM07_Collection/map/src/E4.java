import java.io.*;
import java.util.*;
class ContactList{
	HashMap<String,String> map = new HashMap<>();
	public void addContact(String name,String number) {
		map.put(name, number);
	}
	public void deleteContact(String name) {
		map.remove(name);
	}
	public boolean checkName(String name) {
		return map.containsKey(name);
	}
	public boolean checkNumber(String n) {
		return map.containsValue(n);
	}
}
public class E4 {
	public static void main(String args[]) {
		ContactList c = new ContactList();
		c.addContact("Aayush","9050732241");
		c.addContact("Shivam","9050031136");
		c.addContact("Atul","9812431136");
		System.out.println(c.checkName("Aayush"));
		System.out.println(c.checkNumber("9812431136"));
		Iterator<Map.Entry<String,String>> itr = c.map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String,String> m = itr.next();
			System.out.println("State: "+m.getKey()+", Capital: "+m.getValue());
		}
	}
}
