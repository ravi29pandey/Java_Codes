import java.io.*;
import java.util.Scanner;

public class InputScanner {

	public InputScanner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner (System.in);
		System.out.print("Enter your name ");
		String s=obj.nextLine();
	    System.out.println("NAME IS "+s);
	}

}
