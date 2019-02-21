/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.algorithms;

import java.util.Comparator;

/**
 * The only significant advantage that bubble sort has over most other algorithms, 
 * even quicksort, but not insertion sort, is that the ability to detect that the 
 * list is sorted efficiently is built into the algorithm. 
 *
 * @author dearrudam
 */
public class BubbleSort implements SortingAlgorithm {

    @Override
    public <T> T[] sort(T[] items, Comparator<T> comparator) {

        // iterate on the array
        for (int i = 0; i < items.length - 1; i++) {
            
            // this boolean variable is a flag to detect 
            // if the input is already a sorted array
            boolean sorted = true;
            
            // if there is more than 1 element in the array than
            // iterate on the array moving the greater element from right side 
            // to the left side of the array
            for (int j = 1; j <= (items.length - i - 1); j++) {
                
                // check the fist one [ j -1 ] is greater than the second one [j]
                if (comparator.compare(items[j - 1], items[j]) > 0) {
                    // swap the position of both elements
                    // if the first one is greater than the second one
                    T temp = items[j];
                    items[j] = items[j - 1];
                    items[j - 1] = temp;
                    // assume that array is unsorted
                    sorted = false;
                }
            }
            
            // skip the sorting if the given array is already sorted
            if (sorted) {
                break;
            }
        }

        return items;
    }

}
