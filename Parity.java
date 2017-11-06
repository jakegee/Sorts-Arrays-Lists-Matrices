
public class Parity {
	/**
	 * @author Jacob Smith 
	 * The method we create basically transfers, or extends,
	 * data from one matrix to another. We are adding a row and a
	 * column, then we are checking through a boolean method to return a
	 * true from when the added bits are 0, and false for when they're a
	 * 1.
	 */
	public static int[][] addParity(int[][] a) {
		int[][] extendedMatrix = new int[a.length + 1][a[0].length + 1]; // we set an array to a new extended length
		for (int i = 0; i < a.length; i++) { // establishing the array for i, rows
			for (int j = 0; j < a[0].length; j++) { // establishing array for j, columns 
				extendedMatrix[i][j] = a[i][j];
			}
		}

		for (int i = 0; i < extendedMatrix.length - 1; i++) { // for loop to increase i, then j, to add
			int sumRow = 0;
			for (int j = 0; j < extendedMatrix[0].length; j++) {
				sumRow += extendedMatrix[i][j];
			}

			if (sumRow % 2 != 0) { // if the sum of the row does not equal 0
				extendedMatrix[i][extendedMatrix[0].length - 1] = 1; // then it must be 1
			}
		}

		for (int j = 0; j < extendedMatrix[0].length - 1; j++) { // same as for the rows, but now for columns
			int sumColumn = 0;
			for (int i = 0; i < extendedMatrix.length; i++) {
				sumColumn += extendedMatrix[i][j];
			}

			if (sumColumn % 2 != 0) { // if columns sum does not equal 0 then 
				extendedMatrix[extendedMatrix.length - 1][j] = 1; // it must be 1
			}
		}
		return extendedMatrix;
	}

	public static boolean checkParity(int[][] a) {
		boolean checkRow = false; // setting the boolean of row and column to false
		boolean checkColumn = false;

		for (int i = 0; i < a.length; i++) { // we perform the same calculation as above
			int sumRow = 0;
			for (int j = 0; j < a[0].length; j++) {
				sumRow += a[i][j];
			}
			if (sumRow % 2 == 0 && a[i][a.length - 1] == 1) { // if the row sum is 0 and is also 1
				checkRow = true; // we return true
			}
		}
		for (int j = 0; j < a[0].length; j++) { // we perform the same calculation for columns as above
			int sumColumn = 0;
			for (int i = 0; i < a.length; i++) {
				sumColumn += a[i][j];
			}
			if (sumColumn % 2 == 0 && a[a.length - 1][j] == 1) { // if the column sum is 0 and is 1
				checkColumn = true; // return true
			}
		}
		if (checkRow == true && checkColumn == true) { // return true if row and column return true
			return true;
		} else
			return false; // all else is false
	}
}