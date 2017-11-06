
public class ParityCorrection {

	public static int[][] correctMatrix(int[][] a) {
		
		if (ParityCorrection.findRow(a)==-1 && ParityCorrection.findColumn(a)==-1){ 
			return a; // we want the rows and columns to be == to -1 as instructed then return a
		}
		
		if(a[(ParityCorrection.findRow(a))][(ParityCorrection.findColumn(a))]==0){ // if == 0
			a[findRow(a)][findColumn(a)]=1; // then gets 1
		}else{
			a[(ParityCorrection.findRow(a))][(ParityCorrection.findColumn(a))]=0; // else it gets 0 then
																				  // return a
		}
		
		return a;
	}
	
	public static int findRow(int[][] a) {
		
		for (int i = 0; i < a.length-1; i++) { // Using the code from parity we do the sum of rows again
			int sumRow = 0;
			for (int j = 0; j < a[0].length-1; j++) {
				sumRow += a[i][j];
			}

			if (sumRow % 2 != a[i][a[0].length-1]) { // the difference is when the sum modulo 2 is not equal
													 // to the row length for rows i we return i for rows
				return i;
			}
	}
		return -1; 
	}
	
	public static int findColumn(int[][] a) {
		for (int j = 0; j < a[0].length-1; j++) { // sum of columns again like in parity
			int sumColumn = 0;
			for (int i = 0; i < a.length-1; i++) {
				sumColumn += a[i][j];
			}

			if (sumColumn % 2 != a[a.length-1][j]) { // like the rows above, when they're not equal to the column j
				return j;							 // we return j
			}
		}
		return -1;
		
		
	
}
}

