package assignment2;
import java.util.Scanner;
public class Q24_doublevariable {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double n1 = s1.nextDouble();
        
        System.out.print("Enter second number: ");
        double n2 = s1.nextDouble();
        
        if ( n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1) {
            System.out.println("Both numbers are strictly between 0 and 1.");
        } else {
            System.out.println("False: At least one of the numbers is not strictly between 0 and 1.");
        }
    }
}

	
