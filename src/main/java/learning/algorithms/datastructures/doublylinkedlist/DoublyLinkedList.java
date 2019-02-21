package learning.algorithms.datastructures.doublylinkedlist;

import java.io.PrintWriter;
import java.io.StringWriter;

public class DoublyLinkedList {

	private Node first;
	private Node last;

	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (isEmpty()) {
			this.last = newNode; // if empty, last will refer to the new Node being created
		} else {
			this.first.previous = newNode;
		}
		newNode.next = first;//the new node's next field will point to the old first one
		first = newNode;
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode; // assigning old last new node
			newNode.previous = last; // the old last will be the new node's previous
		}

		last = newNode; //the linkedlist's last field should point to the new node
	}

	// assume non-empty list
	public Node deleteFirst() {
		Node temp = first;

		if (first.next == null) {// there is only one item in the list
			last = null;
		} else {
			first.next.previous = null; //the list's first node  will point to  null
		}
		first = first.next; // we are assigning the reference of the node following the old first node to the first node field of the list object

		return temp; // return the deleted old first node
	}

	// assume non-empty list
	public Node deleteLast() {

		Node temp = last;

		if (last.previous == null) { // there is only one item in the list
			first = null;
		} else {
			last.previous.next = null; //the list's last previous node will point to null
		}
		last = last.previous;// we are assigning the reference of the node previously the old last node to the last node field of the list object

		return temp;//return the deleted old last node
	}

	// assume non-empty list
	public boolean insertAfter(int key, int data) {

		Node current = first; //we start from the beginning of the list
		while (current.data != key) { // as long as we have not found the key in a particular node
			current = current.next;
			if (current == null) {
				return false;
			}
		}

		Node newNode = new Node();
		newNode.data = data;

		if (current == last) { // the current node is the last one
			last = newNode; // assigning the last node field to point to the new node
		} else {
			newNode.next = current.next; // assigning the new node's next node field to point to the current's next node field
			current.next.previous = newNode; //assigning the previous node field from the current's next node field to point to the new node
		}

		newNode.previous = current; //assigning the new node's previous field to point to the current node;
		current.next = newNode; //assigning the current's next node field to point to the new node

		return true; // return true confirmation of the insert method execution 	
	}

	//assume non-empty list
	public Node deleteKey(int key) {
		Node current = first; //we start from the beginning of the list
		while (current.data != key) { // as long as we have not found the key in a particular node
			current = current.next;
			if (current == null) {
				return null;
			}
		}

		if (current == first) {
			first = current.next; // assigning the first node field to point to the current's next node
		} else {
			current.previous.next = current.next; // assigning the next node from the current's previous field to point to the current's next node
		}

		if (current == last) {
			last = current.previous;// assigning the last node field to point to the current's previous node
		} else {
			current.next.previous = current.previous; // assigning the previous node from the current's next field to point to the current's previous node
		}

		return current;
	}

	public String displayForward() {
		StringWriter out = new StringWriter();
		displayForward(new PrintWriter(out));
		return out.toString();
	}

	public void displayForward(PrintWriter printWriter) {
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

	public String displayBackward() {
		StringWriter out = new StringWriter();
		displayBackward(new PrintWriter(out));
		return out.toString();
	}

	public void displayBackward(PrintWriter printWriter) {
		printWriter.print("{");
		Node currentNode = last;
		while (currentNode != null) {
			printWriter.print(" " + currentNode.data + " ");
			currentNode = currentNode.previous;
			if (currentNode != null) {
				printWriter.print("<--");
			}
		}
		printWriter.print("}");
	}

}
