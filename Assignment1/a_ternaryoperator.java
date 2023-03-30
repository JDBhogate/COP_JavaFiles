package Assignment1;
import java.util.*;


/* wap to demonstrate ternary operator .define a variable marks 
.ask its value from user and using ternary operator 
check if marks > 40 store "Pass" in result varible else store "Fail"*/


public class a_ternaryoperator 
{

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.print("total marks :");
		int marks=s.nextInt();
		
	
		String result = marks > 40 ? "Pass" : "Fail";
		System.out.print("result :" + result);
	}
}
