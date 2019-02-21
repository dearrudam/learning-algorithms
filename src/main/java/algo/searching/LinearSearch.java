package algo.searching;

public class LinearSearch {

	/**
	 * 
	 * Time complexity : O(n)
	 * 
	 * @param array
	 * @param x
	 * @return
	 */
	public int doSearch(int[] array, int x) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == x) {
				return i;
			}
		}
		return -1;
	}

}
