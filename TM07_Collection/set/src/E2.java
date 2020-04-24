import java.util.*;
import java.io.*;
public class E2 {
	public static void main(String args[]) {
		HashSet<String> H1 = new HashSet<>();
		H1.add("Aayush");
		H1.add("Shivam");
		H1.add("Ralph");
		H1.add("John");
		Iterator<String> it = H1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
