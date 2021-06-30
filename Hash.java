import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Hash {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();

		map.put("Maths", 29);
		map.put("Science", 58);
		map.put("History", 29);
		map.put("Physics", 58);
		map.put("Physics", 98);
	Set<String> keys=map.keySet();
	
	for(String s:keys) {
		System.out.println(s + " "+ map.get(s));
	}
	
	
	}

}
