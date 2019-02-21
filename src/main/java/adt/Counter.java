package adt;

public class Counter {

	private final String name;

	private int value=0;
	
	public Counter(String name) {
		super();
		this.name = name;
	}
	
	
	public void increment(){
		this.value++;
	}
	
	public int getCurrentValue(){
		return this.value;
	}
	
	@Override
	public String toString() {
		return this.name + ":" + this.value;
	}
}
