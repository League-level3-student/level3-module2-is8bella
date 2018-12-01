package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] a = new String[]{"abundance", "accede", "accentuate", "accomplish", "accorded", "accurate", "acquire", "additional", "adjustment", "admissible", "advise", "aggregate"};
		String a1 = "accomplish";
		assertEquals(3, _00_LinearSearch.linearSearch(a, a1));
		
		String[] b = new String[] {"basis", "because", "belated", "beneficial", "bestow", "beverage"};
		String b1 = "believe";
		assertEquals(-1, _00_LinearSearch.linearSearch(b, b1));
		
		String[] c = new String[] {"capability", "caveat", "cease", "chauffeur", "clearly", "combined", "commence", "conceal"};
		String c1 = "commence";
		assertEquals(6, _00_LinearSearch.linearSearch(c, c1));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		assertEquals(, _01_BinarySearch.binarySearch(a, 1, 10, 5));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
