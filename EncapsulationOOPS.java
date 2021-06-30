
public class EncapsulationOOPS {

	
    private	int age;
	private String name;
	public EncapsulationOOPS() {
		// TODO Auto-generated constructor stub
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}

	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setName(String name ) {
		this.name=name;
		
	}
	
	
	public static void main(String []args) {
		EncapsulationOOPS encap=new EncapsulationOOPS();
		
		encap.setAge(25);
		encap.setName("RAVI PANDEY");
		System.out.print("AGE OF USER :" +encap.getAge() +"\tYears" +"\nNAME IS : " +encap.getName() );
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
