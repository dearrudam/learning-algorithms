/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.algorithms.sorting;

import static learning.algorithms.ArrayTestSupport.fillRandomData;
import static learning.algorithms.ArrayTestSupport.inverseComparator;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 *
 * @author dearrudam
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public abstract class SortingAlgorithmTest {

	protected abstract SortingAlgorithm sortingAlgorithm();

	protected Integer[] unsortedArray;
	protected Integer[] sortedArray;
	protected Integer[] inverseSortedArray;

	protected int arraySize() {
		return 10;
	}

	@Before
	public void before() {
		unsortedArray = new Integer[arraySize()];
		fillRandomData(unsortedArray);
		sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
		Arrays.sort(sortedArray);
		inverseSortedArray = Arrays.copyOf(sortedArray, sortedArray.length);
		Arrays.sort(inverseSortedArray, Collections.reverseOrder());
	}

	@Test
	public void test1_sortAnUnsortedArrayAsc() {
		try {
			System.out.println("---Begin " + getClass().getSimpleName() + ".test1_sortAnUnsortedArrayAsc()");
			Integer[] input = Arrays.copyOf(unsortedArray, unsortedArray.length);

			Integer[] expected = Arrays.copyOf(sortedArray, sortedArray.length);

			Integer[] actual = Arrays.copyOf(input, input.length);

			sortingAlgorithm().sort(actual, Integer::compareTo);

			Assert.assertArrayEquals(String.format("givan a array: %s, expected: %s, but returns: %s",
					Arrays.toString(input),
					Arrays.toString(expected),
					Arrays.toString(actual)), expected, actual);
		} finally {
			System.out.println("---End " + getClass().getSimpleName() + ".test1_sortAnUnsortedArrayAsc()");
		}
	}

	@Test
	public void test2_sortAnUnsortedArrayDesc() {
		try {
			System.out.println("---Begin " + getClass().getSimpleName() + ".test2_sortAnUnsortedArrayDesc()");
			Integer[] input = Arrays.copyOf(unsortedArray, unsortedArray.length);

			Integer[] expected = Arrays.copyOf(inverseSortedArray, inverseSortedArray.length);

			Integer[] actual = Arrays.copyOf(input, input.length);

			sortingAlgorithm().sort(actual, inverseComparator());

			Assert.assertArrayEquals(String.format("givan a array: %s, expected: %s, but returns: %s",
					Arrays.toString(input),
					Arrays.toString(expected),
					Arrays.toString(actual)), expected, actual);
		} finally {
			System.out.println("---End " + getClass().getSimpleName() + ".test2_sortAnUnsortedArrayDesc()");
		}
	}

	@Test
	public void test3_sortAnSortedArrayAsc() {
		try {
			System.out.println("---Begin " + getClass().getSimpleName() + ".test3_sortAnSortedArrayAsc()");

			Integer[] input = Arrays.copyOf(sortedArray, sortedArray.length);

			Integer[] expected = Arrays.copyOf(sortedArray, sortedArray.length);

			Integer[] actual = Arrays.copyOf(input, input.length);

			sortingAlgorithm().sort(actual, Integer::compareTo);

			Assert.assertArrayEquals(String.format("givan a array: %s, expected: %s, but returns: %s",
					Arrays.toString(input),
					Arrays.toString(expected),
					Arrays.toString(actual)), expected, actual);
		} finally {
			System.out.println("---End " + getClass().getSimpleName() + ".test3_sortAnSortedArrayAsc()");
		}
	}

	@Test
	public void test4_sortAnSortedArrayDesc() {
		try {
			System.out.println("---Begin " + getClass().getSimpleName() + ".test4_sortAnSortedArrayDesc()");

			Integer[] input = Arrays.copyOf(inverseSortedArray, inverseSortedArray.length);

			Integer[] expected = Arrays.copyOf(inverseSortedArray, inverseSortedArray.length);

			Integer[] actual = Arrays.copyOf(input, input.length);

			sortingAlgorithm().sort(actual, inverseComparator());

			Assert.assertArrayEquals(String.format("givan a array: %s, expected: %s, but returns: %s",
					Arrays.toString(input),
					Arrays.toString(expected),
					Arrays.toString(actual)), expected, actual);
		} finally {
			System.out.println("---End " + getClass().getSimpleName() + ".test4_sortAnSortedArrayDesc()");

		}
	}

}
