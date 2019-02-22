package learning.algorithms.recursion;

import java.util.Arrays;

import learning.algorithms.searching.SearchingAlgorithm;

public class RecursiveBinarySearch implements SearchingAlgorithm {

	public <T> int search(T[] array, Comparable<T> comparable) {
		System.out.println("Given " + Arrays.toString(array));
		return recursiveBinarySearch(array, 0, array.length - 1, comparable);
	}

	private <T> int recursiveBinarySearch(T[] array, int p, int r, Comparable<T> comparable) {
		if (p > r) {
			System.out.println("-> not found");
			return -1;
		}
		int q = (p + r) / 2;
		System.out.print("-> comparing element[" + q + "] = " + array[q] + " ");
		int comparison = comparable.compareTo(array[q]);
		if (comparison == 0) {
			System.out.println("-> found in index " + q);
			return q;
		} else if (comparison < 0) {
			System.out.println("-> it's greater than the target value");
			return recursiveBinarySearch(array, p, q - 1, comparable);
		} else {
			System.out.println("-> it's smaller than the target value");
			return recursiveBinarySearch(array, q + 1, r, comparable);
		}
	}
}