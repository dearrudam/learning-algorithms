package learning.algorithms.searching;

import java.util.Arrays;

public class LinearSearch implements SearchingAlgorithm {

	/**
	 * 
	 * Time complexity : O(n)
	 * 
	 * @param array
	 * @param x
	 * @return
	 */
	@Override
	public <T> int doSearch(T[] array, Comparable<T> query) {
		System.out.println("Given " + Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			System.out.println("-> comparing element[" + i + "] = " + array[i]);
			if (query.compareTo(array[i]) == 0) {
				System.out.println("-> found in index " + i );
				return i;
			}
		}
		System.out.println("-> not found");
		return -1;
	}

}
