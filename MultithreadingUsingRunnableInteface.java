
//Two ways of performing multi thread by extending thread itself or by runnable interface .
	class HH implements Runnable{
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


	class Hell implements Runnable{
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
	public class MultithreadingUsingRunnableInteface {


		public static void main(String[] args) {
			
			Runnable obj1=new Hii();
			Runnable obj2=new Helloo();
			
		Thread t1=new Thread(obj1);	
		Thread t2=new Thread(obj2);	
		
			t1.start();
		try {Thread.sleep(5);} catch (Exception e) {}
			t2.start();
			
		

	}
	}



