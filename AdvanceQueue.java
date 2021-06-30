import java.util.LinkedList;
import java.util.Queue;

public class AdvanceQueue {

	public static void main(String[] args) {
		//Since LinkedList implements Queue(FIFO)
		
		Queue<Integer> queue=new LinkedList<>();
 	    //queue.offer(value) is used to insert element in queue  
		queue.offer(12);
 	     queue.offer(89);
 	     queue.offer(55);
	     System.out.println(queue);
	       
	     
	     /*We can use queue.remove() || queue.add() || queue.element()
	     All the above function throws an exception .But it is also good to use for application where we 
	     need application to throw error when any condition fails*/
	     
	     
	System.out.println(queue.poll());
	System.out.println(queue);
	
	System.out.println(queue.peek());//next element to be popped out 
	}

}
