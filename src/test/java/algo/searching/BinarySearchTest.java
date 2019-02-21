package algo.searching;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest extends BinarySearch {

	@Test
	public void binarySearch() {
		int[] array = new int[] {
				8, 10, 22, 34, 66, 99, 101, 128, 300
		};
		int x = 22;
		int expected = 2;
		assertEquals(expected, doSearch(array, x));

		x = 101;
		expected = 6;
		assertEquals(expected, doSearch(array, x));

	}

}
