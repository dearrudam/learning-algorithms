package learning.algorithms.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSort implements SortingAlgorithm {

	@Override
	public <T> void sort(T[] inputArray, Comparator<T> comparator) {
		mergeSort(inputArray, comparator, 0, inputArray.length - 1);
	}

	private <T> void mergeSort(T[] originalArray, Comparator<T> comparator, int start, int end) {
		if (start >= end) {
			//we're done traversing the array
			return;
		}
		System.out.println("mergeSort " + Arrays.toString(originalArray) + " -> p=" + start + ", r=" + end);
		int mid = (start + end) / 2;
		mergeSort(originalArray, comparator, start, mid); // sort left half
		mergeSort(originalArray, comparator, mid + 1, end); // sort right half
		merge(originalArray, comparator, start, mid, end); // merge both sorted pieces into the original array
	}

	@SuppressWarnings("unchecked")
	private <T> void merge(T[] items, Comparator<T> comparator, int start, int mid, int end) {

		System.out.println("merge " + Arrays.toString(items) + " -> start=" + start + ", mid=" + mid + ", end=" + end);

		T[] temporaryArray = (T[]) new Object[end - start + 1];
		System.out.println("-> creating a temporary array:" + Arrays.toString(temporaryArray));
		// index counter for the left side of the items array
		int leftIndex = start;
		// index counter for the right side of the items array
		int rightIndex = mid + 1;
		// index counter for the temporary array
		int k = 0;

		while ((leftIndex <= mid) && (rightIndex <= end)) {
			System.out.println("-> comparing items[" + leftIndex
					+ "]="
					+ items[leftIndex]
					+ " with items["
					+ rightIndex
					+ "]="
					+ items[rightIndex]);
			if (comparator.compare(items[leftIndex], items[rightIndex]) <= 0) {
				temporaryArray[k] = items[leftIndex];
				leftIndex++;
			} else {
				temporaryArray[k] = items[rightIndex];
				rightIndex++;
			}
			System.out.println("-> temporary array:" + Arrays.toString(temporaryArray));
			k++;
		}

		/**
		 * Both the left and right side of the sub-array can be considered
		 * sorted
		 */

		if (leftIndex <= mid) { // consider the right side done being sorted. Left must be sorted already.
			while (leftIndex <= mid) {
				temporaryArray[k] = items[leftIndex];
				System.out
						.println("-> inserting into the temporary array items[" + leftIndex + "]=" + items[leftIndex]);
				System.out.println("-> temporary array:" + Arrays.toString(temporaryArray));
				leftIndex++;
				k++;
			}
		} else if (rightIndex <= end) { // consider the left side done being sorted. Right must be sorted already.
			while (rightIndex <= end) {
				temporaryArray[k] = items[rightIndex];
				System.out.println(
						"-> inserting into the temporary array items[" + rightIndex + "]=" + items[rightIndex]);
				System.out.println("-> temporary array:" + Arrays.toString(temporaryArray));
				rightIndex++;
				k++;
			}
		}

		System.out.println(
				"-> copy all over temporary array into the target array");
		System.out.println(
				"-> temporary array: " + Arrays.toString(temporaryArray)
						+ " into the target array:"
						+ Arrays.toString(items));

		// copy all over temporary array into the items array
		for (int i = 0; i < temporaryArray.length; i++) {
			items[start + i] = temporaryArray[i];
		}
		System.out.println(
				"-> target array:" + Arrays.toString(items));
	}

}
