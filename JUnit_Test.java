import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnit_Test {

	@Test
	public void test() {
		
		System.out.println("This is a failed test");
		String test = "This is a failed test";
		assertEquals("This is a failed test", test);
		
	}

}
