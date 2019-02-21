package learning.algorithms.datastructures.doublylinkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

import learning.algorithms.datastructures.doublylinkedlist.DoublyLinkedList;

public class DoublyLinkedListTest extends DoublyLinkedList {

	@Test
	public void testIsEmpty() {
		assertTrue(isEmpty());
	}

	@Test
	public void testInsertFirst() {
	
		assertTrue(isEmpty());
		insertFirst(10);
		assertFalse(isEmpty());
		assertEquals("{ " + 10 +  " }", displayForward());
		assertEquals("{ " + 10 +  " }", displayBackward());
		insertFirst(11);
		assertFalse(isEmpty());
		assertEquals("{ " + 11 + " --> " + 10 +  " }", displayForward());
		assertEquals("{ " + 10 + " <-- " + 11 +  " }", displayBackward());
	
	
	
	}

	@Test
	public void testInsertLast() {
		assertTrue(isEmpty());
		insertLast(10);
		assertFalse(isEmpty());
		assertEquals("{ " + 10 +  " }", displayForward());
		assertEquals("{ " + 10 +  " }", displayBackward());
		insertLast(11);
		assertFalse(isEmpty());
		assertEquals("{ " + 10 + " --> " + 11 +  " }", displayForward());
		assertEquals("{ " + 11 + " <-- " + 10 +  " }", displayBackward());	
	}

	@Test
	public void testDeleteFirst() {
		assertTrue(isEmpty());
		insertLast(10);
		insertLast(11);
		assertFalse(isEmpty());
		assertEquals("{ " + 10 + " --> " + 11 +  " }", displayForward());
		assertEquals("{ " + 11 + " <-- " + 10 +  " }", displayBackward());	

		deleteFirst();
		assertFalse(isEmpty());
		assertEquals("{ " + 11 +  " }", displayForward());
		assertEquals("{ " + 11 +  " }", displayBackward());	

		deleteFirst();
		assertTrue(isEmpty());
		assertEquals("{}", displayForward());
		assertEquals("{}", displayBackward());	

	}

	@Test
	public void testDeleteLast() {
		assertTrue(isEmpty());
		insertLast(10);
		insertLast(11);
		assertFalse(isEmpty());
		assertEquals("{ " + 10 + " --> " + 11 +  " }", displayForward());
		assertEquals("{ " + 11 + " <-- " + 10 +  " }", displayBackward());	

		deleteLast();
		assertFalse(isEmpty());
		assertEquals("{ " + 10 +  " }", displayForward());
		assertEquals("{ " + 10 +  " }", displayBackward());	

		deleteLast();
		assertTrue(isEmpty());
		assertEquals("{}", displayForward());
		assertEquals("{}", displayBackward());	

	}

	@Test
	public void testInsertAfter() {
		assertTrue(isEmpty());
		insertLast(9);
		insertLast(11);
		assertFalse(isEmpty());
		assertEquals("{ " + 9 + " --> " + 11 +  " }", displayForward());
		assertEquals("{ " + 11 + " <-- " + 9 +  " }", displayBackward());	
		
		insertAfter(9, 10);
		assertFalse(isEmpty());
		assertEquals("{ " + 9 + " --> " + 10 + " --> " + 11 +  " }", displayForward());
		assertEquals("{ " + 11 + " <-- " + 10 + " <-- " + 9 +  " }", displayBackward());	
		
	}

	@Test
	public void testDeleteKey() {
		assertTrue(isEmpty());
		insertLast(9);
		insertLast(10);
		insertLast(11);
		
		assertFalse(isEmpty());
		assertEquals("{ " + 9 + " --> " + 10 + " --> " + 11 +  " }", displayForward());
		assertEquals("{ " + 11 + " <-- " + 10 + " <-- " + 9 +  " }", displayBackward());	
		
		deleteKey(10);
		assertFalse(isEmpty());
		assertEquals("{ " + 9 + " --> " + 11 +  " }", displayForward());
		assertEquals("{ " + 11 + " <-- " + 9 +  " }", displayBackward());	
		
		deleteKey(9);
		assertFalse(isEmpty());
		assertEquals("{ " + 11 +  " }", displayForward());
		assertEquals("{ " + 11 +  " }", displayBackward());	
		
		deleteKey(11);
		assertTrue(isEmpty());
		assertEquals("{}", displayForward());
		assertEquals("{}", displayBackward());	
		
	}

	@Test
	public void testDisplayForward() {

		assertEquals("{}", displayForward());
	}

	@Test
	public void testDisplayBackward() {

		assertEquals("{}", displayBackward());
	}

}
