package learning.algorithms.datastructures.singlylinkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.Test;

public class SinglyLinkedListTest {

	@Test
	public void isEmpty(){
		assertTrue(new SinglyLinkedList().isEmpty());
	}
	
	@Test
	public void insertFirst(){
		SinglyLinkedList list=new SinglyLinkedList();
		assertTrue(list.isEmpty());
		list.insertFirst(1);
		assertFalse(list.isEmpty());
	}
	
	@Test
	public void deleteFirst(){
		SinglyLinkedList list=new SinglyLinkedList();
		assertTrue(list.isEmpty());
		list.insertFirst(1);
		assertFalse(list.isEmpty());
	
		int deletedNode=list.deleteFirst();
		assertEquals(1, deletedNode);
	}
	
	
	@Test
	public void insertLast(){
		SinglyLinkedList list=new SinglyLinkedList();
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
		SinglyLinkedList list=new SinglyLinkedList();
		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		StringWriter out=new StringWriter();
		list.displayList(new PrintWriter(out));
		assertEquals("{ 30 --> 20 --> 10 }", out.toString());
	}
}
