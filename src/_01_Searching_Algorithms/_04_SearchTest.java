package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	public void testLinearSearch() {
		// 1. use the assertEquals method to test your linear search method.
		String[] a = new String[] { "abundance", "accede", "accentuate", "accomplish", "accorded", "accurate",
				"acquire", "additional", "adjustment", "admissible", "advise", "aggregate" };
		String a1 = "accomplish";
		assertEquals(3, _00_LinearSearch.linearSearch(a, a1));

		String[] b = new String[] { "basis", "because", "belated", "beneficial", "bestow", "beverage" };
		String b1 = "believe";
		assertEquals(-1, _00_LinearSearch.linearSearch(b, b1));

		String[] c = new String[] { "capability", "caveat", "cease", "chauffeur", "clearly", "combined", "commence",
				"conceal" };
		String c1 = "commence";
		assertEquals(6, _00_LinearSearch.linearSearch(c, c1));
	}

	@Test
	public void testBinarySearch() {
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int a1 = 5;
		assertEquals(4, _01_BinarySearch.binarySearch(a, 0, 9, a1));

		int[] b = new int[] { 2, 4, 6, 8, 10, 12 };
		int b1 = 1;
		assertEquals(-1, _01_BinarySearch.binarySearch(b, 0, 5, b1));

		int[] c = new int[] { 1, 3, 5, 7 };
		int c1 = 3;
		assertEquals(1, _01_BinarySearch.binarySearch(c, 0, 3, c1));
	}

	@Test
	public void testInterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int a1 = 7;
		assertEquals(6, _02_InterpolationSearch.interpolationSearch(a, a1));

		int[] b = new int[] { 1, 2, 3 };
		int b1 = 1;
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(b, b1));

		int[] c = new int[] { 3, 4, 5, 6, 7, 8 };
		int c1 = 10;
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(c, c1));
	}

	@Test
	public void testExponentialSearch() {
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
		int[] a = new int[] { 0, 1, 2, 3, 4, 5 };
		int a1 = 0;
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(a, a1));

		int[] b = new int[] { 16, 17 };
		int b1 = 17;
		assertEquals(1, _03_ExponentialSearch.exponentialSearch(b, b1));

		int[] c = new int[] { 1, 2, 3, 4 };
		int c1 = 0;
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(c, c1));

	}
}
