package assignment2;

import java.util.Scanner;

/*Write a program that prompts the user to input a positive integer.
 *  It should then print the multiplication table of that number. 
*/

public class b_multi {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.print("Enter number :");
		int num=s1.nextInt();

		if(num>0)
		{
			System.out.println("number is positive number");
		
		
			for( int i=1;i<=10;i++)
			{
		
				System.out.println(num*i);
			}
		}	
		else
			System.out.println("number is negative");
	}

}
