import java.util.ArrayList;

/**
 * @author Jacob Smith 
 * The ArrayList written below has an integer specified by i that will go from to to a specified
 * integer range, increasing by 1. We then divide and take the modulo of the added integers in order
 * to satisfy the omit digit.
 */
public class Omit {

	public static ArrayList<Integer> allIntegersWithout(int from, int to, int omittedDigit) {
		ArrayList<Integer> integers = new ArrayList<Integer>(); // Creates a new ArrayList on integers
		for (int i = from; i <= to; i++) { // increases i from to to and increases by 1
			if (i / 10 != omittedDigit && (i % 10 != omittedDigit)) { // if i divided by 10 and modulo 10 is not
																	  // equal to the omitted digit
				integers.add(i); // add the integers for i

			}
		}
		return integers;
	}

}
