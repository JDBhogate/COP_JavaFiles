package assignment2;

import java.util.Scanner;

public class c_reverse {

	public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	System.out.print("enter number :");
	int i=s1.nextInt();
	
		while(i>0)
		{
			System.out.print(i%10);
			
			i = i/10;
			
		}	
	}

}
