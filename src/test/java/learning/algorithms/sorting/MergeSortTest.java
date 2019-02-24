package learning.algorithms.sorting;

public class MergeSortTest extends SortingAlgorithmTest {

	@Override
	protected SortingAlgorithm sortingAlgorithm() {
		return new MergeSort();
	}
	
//	@Override
//	protected int arraySize() {
//		return 5;
//	}
}
