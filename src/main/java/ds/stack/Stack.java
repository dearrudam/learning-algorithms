package ds.stack;

/**
 *
 * It's a FILO flow	(First In Last Out)
 * 
 * @author marruda
 *
 * @param <T>
 */
@SuppressWarnings("unchecked")
public class Stack<T> {

	private int maxSize = 0;
	private Object[] stackArray;
	private int top;

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.stackArray = new Object[this.maxSize];
		this.top = -1;
	}

	public void push(T value) {
		if (isFull()) {
			System.out.println("this stack is already full");
		} else {
			this.top++;
			this.stackArray[this.top] = value;
		}
	}

	public T pop() {
		if (isEmpty()) {
			System.out.println("this stack is already empty");
			return null;
		} else {
			int old_top = top;
			this.top--;
			return (T) this.stackArray[old_top];
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == (maxSize - 1));
	}

	public T peak() {
		return (T) this.stackArray[this.top];
	}
}
