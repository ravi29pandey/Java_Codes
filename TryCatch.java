
public class TryCatch {

	
	
	public TryCatch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int num1,num2,num3,num4;
		  
		  try {
			  num1=0;
			  num3=90;
			  num2=num3/num1;
			  
			  num4=0;
			  
			 
			  
			  
			  System.out.println(num2);
			  System.out.println("Hey , I,m at the end of try block");
		  }
		  catch(ArithmeticException e) {
			  System.out.println("you should Not divide a no. by a zero");
		  }
		  
		  
		  //Generic Catch block
		 
		  
		  System.out.println("Out of catch exception"); 
	}

}
