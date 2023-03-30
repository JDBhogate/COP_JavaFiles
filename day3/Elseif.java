import java.util.*;
package day3;

public class Elseif 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter Number");
		int n= s.nextInt();
		if (n%2=1)
			System.out.println("weird");
		if(n%2=0)
		{
			if (n>=2 && n<=5)
				System.out.println("Not weird");
		}

	}

}
