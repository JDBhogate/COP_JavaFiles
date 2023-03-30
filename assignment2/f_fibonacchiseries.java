package assignment2;
import java.util.Scanner;

/* Write a program to print Fibonacci series of n terms where
 *  n is input by user :*/

public class f_fibonacchiseries 
{

	public static void main(String[] args) 
	{
			Scanner s1 = new Scanner(System.in);
			System.out.print("Enter the number of terms: ");
			int n = s1.nextInt();
			
			int a=0,b=1,c;
			
			for(int i = 1; i <= n; i++) 
			{
				 System.out.print(a+ " ,");
			     c = a + b;
			     a = b;
			     b = c;      
		    }
	   
	}
}