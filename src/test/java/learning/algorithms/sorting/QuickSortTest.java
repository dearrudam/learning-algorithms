package learning.algorithms.sorting;

public class QuickSortTest extends SortingAlgorithmTest {

	@Override
	protected SortingAlgorithm sortingAlgorithm() {
		return new QuickSort();
	}

	@Override
	protected int arraySize() {
		return 4;
	}
}
