/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.algorithms;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Assert;
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
	
	protected Comparator<Integer> inverseComparator() {
		return (item1, item2) -> {
			int r = Integer.compare((Integer) item1, (Integer) item2);
			if (r == 0)
				return 0;
			return r > 0 ? -1 : 1;
		};
	}
	
	@Test
	public void test1_sortAnUnsortedArrayAsc() {
		try {
			System.out.println("---Begin " + getClass().getSimpleName() + ".test1_sortAnUnsortedArrayAsc()");
			Integer[] input = new Integer[] {
					19, 323, 21, 44, 11, 9
			};

			Integer[] expected = new Integer[] {
					9, 11, 19, 21, 44, 323
			};

			Integer[] actual = sortingAlgorithm().sort(Arrays.copyOf(input, input.length), Integer::compareTo);

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
			Integer[] input = new Integer[] {
					19, 323, 21, 44, 11, 9
			};

			Integer[] expected = new Integer[] {
					323, 44, 21, 19, 11, 9
			};

			Integer[] actual = sortingAlgorithm().sort(Arrays.copyOf(input, input.length), inverseComparator());

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

			Integer[] input = new Integer[] {
					9, 11, 19, 21, 44, 323
			};

			Integer[] expected = new Integer[] {
					9, 11, 19, 21, 44, 323
			};

			Integer[] actual = sortingAlgorithm().sort(Arrays.copyOf(input, input.length), Integer::compareTo);

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

			Integer[] input = new Integer[] {
					323, 44, 21, 19, 11, 9
			};

			Integer[] expected = new Integer[] {
					323, 44, 21, 19, 11, 9
			};

			Integer[] actual = sortingAlgorithm().sort(Arrays.copyOf(input, input.length), inverseComparator());

			Assert.assertArrayEquals(String.format("givan a array: %s, expected: %s, but returns: %s",
					Arrays.toString(input),
					Arrays.toString(expected),
					Arrays.toString(actual)), expected, actual);
		} finally {
			System.out.println("---End " + getClass().getSimpleName() + ".test4_sortAnSortedArrayDesc()");

		}
	}

}
