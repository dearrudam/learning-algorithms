package learning.algorithms.recursion;

import java.util.Arrays;

import learning.algorithms.searching.SearchingAlgorithm;

public class RecursiveLinearSearch implements SearchingAlgorithm {

	public <T> int doSearch(T[] array, Comparable<T> comparable) {
		System.out.println("Given " + Arrays.toString(array));
		return recursiveLinearSearch(array, 0, comparable);
	}

	private <T> int recursiveLinearSearch(T[] array, int i, Comparable<T> comparable) {
		if (i > array.length - 1) {
			System.out.println("-> not found");
			return -1;
		}

		System.out.println("-> comparing element[" + i + "] = " + array[i]);
		if (comparable.compareTo(array[i]) == 0) {
			System.out.println("-> found in index " + i);
			return i;
		} else {
			return recursiveLinearSearch(array, i + 1, comparable);
		}

	}
}