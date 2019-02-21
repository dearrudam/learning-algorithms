package algo.sorting;

import java.util.Comparator;

public class ShellSort {

	public <T extends Comparable<T>> T[] sort(T[] items) {
		for (int gap = items.length / 2; gap > 0; gap /= 2) {

			for (int i = gap; i < items.length; i++) {

				T newElement = items[i];

				int j = i;

				while (j >= gap && items[j - gap].compareTo(newElement) > 0) {
					items[j] = items[j - gap];
					j -= gap;
				}

				items[j] = newElement;

			}

		}
		return items;
	}

	public <T> T[] sort(T[] items, Comparator<T> comparator) {

		for (int gap = items.length / 2; gap > 0; gap /= 2) {

			for (int i = gap; i < items.length; i++) {

				T newElement = items[i];

				int j = i;

				while (j >= gap && comparator.compare(items[j - gap], newElement) > 0) {
					items[j] = items[j - gap];
				}

				items[j] = newElement;

			}

		}
		return items;
	}
}
