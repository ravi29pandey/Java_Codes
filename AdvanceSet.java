import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AdvanceSet {


	public static void main(String[] args) {
		//Set doesn't allow duplicate element
		/*Hashing works in Set...
		 * hashing creates hash unique code for each element so of same element again comes it simply reject*/
		Set<Integer> set =new HashSet<>();
		/*HashSet complexity is of O(1) that is why it is highly optimized*/
		set.add(89);
		set.add(58);
		set.add(98);
		set.add(25);
		set.add(12);
		
		System.out.println(set);
		
		set.remove(58);
		System.out.println(set.contains(98));
		
		System.out.println(set);
	
	//LinkedSet
		
     Set<Integer> linkedset =new LinkedHashSet<>();
		//LinkedHashSet maintains order ,output does not come in random order like in HashSet
        linkedset.add(89);
        linkedset.add(58);
        linkedset.add(98);
        linkedset.add(25);
        linkedset.add(12);
		
		System.out.println(linkedset);
		
		linkedset.remove(58);
		System.out.println(linkedset.contains(98));
		
		System.out.println(linkedset);
	
	//TreeSet
		//It simply print element in sorted form.
		Set<Integer> treeset =new TreeSet<>(Comparator.reverseOrder());
		//LinkedHashSet maintains order ,output does not come in random order like in HashSet
		/*Treeset implement Binary Search Tree so it's complexity is O(log n)*/
		
		treeset.add(89);
		treeset.add(58);
		treeset.add(98);
		treeset.add(25);
		treeset.add(12);
		
		System.out.println(treeset);
		
		linkedset.remove(58);
		System.out.println(treeset.contains(98));
		
		System.out.println(treeset);
	
		
		
	
	}

}
