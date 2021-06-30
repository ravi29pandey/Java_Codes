import java.util.Stack;

public class AdavnaceStack {

	public static void main(String[] args) {
		Stack<String> animals = new Stack<>();
		animals.push("Lion");
		animals.push("Tiger");
		animals.push("Rhino");
		animals.push("KRK");
		////LIFO-Last in first out
		System.out.println(animals);
	    System.out.println(animals.peek());//show top most element 
	    animals.pop();//remove top element KRK 
	    
	    System.out.println(animals);
	
	}
	
	
	
	

}
