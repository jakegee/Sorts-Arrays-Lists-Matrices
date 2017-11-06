import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

/**
 * @author David Mcdonald & Jacob Smith4 tests to check the Omit.allIntegersWithout method.
 * In all these subsequent tests we are just checking to see if Omit.java is removing all the integers
 * specified in Omit.allIntegersWithout from the ArrayList where we specify the range in the first 2
 * spaces and the integer to be removed from the ArrayList in the 3rd spot. 
 */
public class OmitTest {

	@Test
	public void test1() {

		ArrayList<Integer> expected = new ArrayList<Integer>(
				Arrays.asList(20, 21, 22, 24, 25, 26, 27, 28, 29, 40, 41, 42, 44, 45));
		ArrayList<Integer> actual = Omit.allIntegersWithout(20, 45, 3);

		assertEquals(expected, actual);

	}

	@Test
	public void test2() {

		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14));
		ArrayList<Integer> actual = Omit.allIntegersWithout(2, 15, 5);

		assertEquals(expected, actual);

	}

	@Test
	public void test3() {

		ArrayList<Integer> expected = new ArrayList<Integer>(
				Arrays.asList(20, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36, 37, 38));
		ArrayList<Integer> actual = Omit.allIntegersWithout(16, 38, 1);

		assertEquals(expected, actual);

	}

	@Test
	public void test4() {

		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9));
		ArrayList<Integer> actual = Omit.allIntegersWithout(1, 15, 1);

		assertEquals(expected, actual);

	}

	@Test
	public void test5() {

		ArrayList<Integer> expected = new ArrayList<Integer>(
				Arrays.asList(30, 31, 32, 33, 35, 36, 37, 38, 39));
		ArrayList<Integer> actual = Omit.allIntegersWithout(30, 43, 4);

		assertEquals(expected, actual);

	}

	@Test
	public void test6() {

		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20));
		ArrayList<Integer> actual = Omit.allIntegersWithout(5, 20, 6);

		assertEquals(expected, actual);

	}

	@Test
	public void test7() {

		ArrayList<Integer> expected = new ArrayList<Integer>(
				Arrays.asList(30, 31, 33, 34, 35, 36, 37, 38, 39, 40));
		ArrayList<Integer> actual = Omit.allIntegersWithout(20, 40, 2);

		assertEquals(expected, actual);

	}

	@Test
	public void test8() {

		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList());
		ArrayList<Integer> actual = Omit.allIntegersWithout(10, 15, 1);

		assertEquals(expected, actual);

	}
}