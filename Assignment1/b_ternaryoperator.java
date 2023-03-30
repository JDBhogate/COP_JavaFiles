package Assignment1;
import java.util.*;


/*using ternary check if number entered by user is positive or negative .
In case number is positive store "Positive number" else store negative number
to Result variable*/


public class b_ternaryoperator {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.print("Enter number :");
		int num=s1.nextInt(); 
		
		String result = num>0 ? "Positive number" : "Negative number";
		System.out.print("This umber is "+result);
	}

}
