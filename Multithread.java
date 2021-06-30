class Hi{
	public void show() {
		for(int i=1;i<=4;i++)
		{
			System.out.println("hi");
			
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
			}
		}
	}
}


class Hello{
	public void show() {
		for(int i=5;i<=10;i++)
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

public class Multithread {

	public static void main(String[] args) {
		Hi obj1=new Hi();
		Hello obj2=new Hello();
        obj1.show();
        obj2.show();

	}

}
