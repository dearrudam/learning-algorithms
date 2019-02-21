package algo.recursion;

public class RecursiveBinarySearch {

	public int doSearch(int[] array, int x) {
		return recursiveBinarySearch(array, 0, array.length - 1, x);
	}

	private int recursiveBinarySearch(int[] array, int p, int r, int x) {
		if (p > r) {
			return -1;
		} else {
			int q = ((p + r) / 2);
			if (array[q] == x) {
				return q;
			} else if (array[q] > x) {
				return recursiveBinarySearch(array, p, q - 1, x);
			} else {
				return recursiveBinarySearch(array, q + 1, r, x);
			}
		}
	}
}