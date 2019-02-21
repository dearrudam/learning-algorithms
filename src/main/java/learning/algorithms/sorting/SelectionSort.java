/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.algorithms.sorting;

import java.util.Comparator;

/**
 *
 * @author dearrudam
 */
public class SelectionSort implements SortingAlgorithm {

    @Override
    public <T> T[] sort(T[] items, Comparator<T> comparator) {
        // advance the position through the entire array 
        // (could do i < items.length - 1 because single element is also min element) 
        for (int i = 0; i < items.length - 1; i++) {

            // find the index of the smaller element from the unsorted partition of the array 
            // assume the smaller one is the first element 
            int smallest = i;

            /* test against elements after i to find the smallest */
            for (int j = i + 1; j < items.length; j++) {
                /* if this element is less, then it is the new smallest element*/
                if (comparator.compare(items[j], items[smallest]) < 0) {
                    /* found new smallest element; remember its index */
                    smallest = j;
                }
            }

            /* check if the smallest element's index is different than the i element */
            if (smallest != i) {
                /* swap both elements */
                T temp = items[smallest];
                items[smallest] = items[i];
                items[i] = temp;
            }

        }
        return items;
    }

}
