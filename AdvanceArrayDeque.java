import java.util.ArrayDeque;

public class AdvanceArrayDeque {

	public static void main(String[] args) {
		/*Deque help in insertion and deletion of elements from both  front and rear ends and vice versa*/
	
	ArrayDeque<Integer> adq=new ArrayDeque<>();
	
	adq.offer(58);
	adq.offerFirst(85);
	adq.offerLast(21);
	adq.offer(26);
	
	System.out.println(adq);
	
	
	}

}
