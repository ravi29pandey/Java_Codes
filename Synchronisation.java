/*Concept of Synchonisation - when one thread is working the other thread has to wait */
 class Counter {
/* */
	int count ;
	public synchronized void increment() { //use synchronised keyword to sync.
		count ++;
	
	
	}
	
}
public class Synchronisation {	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Counter c =new Counter();

		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1;i<=1000;i++) {
				c.increment();
				}
				
			}			
		});
		
		
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1;i<=1000;i++) {
				c.increment();
				}
				
			}
			
			
		});

		t1.start();	
		t2.start();
		t1.join(); //.join() -this function will join the next task once t1.gets completed
		t2.join();
		
		System.out.print(c.count);
	}

}
