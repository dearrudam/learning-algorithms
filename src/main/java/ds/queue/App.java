package ds.queue;

public class App {

	public static void main(String[] args) {
		Queue<Integer> myQueue = new Queue<>(5);

		myQueue.insert(10);
		myQueue.insert(11);
		myQueue.insert(12);
		myQueue.insert(13);
		myQueue.insert(14);

		myQueue.view();

		myQueue.insert(15);
		myQueue.view();

		myQueue.insert(16);
		myQueue.view();
		
		myQueue.insert(17);
		myQueue.view();
		
		myQueue.insert(18);
		myQueue.view();
		
		myQueue.insert(19);
		myQueue.view();
		
		myQueue.insert(20);
		myQueue.view();

	}
}
