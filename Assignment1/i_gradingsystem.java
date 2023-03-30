package Assignment1;
import java.util.*;

/* A school has following rules for grading system:
 a. Below 25 - F
 b. 25 to 45 - E
 c. 45 to 50 - D
 d. 50 to 60 - C
 e. 60 to 80 - B
 f. Above 80 - A
 Ask user to enter marks and print the corresponding grade */

import java.util.Scanner;

/*A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade */

public class i_gradingsystem {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.print("Enter number :");
		int num=s1.nextInt(); 
		
		
		if(num<25)
			System.out.println("Grade : F");
		else if(num<=45)
			System.out.println("Grade : E");
		else if(num<=50)
			System.out.println("Grade : D");
		else if(num<=60)
			System.out.println("Grade : C");
		else if(num<=80)
			System.out.println("Grade : B");
		else if(num<=100)
			System.out.println("Grade : A");
		
	}

}
