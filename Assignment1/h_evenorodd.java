package Assignment1;
import java.util.Scanner;

/*wap to check is number is evenor odd.*/

public class h_evenorodd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number :");
		int num=s.nextInt(); 
		
		if(num%2==0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
	}

}
