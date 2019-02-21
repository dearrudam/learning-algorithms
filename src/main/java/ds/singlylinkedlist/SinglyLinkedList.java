package ds.singlylinkedlist;

import java.io.PrintWriter;

public class SinglyLinkedList {

	private Node first;

	public SinglyLinkedList() {
	}

	public boolean isEmpty() {
		return (this.first == null);
	}

	// used to insert at the beginning of the list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}

	// used to delete the first item at the beginning of the list
	public int deleteFirst() {
		int temp = first.data;
		first = first.next;
		return temp;
	}

	public void insertLast(int data) {
		if (first == null) {
			insertFirst(data);
		} else {
			Node current = first;
			while (current.next != null) {
				current = current.next;
			}
			Node newNode = new Node();
			newNode.data = data;
			current.next = newNode;
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
