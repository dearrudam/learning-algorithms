/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.algorithms;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author dearrudam
 */
public abstract class SortingAlgorithmTest {

    protected abstract SortingAlgorithm sortingAlgorithm();

    @Test
    public void sortAnUnsortedArray() {

        Integer[] input = new Integer[]{19, 323, 21, 44, 11, 9};

        Integer[] expected = new Integer[]{9, 11, 19, 21, 44, 323};

        Integer[] actual = sortingAlgorithm().sort(Arrays.copyOf(input, input.length), Integer::compareTo);

        Assert.assertArrayEquals(String.format("givan a array: %s, expected: %s, but returns: %s", Arrays.toString(input), Arrays.toString(expected), Arrays.toString(actual)), expected, actual);
    }
    
}
