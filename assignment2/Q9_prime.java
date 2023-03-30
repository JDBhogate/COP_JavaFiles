package assignment2;
import java.util.Scanner;
public class Q9_prime {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s1.nextInt();
        
        boolean j = true;
        
        for (int i = 2; i < number; i++) 
        {	
            if (number % i == 0) 
            {
                j = false;
                break;
            }
        }
        if (j) 
        {
            System.out.println(number + " is a prime number.");
        } 
        else 
        {
            System.out.println(number + " is not a prime number.");
        }
    }
}


