/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.algorithms.sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * The only significant advantage that bubble sort has over most other
 * algorithms, even quicksort, but not insertion sort, is that the ability to
 * detect that the list is sorted efficiently is built into the algorithm.
 *
 * @author dearrudam
 */
public class BubbleSort implements SortingAlgorithm {

	@Override
	public <T> T[] sort(T[] items, Comparator<T> comparator) {
		System.out.println("Given " + Arrays.toString(items));
		// iterate on the unsorted area of the array, starting from the last slot to the first one
		for (int lastUnsortedSlot = items.length - 1; lastUnsortedSlot > 0; lastUnsortedSlot--) {

			// this boolean variable is a flag to detect 
			// if the input is already a sorted array
			boolean sorted = true;

			// if there is more than 1 element in the array than
			// iterate on the array moving the greater element from right side 
			// to the left side of the array
			for (int j = 0; j < lastUnsortedSlot; j++) {

				// check the fist one [ j -1 ] is greater than the second one [j]
				//if (comparator.compare(items[j], items[j + 1]) > 0) {
				// swap the position of both elements
				// if the first one is greater than the second one

				
				boolean swapped = false;
				if ((swapped = comparator.compare(items[j], items[j + 1]) > 0)) {
					T temp = items[j];
					items[j] = items[j + 1];
					items[j + 1] = temp;
					// assume that array is unsorted
					sorted = false;
				}
				System.out.print(" -> swap the element " + j + " by element " + (j+1) + "?" + (swapped ? 
						 " Yes -> " 
						:" No  -> " ));
				System.out.println(Arrays.toString(items));
			}

			// skip the sorting if the given array is already sorted
			if (sorted) {
				break;
			}
		}

		return items;
	}

}
