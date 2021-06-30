
public class ConstChaining {

	public ConstChaining() {
		this(9);
		System.out.println("I am 1 ");
		
		}
	
	public ConstChaining(int x) {
		this(6,8);
		System.out.println("I am X ");
		
		}
	
	public ConstChaining(int x, int y) {
		
		System.out.println("I am X & Y ");
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstChaining nc =new ConstChaining();
		
		
	}

}
