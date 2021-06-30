import java.util.ArrayList;
import java.util.Iterator;

public class AdvanceList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();

		list.add(5);
		list.add(55);
		list.add(85);
		
		list.add(2, 87);//Add element to particular index
		list.remove(0);//remove element
		//list.clear();//clear all list
		list.remove(Integer.valueOf(5));//Remove element of value 5
		list.set(3, 888);//p
		list.contains(55);//it check whether element exist or not of value 55
		System.out.println(list);
		
		
		//Iteration using For loop
		for(int i=0 ;i<list.size() ;i++) {
			
			System.out.println(list.get(i));
		}
		
		//Iteration using For loop
		for(Integer element:list) {
			
			System.out.println(list.get(element));
			
		}
		
		 //Iteration using Itterator
		
		Iterator<Integer> it=list.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}
	}