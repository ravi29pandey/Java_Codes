import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class AdavancePriorityQueue {

	public static void main(String[] args) {
		//It basically follows Heap DATA STRUCTURE 
		Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
// Comparator.reverseOrder() this converts minHeap to maxHeap ,ideally PQ is in minHeap
		//Max element is now priority 
		pq.offer(29);
		pq.offer(11);
		pq.offer(95);
		pq.offer(95);
		pq.offer(25);
		
		
		//minHeapDS implemented
		System.out.println(pq);
		
		pq.poll();
		//it simply remove element which is of min priority
		System.out.println(pq);
	}

}
