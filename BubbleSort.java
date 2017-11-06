
public class BubbleSort {
	/**
	 * @author Jacob Smith The method we create sorts an array that gets stored by a
	 *         temporary variable. The for loop is then used when we initialize i
	 *         gets 0, then for i being less than a number minus 1, we increase the
	 *         value for i by 1. Continuing with the loop we initialize j to get 1,
	 *         and when j is less than the number minus i, we increase j by 1. So if
	 *         j minus 1 is greater than j, the temp variable gets the value of j
	 *         minus 1. j minus 1 then gets the value for j and j gets the value
	 *         that the temp has.
	 * 
	 */
	public static int[] bubbleSort(int[] numbers) {

		int temp; // integer temp to store the integers as we interchange between i and j
		for (int i = 0; i < numbers.length - 1; i++) { // create the array for i

			for (int j = 1; j < numbers.length - i; j++) { // create the array for j
				if (numbers[j - 1] > numbers[j]) { // if j - 1 is greater than j
					temp = numbers[j - 1]; // store j - 1 in temp
					numbers[j - 1] = numbers[j]; // set j - 1 to j
					numbers[j] = temp; // sets j to temp
				}
			}
		}
		return numbers;
	}
}
