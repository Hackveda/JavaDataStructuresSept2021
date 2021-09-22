import java.util.ArrayList;
import java.util.Spliterator;

public class MySpliteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> fbPosts = new ArrayList<String>();
		
		fbPosts.add("Post1");
		fbPosts.add("Post2");
		fbPosts.add("Post3");
		fbPosts.add("Post4");
		fbPosts.add("Post5");
		fbPosts.add("Post6");
		
		// Parallely process the lists using Spliterator
		
		Spliterator<String> splIterator = fbPosts.spliterator();
		Spliterator<String> splIterator2 = splIterator.trySplit();
		
		System.out.println("SPL1 Estimated size of data: " + splIterator.estimateSize());
		System.out.println("SPL1 Exact Size: " + splIterator.getExactSizeIfKnown());
		
		splIterator.forEachRemaining(System.out::println);	
		
		System.out.println("SPL1 Estimated size of data: " + splIterator.estimateSize());
		System.out.println("SPL1 Exact Size: " + splIterator.getExactSizeIfKnown());
		
		
		System.out.println("SPL2 Estimated size of data: " + splIterator2.estimateSize());
		System.out.println("SPL2 Exact Size: " + splIterator2.getExactSizeIfKnown());
		
		splIterator2.forEachRemaining(System.out::println);	
		
		System.out.println("SPL2 Estimated size of data: " + splIterator2.estimateSize());
		System.out.println("SPL2 Exact Size: " + splIterator2.getExactSizeIfKnown());
		
		
	}

}
