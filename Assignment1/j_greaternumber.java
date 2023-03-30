package Assignment1;
import java.util.Scanner;

/*wap to check greater number among three numbers*/

public class j_greaternumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		  int num1;
	      System.out.print("Enter num1: ");
	      num1 = s.nextInt();
	      
	      int num2;
	      System.out.print("Enter num2: ");
	      num2 = s.nextInt();
	      
	      int num3;
	      System.out.print("Enter num3: ");
	      num3 = s.nextInt();
		
		int result = (num1>num2)  ?  ((num1>num3)?num1:num3)  :  ((num2>num3)?num2:num3);
		System.out.println("Greater number among this three number is : "+result);

	}

}
