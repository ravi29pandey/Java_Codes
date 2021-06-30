class Hii extends Thread{
	public void run() {  //name this method run since java thread support with this method
		for(int i=1;i<=4;i++)
		{
			System.out.println("Hi");
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
			}
		}
	}
}


class Helloo extends Thread{
	public void run() {
		for(int i=1;i<=4;i++)
		{
			System.out.println("hello");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
			}
		}
		
		
		}
	
}
public class MultithreadingRealConcept {

	public static void main(String[] args) {
		
		Hii obj1=new Hii();
		Helloo obj2=new Helloo();
		
		
		obj1.start();
		
	try {Thread.sleep(5);} catch (Exception e) {}
		obj2.start();
		
	

}
}
