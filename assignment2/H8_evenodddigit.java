package assignment2;

import java.util.Scanner;

public class H8_evenodddigit {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s1.nextInt();
        
        int evenSum = 0,oddSum = 0;
        
        while (number > 0) 
        {
            int digit = number % 10;
            if (digit % 2 == 0) 
            {
                evenSum = evenSum + digit;
            } 
            else 
            {
                oddSum = oddSum + digit;
            }
            number = number / 10;
        }
        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
    }
}

	
