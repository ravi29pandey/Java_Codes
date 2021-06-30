
public class MultipleCatchBlock {

	public MultipleCatchBlock() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		try {
        	int a[]=new int[4];
        	a[5]=30/2;
        	System.out.print("first print statemnt in try block");
        }
        catch(ArithmeticException e) {
        	System.out.print("Warning : Aritmetic exception");
        }
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.print("Warning : ArrayIndexOutOfBoundException");
        }
        catch(Exception e) {
        	System.out.print("Warning : Some other  exception");
        }
		
	 System.out.print(" \nNO EXCEPTION");
		
        
        
	}

}
