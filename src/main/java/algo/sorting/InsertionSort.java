package algo.sorting;

import java.util.Comparator;

public class InsertionSort {

	public <T extends Comparable<T>> T[] sort(T[] items) {
		for (int lastUnsortedIndex = items.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largest = 0;
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (items[largest].compareTo(items[i]) < 0) {
					largest = i;
				}
			}
			swap(items, largest,lastUnsortedIndex);
		}
		return items;
	}

	public <T> T[] sort(T[] items, Comparator<T> comparator) {
		for (int lastUnsortedIndex = items.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largest = 0;
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (comparator.compare(items[largest], items[i]) < 0) {
					largest = i;
				}
			}
			swap(items, largest, lastUnsortedIndex);
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
