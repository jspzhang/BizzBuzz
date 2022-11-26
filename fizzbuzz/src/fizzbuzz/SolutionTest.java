package fizzbuzz;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SolutionTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testFizzBuzz() {
		Solution solution = new Solution();
		@SuppressWarnings("serial")
		ArrayList<String> list = new ArrayList<String>() {
			{
				add("1");
				add("2");
				add("Fizz");
				add("4");
				add("Buzz");
				add("Fizz");
				add("7");
				add("8");
				add("Fizz");
				add("Buzz");
				add("11");
				add("Fizz");
				add("13");
				add("14");
				add("FizzBuzz");
			}
		};
		int n = 15;
		assertEquals(list, solution.fizzBuzz(n));
	}

}
