

	import java.util.ArrayList;
	import java.util.Collections;
import java.util.Comparator;





	public class ComparatorInterface  {

		

		public static void main(String[] args) {
			ArrayList<Integer> values =new ArrayList<>();//Mutable -- we change the value
			
		/*	<> this angular bracket is to declare Generics which 
		 * specify data type of collection  */
	       
			values.add(945); //this is object of Integer
	        values.add(728);
		    values.add(832);
		    values.add(387);
		    
		    
		    
		    /*Collection extends Comprataor interface*/
		    
		    /*since comparator is interface so we can't create object but we can use anonymous class  */
/*		    Comparator<Integer> c= new Comparator<Integer>() {
		    
		    	public int compare(Integer i,Integer j) {
				if(i%10>j%10) 
					return 1;
					else 
					return -1;
				}*/
		    	Comparator<Integer> c= new Comparator<Integer>() {

		    	public int compare(Integer i,Integer j) {
				//using ternary operator
				return i%10>j%10?1:-1;
				
				/*in this logic 1 & -1 
				says permission for sort function
				when to swap and when not to swap	*/
				}
		    
		    
		    };
		    
		    //Collections.sort(values,c);//simply sort values in ascending order 
		      Collections.sort(values, c);
		    
		    
		    for(Integer i:values) {
		    	System.out.println(i);
		    }
		    
		/*   for(int i =0;i<=values.size();i++) {
		    	System.out.println(values.get(i));
		    }
		    
		 */   
		}

	}

	
	
	

