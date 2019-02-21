package learning.algorithms.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import learning.algorithms.recursion.RecursiveLinearSearch;

public class RecursiveLinearSearchTest extends RecursiveLinearSearch {
	@Test
	public void linearSeach() {
		int[] array = new int[] {
				8, 32, 20, 3, 1, 4, 21
		};
		int x = 20;
		int expected = 2;
		assertEquals(expected, doSearch(array, x));

		x = 33;
		expected = -1;
		assertEquals(expected, doSearch(array, x));

	}
}
