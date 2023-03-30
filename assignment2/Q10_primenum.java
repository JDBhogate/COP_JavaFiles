package assignment2;
import java.util.Scanner;
public class Q10_primenum {

	public static void main(String[] args) {
		int n1,n2,i,j;
		Scanner s1=new Scanner(System.in);
		
		System.out.print("Enter first numbers :");
		n1=s1.nextInt();
		System.out.print("Enter second numbers :");
		n2=s1.nextInt();
		
		for(i=n1;i<=n2;i++)
		{
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
					break;
			}
			if(i==j)
				System.out.print("  " +j);
		}
	}
}
