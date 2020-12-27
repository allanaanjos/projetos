package Application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	      Scanner sc  = new Scanner(System.in);
	      
	      
	    try {  
	      String [] vect = sc.nextLine().split(" ");
	      int Position = sc.nextInt();
	      System.out.println(vect[Position]);
	   }
	    catch(ArrayIndexOutOfBoundsException e) {
	    	System.out.println("invalided Position!");
	    }
	    catch(InputMismatchException e) {
	    	System.out.println("input error!");
	    	
	    }
	      
	      System.out.println("end of program");
	      sc.close();
	}

}
