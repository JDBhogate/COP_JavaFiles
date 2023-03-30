package day5;

import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		System.out.print("password entered is : ");
		int pass=s.nextInt();
		
	
		for (int p=1;p<=3;p++)
			if(pass==123)
			{
			System.out.println("Accepted");
			break;
			}
			else
			{
				System.out.println("reenter");
			}
		
		

	}

}
