import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack intStack = new Stack<Integer>();
		
		System.out.println("Is Stack Empty: " + intStack.empty());
		
		intStack.push(10);
		
		intStack.push(20);
		
		System.out.println("Get the Top Element: " + intStack.peek());
		
		System.out.println("Is Stack Contains 20: " + intStack.search(20));
		
		intStack.pop();
		
		System.out.println("Top element after pop: " + intStack.peek());
	}

}
