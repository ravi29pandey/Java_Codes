import java.util.HashSet;
import java.util.Set;

public class AdvanceCustomHashSet {

	public static void main(String[] args) {
		Set<Students> stu=new HashSet<>();
		
		stu.add(new Students("Ravi",45));

		stu.add(new Students("Ravi",58));

		stu.add(new Students("Saurabh",21));

		stu.add(new Students("Shivam",74));
		
		for(Students e:stu) {
             
			System.out.println(e);
			
			
			
		}
		
		
	}

}
