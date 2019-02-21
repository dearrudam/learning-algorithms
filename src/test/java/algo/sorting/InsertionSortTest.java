package algo.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsertionSortTest extends InsertionSort {

	@Test
	public void sortWithComparableInstances() {

		Integer[] items = new Integer[] {
				6, 2, 3, 4, 1, 5
		};
		Integer[] expecteds = new Integer[] {
				1, 2, 3, 4, 5, 6
		};
		assertArrayEquals(expecteds, sort(items));
	}

	@Test
	public void sortWithoutComparableInstances() {
		
		Integer[] items = new Integer[] {
				6, 2, 3, 4, 1, 5
		};
		
		Integer[] expecteds = new Integer[] {
				1, 2, 3, 4, 5, 6
		};
		
		assertArrayEquals(expecteds, sort(items,Integer::compare));
		
	}

}
