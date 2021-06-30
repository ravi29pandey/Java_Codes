import java.util.HashSet;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		/*Hashset can't allow duplicacy of element &
		values store in hashing which doesn't work in print order*/
		
		
		HashSet<Integer> values=new HashSet<>();
		values.add(45);
		values.add(67);
		values.add(95);
		values.add(95);
		
		
		//Print data in ascending order we use Treeset
		TreeSet<Integer> value=new TreeSet<>();
		value.add(4);
		value.add(6);
		value.add(9);
		value.add(5);
	for(Integer o:values) {
		System.out.println(o);
	}
	for(Integer o:value) {
		System.out.println(o);
	}
	
	
	
	}

}
