import java.util.HashMap;
import java.util.Map;

public class AdvanceMap {

	public static void main(String[] args) {
		//TreeMap & HashMap are the most used function in Map
		//Key:value Pair maintains unique order 
		
		//if apply TreeMap it sort the elements
		Map<String,Integer> num=new HashMap<>();
		num.put("One", 1);
		num.put("Two", 2);
		num.put("Three", 3);
		
		
		//Iteration in map
		
		
		
		System.out.println(num);
	
		for(Map.Entry<String,Integer> e:num.entrySet()) {
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
		}
		
		//Iteration for Key 
		System.out.println("Now printing Keys");
		for(String key : num.keySet()) {
			
			System.out.println(key);
		}
		//iteration for Values
		
		System.out.println("now values ");
		for(Integer value: num.values()) {
			
			System.out.println(value);
		}
		
		
		
		
		
		
		
	}

}
