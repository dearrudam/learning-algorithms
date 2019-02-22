package learning.algorithms.recursion;

import learning.algorithms.searching.SearchingAlgorithm;
import learning.algorithms.searching.SearchingAlgorithmTest;

public class RecursiveBinarySearchTest extends SearchingAlgorithmTest {

	@Override
	protected SearchingAlgorithm searchingAlgorithm() {
		return new RecursiveBinarySearch();
	}
	
}
