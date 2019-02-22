package learning.algorithms.searching;

import static learning.algorithms.ArrayTestSupport.fillRandomData;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public abstract class SearchingAlgorithmTest {

	protected abstract SearchingAlgorithm searchingAlgorithm();

	static final int size = 10;
	static final Integer[] sortedArray;
	static final Integer[] inverseSortedArray;

	static {
		Integer[] unsortedArray = new Integer[size];
		fillRandomData(unsortedArray);
		sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
		Arrays.sort(sortedArray);
		inverseSortedArray = Arrays.copyOf(sortedArray, sortedArray.length);
		Arrays.sort(inverseSortedArray, Collections.reverseOrder());
	}

	@Test
	public void doSearchTest() {
		try {
			System.out.println("---Begin " + getClass().getSimpleName() + ".doSearchTest()");
			SearchingAlgorithm searchingAlgorithm = searchingAlgorithm();
			for (int expected = 0; expected < sortedArray.length; expected++) {
				final int expectedValue = sortedArray[expected];
				System.out.println("Searching for an index in the array where element's value equals to " + expectedValue + "");
				assertEquals(expected,
						searchingAlgorithm.search(sortedArray, (item) -> Integer.compare(expectedValue,item)));
			}
			System.out.println("Searching for an index in the array where element's value equals to " + Integer.MAX_VALUE + "");
			assertEquals(-1,
					searchingAlgorithm.search(sortedArray, (item) -> Integer.compare(item, Integer.MAX_VALUE)));
		} finally {
			System.out.println("---End " + getClass().getSimpleName() + ".doSearchTest()");
		}
	}

}
