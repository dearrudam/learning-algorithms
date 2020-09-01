package learning.algorithms.datastructures.binarysearchtree;

public class BinarySearchTree<T> {

	private Node<T> root;

	public void insert(int key, T value) {
		Node<T> newNode = new Node<T>(key, value);
		if (root == null) {
			root = newNode;
		} else {
			Node<T> current = root;
			Node<T> parent;
			while (true) {
				parent = current;
				if (key < current.key) {
					current = current.leftChild;
					if (current == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	public Node<T> findMin() {

		Node<T> current = root;
		Node<T> last = null;

		while (current != null) {
			last = current;
			current = current.leftChild;
		}

		return last;
	}

	public Node<T> findMax() {
		Node<T> current = root;
		Node<T> last = null;

		while (current != null) {
			last = current;
			current = current.rightChild;
		}
		return last;
	}

	public boolean remove(int key) {

		Node<T> current = root;
		Node<T> parentNode = root;

		while (current.key != key) {
			parentNode = current;
			if (current.key > key) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
			if (current == null) {
				return false;
			}
		}

		Node<T> nodeToDelete = current;

		// if node is a leaf
		if (nodeToDelete.leftChild == null && nodeToDelete.rightChild == null) {
			if (nodeToDelete == root) {
				root = null;
			} else {
				if (parentNode.leftChild == nodeToDelete) {
					parentNode.leftChild = null;
				} else {
					parentNode.rightChild = null;
				}
			}
		}
		// if node has one child
		else if (nodeToDelete.leftChild != null && nodeToDelete.rightChild == null) {
			if (nodeToDelete == root) {
				root = nodeToDelete.leftChild;
			} else if (parentNode.leftChild == nodeToDelete) {
				parentNode.leftChild = nodeToDelete.leftChild;
			} else {
				parentNode.rightChild = nodeToDelete.leftChild;
			}
		} else if (nodeToDelete.leftChild == null && nodeToDelete.rightChild != null) {
			if (nodeToDelete == root) {
				root = nodeToDelete.rightChild;
			} else if (parentNode.leftChild == nodeToDelete) {
				parentNode.leftChild = nodeToDelete.rightChild;
			} else {
				parentNode.rightChild = nodeToDelete.rightChild;
			}
		}
		// if node has 2 children (tricky)
		else {

			Node<T> successor = getSuccessor(nodeToDelete);

			// connect parent of node to delete to successor node
			if (nodeToDelete == root) {
				this.root = successor;
			} else if (parentNode.leftChild == nodeToDelete) {
				parentNode.leftChild = successor;
			} else {
				parentNode.rightChild = successor;
			}

			// change successor's left child to the nodeToDelete's left child in order to
			// lost the nodeToDelete reference
			successor.leftChild = nodeToDelete.leftChild;

		}
		return true;
	}

	private Node<T> getSuccessor(Node<T> nodeToDelete) {

		Node<T> successorParent = nodeToDelete;
		Node<T> successor = nodeToDelete;

		Node<T> current = nodeToDelete.rightChild; // find the successor on right child
		while (current != null) { // start going to left down the tree until node has no left child
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}

		if (successor != nodeToDelete.rightChild) { // if successor is not right child of the node to delete
			successorParent.leftChild = successor.rightChild; // change the left child of the successor parent to point
																// to the right child of the successor
			successor.rightChild = nodeToDelete.rightChild; // change the right child of the successor to point to the
															// right child of the node to delete
		}

		return successor;
	}

	public void print() {
		print(this.root);

		System.out.println();
	}

	private void print(Node<T> current) {
		if (current != null) {
			if (current.leftChild != null) {
				print(current.leftChild);
				System.out.print(" <- ");
			}
			System.out.print("  " + current.key + " ");
			if (current.rightChild != null)
				System.out.print(" -> ");
			{
				print(current.rightChild);
			}
		}
	}

}
