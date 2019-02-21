package algo.recursion;

public class RecursiveLinearSearch {

	public int doSearch(int[] array, int x) {
		return recursiveLinearSearch(array, 0, x);
	}

	private int recursiveLinearSearch(int[] array, int i, int x) {
		if (i > array.length - 1) {
			return -1;
		} else if (array[i] == x) {
			return i;
		} else {
			return recursiveLinearSearch(array, i + 1, x);
		}
	}
}