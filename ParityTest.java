import static org.junit.Assert.*;
import org.junit.Test;
/**
 * @author David Mcdonald and Jacob Smith (tests 7-12)
 * 12 tests to check the Parity Class.
 */

public class ParityTest {

	@Test
	public void test1() { /**
							* Test that adds a 0, if there's an 
							* even number of 1's, or 1, if there's 
							* an odd number of 1's, for a new column or row
							*/
		  int[][] test1 = {{0,1,1,1,0},
                                   {1,0,0,0,1},
                                   {1,0,1,0,1}};
		  
		 
		  //expected array after adding parity bits
		  int [][] expected = {{0, 1, 1, 1, 0, 1},
		                       {1, 0, 0, 0, 1, 0},
		                       {1, 0, 1, 0, 1, 1},
		                       {0, 1, 0, 1, 0, 0}};
		  
//			public static boolean checkParity(int[][] a) {
//			int[][] checked = Parity
//		}	
//		if (addParity(a));
//			System.out.println("true");
//		else;
//			System.out.println("false");
					  assertArrayEquals(expected, Parity.addParity(test1));
	}

	
	@Test
	public void test2() { /**
							* Tests whether the boolean asserts a 
							* true or false as well as the subsequent 
							* tests until specified.
							*/
		  int[][] test1 = {{0,1,1,1,0},
                                   {1,0,0,0,1},
                                   {1,0,1,0,1}};
		  
		assertFalse(Parity.checkParity(test1));
	}


	@Test
	public void test3() {
		  int[][] test1 = {{0,1,1,1,0},
                                   {1,0,0,0,1},
                                   {1,0,1,0,1}};
		  
		  assertTrue(Parity.checkParity(Parity.addParity(test1)));
	}


	@Test
	public void test4() {/**
	 						* Test that adds a 0, if there's an 
	 						* even number of 1's, or 1, if there's 
	 						* an odd number of 1's, for a new column or row
	 						*/

		  int[][] test4 = {{1,1,1,1,1},
	                           {1,1,1,1,1},
	                           {1,1,1,1,0}};
		  
		  //expected array after adding parity bits
		  int [][] expected = {{1, 1, 1, 1, 1, 1},
		                       {1, 1, 1, 1, 1, 1},
		                       {1, 1, 1, 1, 0, 0},
		                       {1, 1, 1, 1, 0, 0}};
		  
		
		 int  [][] actual = Parity.addParity(test4);
		 assertArrayEquals(expected, actual);
	}

	@Test
	public void test5() { /**
							* Tests whether the boolean asserts a 
							* true or false as well as the subsequent 
							* tests until specified.
							*/

		  int[][] test5 = {{1,1,1,1,1},
	                           {1,1,1,1,1},
	                           {1,1,1,1,0}};
		  
		 assertFalse(Parity.checkParity(test5));
	}
	
	@Test
	public void test6() {

		  int[][] test6 = {{1,1,1,1,1},
	                           {1,1,1,1,1},
	                           {1,1,1,1,0}};
		  
		 assertTrue( Parity.checkParity(Parity.addParity(test6)));
	
	}
	@Test
	public void test7() {/**
							* Test that adds a 0, if there's an 
							* even number of 1's, or 1, if there's 
							* an odd number of 1's, for a new column or row
							*/
		  int[][] test7 = {{0,1,1,1,0},
                                   {1,1,0,1,1},
                                   {1,0,1,0,1}};
		  
		 
		  //expected array after adding parity bits
		  int [][] expected = {{0, 1, 1, 1, 0, 1},
		                       {1, 1, 0, 1, 1, 0},
		                       {1, 0, 1, 0, 1, 1},
		                       {0, 0, 0, 0, 0, 0}};
		  
//			public static boolean checkParity(int[][] a) {
//			int[][] checked = Parity
//		}	
//		if (addParity(a));
//			System.out.println("true");
//		else;
//			System.out.println("false");
					  assertArrayEquals(expected, Parity.addParity(test7));
	}

	
	@Test
	public void test8() { /**
	 						* Tests whether the boolean asserts a 
	 						* true or false as well as the subsequent 
	 						* tests until specified.
	 						*/
		  int[][] test8 = {{0,1,0,1,0},
                                   {1,0,1,0,1},
                                   {1,0,0,0,1}};
		  
		assertFalse(Parity.checkParity(test8));
	}


	@Test
	public void test9() {
		  int[][] test9 = {{0,1,0,1,0},
                                   {1,1,0,0,1},
                                   {1,1,1,0,1}};
		  
		  assertTrue(Parity.checkParity(Parity.addParity(test9)));
	}


	@Test
	public void test10() {/**
							* Test that adds a 0, if there's an 
							* even number of 1's, or 1, if there's 
							* an odd number of 1's, for a new column or row
							*/

		  int[][] test10 = {{0,0,0,0,0},
	                           {1,1,1,1,1},
	                           {1,1,1,1,0}};
		  
		  //expected array after adding parity bits
		  int [][] expected = {{0, 0, 0, 0, 0, 0},
		                       {1, 1, 1, 1, 1, 1},
		                       {1, 1, 1, 1, 0, 0},
		                       {0, 0, 0, 0, 1, 0}};
		  
		
		 int  [][] actual = Parity.addParity(test10);
		 assertArrayEquals(expected, actual);
	}

	@Test
	public void test11() { /**
	 						  * Tests whether the boolean asserts a 
	 						  * true or false as well as the subsequent 
	 						  * tests until specified.
	 						  */

		  int[][] test11 = {{1,1,0,1,1},
	                           {1,1,0,1,1},
	                           {1,1,1,1,0}};
		  
		 assertFalse(Parity.checkParity(test11));
	}
	
	@Test
	public void test12() {

		  int[][] test12 = {{1,0,1,1,1},
	                           {1,0,1,1,1},
	                           {1,0,1,1,0}};
		  
		 assertTrue( Parity.checkParity(Parity.addParity(test12)));
	
	}
	
	
	
}