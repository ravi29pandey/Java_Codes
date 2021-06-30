import java.util.ArrayList;
import java.util.Collections;



class Stud implements Comparable<Stud>{
	int rollno;
	String name;
	int marks;
	public Stud(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Studs rollno=" + rollno + ",name=" + name + ", marks=" + marks + "";
	}
	@Override
	public int compareTo(Stud s) {
		// TODO Auto-generated method stub
		return marks>s.marks?1:-1;
	}
	
}

public class ListAdvance {

public static void main(String[] args) {
		ArrayList<Stud> studs =new ArrayList<Stud>();
	   studs.add(new Stud(41,"hi",78));
	   studs.add(new Stud(41,"hello",9));
	   studs.add(new Stud(41,"bhi",56));
	   studs.add(new Stud(41,"jhii",90));
	 
	 Collections.sort(studs);
	  
	  for(Stud e:studs) {
		   
		   System.out.println(e);
	   }
	}

}
