package learning.algorithms.searching;

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
		for (int i = 0; i < array.length; i++) {
			if (query.compareTo(array[i]) == 0) {
				return i;
			}
		}
		return -1;
	}

}
