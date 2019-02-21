package learning.algorithms.datastructures.circularlinkedlist;

import java.io.PrintWriter;

public class CircularLinkedList {

	private Node first;
	private Node last;

	public CircularLinkedList() {
	}

	public boolean isEmpty() {
		return (this.first == null);
	}

	// used to insert at the beginning of the list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (isEmpty()) {
			last = newNode;
		}
		newNode.next = first;
		first = newNode;
	}

	// used to delete the first item at the beginning of the list
	public int deleteFirst() {
		int temp = first.data;
		if (first.next == null) {
			last = null;
		}
		first = first.next;
		return temp;
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
	}

	public void displayList(PrintWriter printWriter) {
		printWriter.print("{");
		Node currentNode = first;
		while (currentNode != null) {
			printWriter.print(" " + currentNode.data + " ");
			currentNode = currentNode.next;
			if (currentNode != null) {
				printWriter.print("-->");
			}
		}
		printWriter.print("}");
	}

}
