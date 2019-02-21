package ds.doublylinkedlist;

public class Node {
	public int data;
	public Node previous;
	public Node next;

	public void displayNode() {
		System.out.println("{ " + data + "}");
	}
}
