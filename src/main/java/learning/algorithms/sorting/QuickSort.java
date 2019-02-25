package learning.algorithms.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class QuickSort implements SortingAlgorithm {

	@Override
	public <T> void sort(T[] items, Comparator<T> comparator) {
		System.out.println("Given " + Arrays.toString(items));
		quickSort(items, comparator, 0, items.length - 1);
	}

	private <T> void quickSort(T[] items, Comparator<T> comparator, int start, int end) {
		if (start < end) {
			int partitionPoint = partition(items, comparator, start, end); //index position of the correctly placed value in the array
			quickSort(items, comparator, start, partitionPoint - 1); //sort the left half of the range
			quickSort(items, comparator, partitionPoint + 1, end);//sort the right half of the range
		}
	}

	private <T> int partition(T[] items, Comparator<T> comparator, int start, int end) {

		System.out.println("-> partitioning between (" + start + "..." + end + ")");

		int pivotIndex = start - 1;
		// in the first interation, pivot index starts from  -1
		for (int j = start; j < end; j++) {
			System.out.println("-> comparing items[" + j + "]=" + items[j] + " with items[" + end + "]=" + items[end]);
			if (comparator.compare(items[j], items[end]) <= 0) {
				pivotIndex++;
				System.out.println("-> swapping items[" + j + "]=" + items[j] + " by items[" + pivotIndex + "]=" + items[pivotIndex]);
				System.out.print("-> from " + Arrays.toString(items));
				//swapping the elements between j end pivot index
				T temp = items[j];
				items[j] = items[pivotIndex];
				items[pivotIndex] = temp;
				System.out.println(" to " + Arrays.toString(items));
			}
		}

		System.out.print("-> from " + Arrays.toString(items));
		T temp = items[end];
		items[end] = items[pivotIndex + 1];
		// we discovered the correct pivot index, so we'll swap the pivot value to the correct stop position
		items[pivotIndex + 1] = temp;
		System.out.println(" to " + Arrays.toString(items));
		System.out.println("-> partition position is " + pivotIndex);
		return pivotIndex + 1;
	}

}
