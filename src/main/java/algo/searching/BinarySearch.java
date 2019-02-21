package algo.searching;

public class BinarySearch {

	/**
	 * Time complexity: 0(log(n))
	 * 
	 * @param array
	 * @param x
	 * @return
	 */
	public int doSearch(int[] array, int x) {
		int p = 0;
		int r = array.length - 1;
		while (p < r) {
			int q = ((p + r) / 2);
			if (array[q] == x) {
				return q;
			} else if (array[q] > x) {
				r = q - 1;
			} else {
				p = q + 1;
			}
		}
		return -1;
	}
}
