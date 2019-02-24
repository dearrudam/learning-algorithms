package learning.algorithms.sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * It can be seen as either a generalization of sorting by exchange (bubble
 * sort) or sorting by insertion (insertion sort).
 * 
 * @author Maximillian Arruda<dearrudam@gmail.com>
 *
 */
public class ShellSort implements SortingAlgorithm {

	@Override
	public <T> void sort(T[] items, Comparator<T> comparator) {
		System.out.println("Given " + Arrays.toString(items));
		// Start with the largest gap and work down to a gap of 1
		for (int gap = ((items.length - 1) / 2); gap > 0; gap /= 2) {
			System.out.println("-> using " + gap + " as largest gap");
			// Do a gapped insertion sort for this gap size.
			// The first gap elements a[0..gap-1] are already in gapped order
			// keep adding one more element until the entire array is gap sorted

			for (int i = gap; i < items.length; i++) {
				// getting the new element that we intend on bringing over to the sorted partition 
				T newElement = items[i];

				// getting the last index position in the sorted partition
				int j = i - 1;
				System.out.println("-> new element is " + newElement + " from " + i + " index");

				// iterate on the sorted partition from the last one to the first one index 
				// moving the current element to the next slot in case of 
				// such element is greater than the new element that we want to insert
				while (j >= 0 && (comparator.compare(items[j], newElement) > 0)) {
					items[j + 1] = items[j];
					System.out.println("-> moving element on " + (j)
							+ " index to "
							+ (j + 1)
							+ " index -> "
							+ Arrays.toString(sortedarea(items, (i + 1))));
					j--;
				}

				// insert the new element in the correct index
				if (i == (j + 1)) {
					System.out.println("-> new element " + newElement
							+ " is on the right index that it's "
							+ i
							+ " -> "
							+ Arrays.toString(sortedarea(items, (i + 1))));
				} else {
					items[j + 1] = newElement;
					System.out.println("-> inserting the new element " + newElement
							+ " on "
							+ (j + 1)
							+ " index -> "
							+ Arrays.toString(sortedarea(items, (i + 1))));
				}
			}
		}

	}

	private <T> T[] sortedarea(T[] items, int lastSortedIndex) {
		return Arrays.copyOf(items, lastSortedIndex);
	}
}
