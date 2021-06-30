
//Two ways of performing multithread by extending thread itself or by runnable interface .
//Here we are removing code part by declaring a anonyms class
public class MultithreadingRunnableAnonymsclass {


		public static void main(String[] args) {
			
		 //Runnable interface -anonyms class
			Runnable obj1=new Runnable(){
				public void run() {  
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
				}
			};
			Runnable obj2=new Runnable(){
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
				
			};
			
		Thread t1=new Thread(obj1);	
		Thread t2=new Thread(obj2);	
		
			t1.start();
		try {Thread.sleep(5);} catch (Exception e) {}
			t2.start();
			
		

	}
	}





