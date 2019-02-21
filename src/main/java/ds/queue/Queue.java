package ds.queue;

/**
 * 
 * It's a FIFO flow (First In / First Out)
 * 
 * @author marruda
 *
 */
@SuppressWarnings("unchecked")
public class Queue<T> {

	private int maxSize; //initializes the set number of slots;
	private Object[] queueArray; // slots to main the data
	private int front; // this will be the index position for the element in the front
	private int rear; // going to be the index position for the element at the back of the line;
	private int nItems; // counter to maintain the number of items in our queue

	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new Object[size];
		this.front = 0;// index position of the first slot of the array
		this.rear = -1; // there is no item in the array to be considered as the last item
		this.nItems = 0; // we don't have elements in the array yet
	}

	public void insert(T value) { // insert an element in the rear position plus 1
		if (this.rear == this.maxSize - 1) { // if the current rear index position is the latest one, 
			this.rear = -1; //it will come back to the first slot. (Circular Queue)
		}
		this.rear++;
		this.queueArray[this.rear] = value;
		this.nItems++;
	}

	public T remove() {
		T value = (T) this.queueArray[this.front];
		this.front++; // move the front index pointer to the next position
		if (this.front == this.maxSize) { // if the front index position is the latest one
			this.front = 0; // set the front index position to the start position
		}
		this.nItems--; // decreasing the counter
		return value;
	}

	public T peekFront() {
		return (T) this.queueArray[this.front];
	}

	public boolean isEmpty() {
		return this.nItems == 0;
	}

	public boolean isFull() {
		return this.nItems == this.maxSize;
	}

	public void view() {
		System.out.print("[ ");
		for (int i = 0; i < queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.println("]");
	}

}
