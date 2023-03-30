package assignment2;

import java.util.Scanner;

/*Write a do-while loop that asks the user to enter two numbers.
   The numbers should be added and the sum displayed.
    The loop should ask the user whether he or she wishes to perform
     the operation again. If so, the loop should repeat; otherwise
      it should terminate.(while loop)
*/

public class d_while_dowhileloop {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		int num1,num2,sum,i;
		//char choice;
		
		
		
		do
		{
			System.out.print("Enter first number:");
			num1=s1.nextInt();
			
			System.out.print("Enter second number :");
			num2=s1.nextInt();
			
			sum = num1 + num2;
			System.out.println("The sum is :"+sum);
			
			System.out.println("Do you want to perform sum again then click(1/2) :");
			i = s1.nextInt();
			//choice = s1.next().charAt(0);
		}
		while(i ==1 || i == 2);
		//while(choice =='y');

	}

}
