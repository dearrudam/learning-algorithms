package learning.algorithms.datastructures.circularlinkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.Test;

import learning.algorithms.datastructures.circularlinkedlist.CircularLinkedList;

public class CircularLinkedListTest {

	@Test
	public void isEmpty(){
		assertTrue(newInstance().isEmpty());
	}

	private CircularLinkedList newInstance() {
		return new CircularLinkedList();
	}
	
	@Test
	public void insertFirst(){
		CircularLinkedList list= newInstance();
		assertTrue(list.isEmpty());
		list.insertFirst(1);
		assertFalse(list.isEmpty());
	}
	
	@Test
	public void deleteFirst(){
		CircularLinkedList list=newInstance();
		assertTrue(list.isEmpty());
		list.insertFirst(1);
		assertFalse(list.isEmpty());
	
		int deletedNode=list.deleteFirst();
		assertEquals(1, deletedNode);
	}
	
	
	@Test
	public void insertLast(){
		CircularLinkedList list=newInstance();
		assertTrue(list.isEmpty());
		list.insertFirst(1);
		assertFalse(list.isEmpty());
		list.insertLast(2);
		StringWriter out=new StringWriter();
		list.displayList(new PrintWriter(out));
		assertEquals("{ 1 --> 2 }", out.toString());
	}
	
	
	@Test
	public void displayList(){
		CircularLinkedList list=newInstance();
		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		StringWriter out=new StringWriter();
		list.displayList(new PrintWriter(out));
		assertEquals("{ 30 --> 20 --> 10 }", out.toString());
	}
}
