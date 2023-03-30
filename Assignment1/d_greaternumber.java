package Assignment1;
import java.util.Scanner;

/*wap that ask two numbers from user and print greater number among two */


public class d_greaternumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	      
	     
	      int num1;
	      System.out.print("Enter num1: ");
	      num1 = s.nextInt();
	      
	     
	      int num2;
	      System.out.print("Enter num2: ");
	      num2 = s.nextInt();
	      
	      
	      if(num1>num2)
	      {
	    	  System.out.println("The greater number is : "+num1);
	      }
	      else
	      {
	    	  System.out.println("The greater number is : "+num2);
	      }

	}

}
