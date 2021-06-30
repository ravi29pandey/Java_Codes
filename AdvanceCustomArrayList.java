import java.util.ArrayList;
import java.util.Collections;

public class AdvanceCustomArrayList {

	public static void main(String[] args) {
		
		ArrayList<Students> stud=new ArrayList<>();
		stud.add(new Students("Ravi",1));
		stud.add(new Students("Chellam Sir",34));
		stud.add(new Students("Walter White",56));
		stud.add(new Students("Shivam",15));
		
		Collections.sort(stud);
		for(Students s:stud) {
		System.out.println(s);
		
		}
		
		
	}

}
