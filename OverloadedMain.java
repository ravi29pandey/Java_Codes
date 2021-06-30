
import java.io.*; 
  
public class OverloadedMain { 
  
    // Normal main() 
    public static void main(String[] args) 
    { 
        System.out.println("Hi Geek (from main)"); 
      
       OverloadedMain.main("Geek"); 
    } 
  
    // Overloaded main methods 
   
    public static void main(String arg1, String arg2) 
    { 
        System.out.println("Hi, " + arg1 + ", " + arg2); 
    } 
    
    public static void main(String arg1) 
    { 
        System.out.println("Hi, " + arg1); 
        OverloadedMain.main("Dear Geek", "My Geek"); 
    } 
} 