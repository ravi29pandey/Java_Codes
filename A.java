class AB
{ 
   static int y=21;
   int x = 10; 
} 
  
// class B 
class B extends AB 
{ 
    int x = 20; 
} 
  class C extends B{
	  
	  int y=30;
	  
  }
// Driver class 
public class A 
{ 
    public static void main(String args[]) 
    { 
        
    	B ab=new C();
    	System.out.print(ab.x +" " +AB.y);
    	
    	
    	//A a = new B(); // object of type B 
  
        // Data member of class A will be accessed 
        //System.out.println(a.x); 
    } 
} 