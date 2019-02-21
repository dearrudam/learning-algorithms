/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.algorithms;

import java.util.Comparator;

/**
 *
 * @author dearrudam
 */
public class InsertionSort implements SortingAlgorithm {

    @Override
    public <T> T[] sort(T[] items, Comparator<T> comparator) {

        // assume that elements from index 1 to the end of the array (the unsorted partition) 
        // are elements to be inserted on the sorted partition that starts on index 0.
        for (int i = 1; i < items.length; i++) {
            
            // getting the new element that we intend on bringing over to the sorted partition 
            T newElement = items[i];

            // getting the last index position in the sorted partition
            int j = i - 1;

            // iterate on the sorted partition from the last one to the first one index 
            // moving the current element to the next slot in case of 
            // such element is greater than the new element that we want to insert
            while (j >= 0 && (comparator.compare(items[j], newElement) > 0)) {
                items[j + 1] = items[j];
                j--;
            }

            // insert the new element in the correct index
            items[j + 1] = newElement;

        }

        return items;

    }

}
