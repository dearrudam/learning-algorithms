package algo.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {

	public <T extends Comparable<T>> T[] sort(T[] items) {
		for (int lastUnsortedIndex = items.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			boolean isSorted = true;
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (items[i].compareTo(items[i + 1]) == 1) {
					isSorted = false;
					swap(items, i, i + 1);
				}
			}
			if (isSorted) {
				break;
			}
		}
		return items;
	}

	public <T> T[] sort(T[] items, Comparator<T> comparator) {
		for (int lastUnsortedIndex = items.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			boolean isSorted = true;
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (comparator.compare(items[i], items[i + 1]) == 1) {
					swap(items, i, i + 1);
					isSorted=false;
				}
			}
			if (isSorted) {
				break;
			}
		}
		return items;
	}

	private <T> void swap(T[] items, int a, int b) {
		System.out.print("from " + a + " to " + b + " -> ");
		System.out.print("from " + Arrays.toString(items));
		if (a == b) {
			return;
		}
		T temp = items[a];
		items[a] = items[b];
		items[b] = temp;
		System.out.print(" to " + Arrays.toString(items));
		System.out.println();
	}
}
