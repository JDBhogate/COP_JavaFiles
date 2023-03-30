package assignment2;
import java.util.Scanner;
public class Q11_largestamongthree {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int i,j,k,result;
		
		System.out.print("First number :");
		i=s1.nextInt();
		
		System.out.print("Second number :");
		j=s1.nextInt();
		
		System.out.print("Third number :");
		k=s1.nextInt();
		
		result = (i>j)  ?  (i>j?i:j) : (j>k?j:k);
		System.out.print("the largest number is :"+result);
	}

}
