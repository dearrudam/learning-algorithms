package learning.algorithms;

import java.util.Comparator;
import java.util.Random;

public class ArrayTestSupport {
	public static Comparator<Integer> inverseComparator() {
		return (item1, item2) -> {
			return Integer.compare((Integer) item2, (Integer) item1);
		};
	}

	public static void fillRandomData(Integer[] array) {
		Random random = new Random(); // instance of Random class
		for (int i = 0; i < array.length; ++i) { // iterating thru the array
			array[i] = random.nextInt(10000); // asssigning randomly generated integer to the ith element
		}
	}

	public static void fillSorted(Integer[] array) {
		for (int i = 0; i < array.length; ++i) {
			array[i] = i;
		}
	}
}
