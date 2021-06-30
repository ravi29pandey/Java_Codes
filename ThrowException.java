import java.io.IOException;

public class ThrowException {

	public ThrowException() {
		// TODO Auto-generated constructor stub
	}

	static void eligibility(int age ,int weight) {
     if(age<12 && weight < 40) {		
    	 throw new ArithmeticException("Student not eligible to get selected on the basis of age & weight ");
     }
     else {
    	 System.out.print("Selected");
    	 
     }
	}
	
	static void afterselection(String branch ,int grade) throws Exception  
	
	{
		if(branch=="CSE") {
			
		
		if(branch=="ECE"  && grade >=70) {
			System.out.print("Passed ");	
		}
		else {
			throw new Exception("Sorry better luck next time ");
		
		}
		 
	}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       System.out.print("Welcome ");
      ThrowException.eligibility(45, 122);
      ThrowException.afterselection("IT", 150);
      System.out.print("have a nice day ");  
	}

}
