import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AdvanceCollection {

	public static void main(String[] args) {
		
		ArrayList<Integer> coll=new ArrayList<>();
		
		coll.add(45);
		coll.add(55);
		coll.add(58);
		coll.add(12);
		coll.add(30);
		
		System.out.println(Collections.max(coll)+ "MAX" + "   " + Collections.min(coll) + "MIN");
		
		System.out.println(Collections.frequency(coll, 55));
		Collections.sort(coll);
	    System.out.println(coll);
	    //Descending Order 
	    Collections.sort(coll,Comparator.reverseOrder());
	    System.out.println(coll);
	    
	
	}

}
