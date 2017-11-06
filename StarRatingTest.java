import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author David Mcdonald and Jacob Smith (tests 9-14)
 * 14 tests to check the StarRating.interpret.
 */

public class StarRatingTest {

	@Test
	public void test1() { /**
							 * This tests to see if we get an OK string for
							 * double rating 4.0
							 */

		double rating = 4.0;

		String expected = "OK";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}

	@Test
	public void test2() { /**
							 * This tests to see if we get a [HAS ONLY ONE
							 * REVIEW] string for double rating 5.0
							 */

		double rating = 5.0;

		String expected = "[HAS ONLY ONE REVIEW]";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}

	@Test
	public void test3() { /**
							 * This tests to see if we get a CRAP string for
							 * double rating 1.5
							 */

		double rating = 1.5;

		String expected = "CRAP";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}

	@Test
	public void test4() { /**
							 * This tests to see if we get an EXCELLENT string
							 * for double rating 4.5
							 */

		double rating = 4.5;

		String expected = "EXCELLENT";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}

	@Test
	public void test5() { /**
							 * This tests to see if we get a CRAP string for
							 * double rating 2.5
							 */

		double rating = 2.5;

		String expected = "CRAP";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}

	@Test
	public void test6() { /**
							 * Our rating only goes up to 5.0, but this tests to
							 * see if we get a [HAS ONLY ONE REVIEW] string for
							 * double rating that's above 5.0 like this 100
							 */

		double rating = 100;

		String expected = "[HAS ONLY ONE REVIEW]";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}

	@Test
	public void test7() {/**
							 * This tests to see if we get a CRAP string for
							 * double rating 3.0
							 */

		double rating = 3.0;

		String expected = "CRAP";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}

	@Test
	public void test8() {/**
							 * This tests to see if we get a "not rated" string
							 * for double rating -5.5 since that is not within
							 * bounds of our ratings
							 */

		double rating = -5.5;

		String expected = "not rated";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}

	@Test
	public void test9() {/**
							 * This tests to see if we get an OK string for
							 * double rating 4.1
							 */

		double rating = 4.1;

		String expected = "OK";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}

	@Test
	public void test10() {/**
							 * Our rating only goes up to 5.0, but this tests to
							 * see if we get a [HAS ONLY ONE REVIEW] string for
							 * double rating that's above 5.0 like this 5.5
							 */

		double rating = 5.5;

		String expected = "[HAS ONLY ONE REVIEW]";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}

	@Test
	public void test11() {/**
							 * This tests to see if we get a CRAP string for
							 * double rating 1.4
							 */

		double rating = 1.4;

		String expected = "CRAP";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}

	@Test
	public void test12() {/**
							 * This tests to see if we get an EXCELLENT string
							 * for double rating 4.6
							 */

		double rating = 4.6;

		String expected = "EXCELLENT";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}

	@Test
	public void test13() {/**
							 * This tests to see if we get a CRAP string for
							 * double rating 2.4
							 */

		double rating = 2.4;

		String expected = "CRAP";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}

	@Test
	public void test14() {/**
							 * Our rating only goes up to 5.0, but this tests to
							 * see if we get a [HAS ONLY ONE REVIEW] string for
							 * double rating that's above 5.0 like this 105
							 */

		double rating = 105;

		String expected = "[HAS ONLY ONE REVIEW]";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}
}