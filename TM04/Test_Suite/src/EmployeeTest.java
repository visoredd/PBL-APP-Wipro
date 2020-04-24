import static org.junit.Assert.*;

import org.junit.Test;
import java.io.*;
import java.util.*;
public class EmployeeTest {

	@Test
	public void test() {
		Employee em = new Employee();
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Aayush");
		arr.add("Shivam");
		arr.add("Mangat");
		assertEquals("FOUND",em.findName(arr,"Aayush"));
	}

}
