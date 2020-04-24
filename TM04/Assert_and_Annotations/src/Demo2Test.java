import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {

	@Test
	public void test() {
		Demo2 d2 = new Demo2();
		assertTrue(d2.palindromeCheck("mom"));
	}

}
