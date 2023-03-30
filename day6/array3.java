package day6;
import java.util.Scanner;
public class array3 {

	public static void main(String[] args) {
		int k[]= {10,20,30,40,50};
		//int k[]= new int[3];
		System.out.println(k.length);

		Scanner s= new Scanner (System.in);
		
		for(int i=0;i<k.length;i++)
		{
		 System.out.println("enter number");
		
		k[i]= s.nextInt();
		}
		for(int i=0;i<k.length;i++)
		{
		System.out.println(k[i]);
		}
	
		
		
	}

}
