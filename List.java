import java.util.ArrayList;
import java.util.Collections;





public class List  {

	public List() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<Integer> values =new ArrayList<>();//Mutable -- we change the value
		
	/*	<> this angular bracket is to declare Generics which 
	 * specify data type of collection  */
       
		values.add(945); //this is object of Integer
        values.add(728);
	    values.add(832);
	    values.add(387);
	    
	   Collections.sort(values);//simply sort values in ascending order 
	   // Collections.reverse(values);//reverse the sorted elements
	   // Collections.shuffle(values);
	    Collections.max(values);
	    
	    for(Integer i:values) {
	    	System.out.println(i);
	    }
	    
	/*   for(int i =0;i<=values.size();i++) {
	    	System.out.println(values.get(i));
	    }
	    
	 */   
	    System.out.println(Collections.max(values));
	    
	    
	}

}
