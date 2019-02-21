package learning.algorithms.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import learning.algorithms.recursion.RecursiveBinarySearch;

public class RecursiveBinarySearchTest extends RecursiveBinarySearch {
	@Test
	public void linearSeach() {
		int[] array = new int[] {
				8, 10, 22, 34, 66, 99, 101, 128, 300
		};
		int x, expected;

		x = 22;
		expected = 2;
		assertEquals(expected, doSearch(array, x));

		x = 101;
		expected = 6;
		assertEquals(expected, doSearch(array, x));

	}
}
