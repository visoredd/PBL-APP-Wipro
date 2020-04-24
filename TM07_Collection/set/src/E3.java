import java.util.*;
public class E3 {
	public static void main(String args[]) {
		Collection<String> t = new TreeSet<>(Collections.reverseOrder());
		t.add("Aayush");
		t.add("Shivam");
		t.add("Harit");
		t.add("Rishu");

		Iterator<String> it = t.iterator();
		String query = "Atul";
		boolean result = false;
		
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");
	}
}
