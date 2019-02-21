package algo.sorting;

import java.util.Comparator;

public class SelectionSort {

	public <T extends Comparable<T>> T[] sort(T[] items) {

		for (int firstUnsortedIndex = 1; firstUnsortedIndex < items.length; firstUnsortedIndex++) {

			T newElement = items[firstUnsortedIndex];
			int i;

			for (i = firstUnsortedIndex; i > 0 && (items[i - 1].compareTo(newElement) == 1); i--) {
				swap(items, i, i - 1);
			}
			items[i] = newElement;
		}

		return items;
	}

	public <T> T[] sort(T[] items, Comparator<T> comparator) {
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < items.length; firstUnsortedIndex++) {

			T newElement = items[firstUnsortedIndex];
			int i;

			for (i = firstUnsortedIndex; i > 0 && (comparator.compare(items[i - 1],newElement) == 1); i--) {
				swap(items, i, i - 1);
			}
			items[i] = newElement;
		}
		return items;
	}

	private <T> void swap(T[] items, int i, int j) {
		if (i == j) {
			return;
		}
		T temp = items[i];
		items[i] = items[j];
		items[j] = temp;
	}
}
