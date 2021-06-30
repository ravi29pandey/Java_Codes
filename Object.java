//class decalaration
public class Object {
//instance variable
	
	String n;
	String breed ;
	int age ;
	String colour;
	//constructor Declaration of class 
	public Object(String name,String breed,int age,String colour) {
		// TODO Auto-generated constructor stub
		
		this.n=name;
		this.breed=breed;
		this.age=age;
		this.colour=colour;
		
		
	}
	//Method
	public String  getname() {
		return n;
		
	}
	public String getbreed() {
		return breed;
	}
	
	public int getage() {
		return age;
	}
	public String getcolour() {
		
		return colour;
	}
	
   public String toString() {
	   
	   return("Hi my dog name is "+this.getname()+ ".\nHis breed , HIs name and his age is " +this.getbreed()+this.getcolour()+this.getage());
   }
   
  public static void main(String[]args) {
	  Object obj;
	  obj=new Object("Tommy","labra",5,"Brown");
	  
	  System.out.print(obj.toString());
	  
	  
	  
  }
   
   
}
