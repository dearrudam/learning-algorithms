package learning.algorithms.datastructures.stack;

public class App {

	public static void main(String[] args) {
		Stack<Integer> theStack=new Stack<Integer>(3);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		
		while(!theStack.isEmpty()){
			long value=theStack.pop();
			System.out.println(value);
		}
		
		System.out.println("MAXIMILLIAN -> " + reverseString("MAXIMILLIAN"));
	}

	
	public static String reverseString(String str){
		
		Stack<Character> myStack=new Stack<Character>(str.length());
		for(Character c:str.toCharArray()){
			myStack.push(c);
		}
		
		StringBuilder sb=new StringBuilder();
		while(!myStack.isEmpty()){
			Character value=myStack.pop();
			sb.append(value);
		}
		
		return sb.toString();
	}
}
