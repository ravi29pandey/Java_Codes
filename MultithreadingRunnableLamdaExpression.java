
//Two ways of performing multi thread by extending thread itself or by runnable interface .
//Here we are removing code part by declaring a anonyms class
public class MultithreadingRunnableLamdaExpression {


		public static void main(String[] args) throws InterruptedException {
			
		 //Runnable interface -anonyms class
			
		//Lamda expression which is as same as arrow function	
			
			Runnable obj1=()->  {  
				
				//name this method run since java thread support with this method
					for(int i=1;i<=4;i++)
					{
						System.out.println("Hi");
						
						try {
							Thread.sleep(500);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							
						}
					}
				
			};
			Runnable obj2=()->{
			
					for(int i=1;i<=4;i++)
					{
						System.out.println("hello");
						try {
							Thread.sleep(500);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							
						}
					}
					
					
					
				
			};
			
		Thread t1=new Thread(obj1);	
		Thread t2=new Thread(obj2);	
		
			t1.start();
		try {Thread.sleep(50);} catch (Exception e) {}
			t2.start();
			
			//Yes we can name thread 
		
			//we can also set priority on which thread to be executed
			
			t1.setPriority(Thread.MIN_PRIORITY);
			t2.setPriority(Thread.MAX_PRIORITY);
			t1.setName("Thread 1");
			t2.setName("Thread 2 ");	
			
		//it is printing name of thread running	System.out.println(t1.getName());
			
			
	//System.out.println(t1.isAlive()); 
	/* this method simply 
	check whether my thread is alive or not after performing the task thread will die */ 
			
			
			t1.join(); 
//Join the two thread so once while running t1 & t2 it will execute next line by joining two
			t2.join();
			System.out.println("bYE");
			System.out.println(t1.isAlive() | t2.isAlive());
			

	}
	}








 
