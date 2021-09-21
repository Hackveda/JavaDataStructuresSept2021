import java.util.Iterator;
import java.util.PriorityQueue;

public class MyPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue pq = new PriorityQueue();
		
		System.out.println("Is PQ Empty? " + pq.isEmpty());
		
		MyComparator mComp = new MyComparator();
		
		PriorityQueue pq1 = new PriorityQueue(mComp);
		
		pq.add(10);
		pq1.add(10);
		
		pq.add(5);
		pq1.add(5);
		
		pq.add(100);
		pq1.add(100);
		
		Iterator pqIter = pq.iterator();
		Iterator pq1Iter = pq1.iterator();
		
		System.out.println("PQ Priority Queue");
		while(pqIter.hasNext()) {
			System.out.println(pqIter.next());
		}
		
		System.out.println("PQ1 Priority Queue");
		
		while(pq1Iter.hasNext()) {
			System.out.println(pq1Iter.next());
		}
		
	}

}
