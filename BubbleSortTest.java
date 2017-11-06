import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author David Mcdonald and Jacob Smith (tests 5 through 8) 8 tests to check
 *         for BubbleSort to sort the integers in numerical ascending order.
 */

public class BubbleSortTest {

	@Test
	public void test1() {

		int[] a = { 5, 2, 7, 6, 8, 1, 5 };

		int[] expected = { 1, 2, 5, 5, 6, 7, 8 };
		int[] actual = BubbleSort.bubbleSort(a);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test2() {

		int[] a = { 8, 5, 7, 6, 2, 7, 6, 1, 2, 5, 4, 9 };

		int[] expected = { 1, 2, 2, 4, 5, 5, 6, 6, 7, 7, 8, 9 };
		int[] actual = BubbleSort.bubbleSort(a);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test3() {

		int[] a = { 5, 4, 2, 7, 5, 4, 8, 1, 7, 3, 9, 0, 1, 6, 7 };

		int[] expected = { 0, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 7, 7, 8, 9 };
		int[] actual = BubbleSort.bubbleSort(a);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test4() {

		int[] a = { 5, 2, 4, 0, 8, 7, 6, 3, 0, 7, 8, 5, 4, 6, 3, 0, 8, 2, 7, 6, 3, 9, 0 };

		int[] expected = { 0, 0, 0, 0, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9 };
		int[] actual = BubbleSort.bubbleSort(a);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test5() {

		int[] a = { 6, 3, 8, 7, 9, 2, 6 };

		int[] expected = { 2, 3, 6, 6, 7, 8, 9 };
		int[] actual = BubbleSort.bubbleSort(a);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test6() {

		int[] a = { 7, 4, 6, 5, 1, 6, 5, 1, 1, 4, 3, 8 };

		int[] expected = { 1, 1, 1, 3, 4, 4, 5, 5, 6, 6, 7, 8 };
		int[] actual = BubbleSort.bubbleSort(a);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test7() {

		int[] a = { 6, 5, 3, 8, 6, 5, 9, 2, 8, 4, 9, 0, 2, 7, 8 };

		int[] expected = { 0, 2, 2, 3, 4, 5, 5, 6, 6, 7, 8, 8, 8, 9, 9 };
		int[] actual = BubbleSort.bubbleSort(a);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test8() {

		int[] a = { 4, 3, 3, 0, 7, 6, 5, 2, 0, 6, 7, 4, 3, 5, 2, 0, 7, 1, 6, 5, 2, 8, 0 };

		int[] expected = { 0, 0, 0, 0, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8 };
		int[] actual = BubbleSort.bubbleSort(a);

		assertArrayEquals(expected, actual);
	}
}