package learning.algorithms.searching;

public interface SearchingAlgorithm {

	public <T> int doSearch(T[] items, Comparable<T> query);

}
