package learning.algorithms.searching;

import java.util.Arrays;

public class BinarySearch implements SearchingAlgorithm {

	/**
	 * Time complexity: 0(log(n))
	 * 
	 * @param array
	 * @param x
	 * @return
	 */
	@Override
	public <T> int doSearch(T[] array, Comparable<T> query) {
		System.out.println("Given " + Arrays.toString(array));
		int p = 0;
		int r = array.length - 1;
		while (p <= r) {
			int q = (p + r) / 2;
			System.out.print("-> comparing element[" + q + "] = " + array[q]);
			int comparison = query.compareTo(array[q]);
			if (comparison == 0) {
				System.out.println("-> found in index " + q );
				return q;
			} else if (comparison < 0) {
				System.out.println("-> it's greater than the target value");
				r = q - 1;
			} else {
				System.out.println("-> it's smaller than the target value");
				p = q + 1;
			}
		}
		System.out.println("-> not found");
		return -1;
	}
}
