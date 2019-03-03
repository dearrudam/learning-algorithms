package learning.algorithms.datastructures.binarysearchtree;

public class Node<T> {

	final int key;
	final T value;
	Node<T> leftChild;
	Node<T> rightChild;

	public Node(int key, T value) {
		super();
		this.key = key;
		this.value = value;
	}

}
