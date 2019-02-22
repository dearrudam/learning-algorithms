package learning.algorithms.recursion;

import learning.algorithms.searching.SearchingAlgorithm;
import learning.algorithms.searching.SearchingAlgorithmTest;

public class RecursiveLinearSearchTest extends SearchingAlgorithmTest {

	@Override
	protected SearchingAlgorithm searchingAlgorithm() {
		return new RecursiveLinearSearch();
	}

}
