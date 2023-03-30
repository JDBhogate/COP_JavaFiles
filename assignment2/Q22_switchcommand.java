package assignment2;

import java.util.Scanner;

public class Q22_switchcommand {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
        int choice;
        double num1, num2, result;
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Add ,2. Subtract, 3. Multiply, 4. Exit");
          
           choice = s1.nextInt();
           if (choice == 4) {
              break;
            }
            System.out.print("Enter two numbers: ");
            num1 = s1.nextDouble();
            num2 = s1.nextDouble();
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;
                default:
                    System.out.println("Exit");
            }
        }
        System.out.println("Exiting program.");
    }
}
