
public class NodeTest {
	
	public static void main(String[] args) {
		
		new Node(10);
		
	}

	static class Node {
		
		int value; // The value or data to be stored in the Node
		
		NodeTest left, right; // Pointers to the left and the right node
		
		Node(int value){
			this.value = value;
			
			left = null;
			right = null;
			
		}
		
	}
	
}
