package learning.algorithms.datastructures.binarysearchtree;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {

	private <T>BinarySearchTree<T> newInstance(Class<T> value) {
		return new BinarySearchTree<T>();
	}

	@Test
	public void test() {

		BinarySearchTree<String> tree = newInstance(String.class);

		tree.insert(10,"ten");
		tree.insert(9,"nine");
		tree.insert(30,"thirty");
		tree.insert(6,"six");
		tree.insert(19,"nineteen");
		tree.insert(33,"thirty-three");
		tree.insert(3,"three");
		tree.insert(8,"eight");
		
		tree.print();

		Node<String> minNode=tree.findMin();
		
		Assert.assertEquals("three", minNode.value);
		

		Node<String> maxNode=tree.findMax();
		Assert.assertEquals("thirty-three", maxNode.value);
		
		Assert.assertTrue(tree.remove(9));
		tree.print();
		tree.insert(9,"nine");
		tree.print();

	}


	@Test
	public void test2() {

		BinarySearchTree<String> tree = newInstance(String.class);

		tree.insert(10,"");
		tree.insert(12,"");
		tree.insert(11,"");
		tree.insert(15,"");
		tree.insert(14,"");
		tree.insert(19,"");
		tree.insert(13,"");
		tree.insert(18,"");
		tree.insert(16,"");
		tree.insert(17,"");
		
		tree.insert(8,"");
		tree.insert(5,"");
		tree.insert(9,"");
		tree.insert(2,"");
		tree.insert(6,"");
		tree.insert(1,"");
		tree.insert(4,"");
		tree.insert(7,"");
		tree.insert(3,"");
		

		tree.print();

		Assert.assertTrue(tree.remove(2));
		
		tree.print();
		
	}
}
