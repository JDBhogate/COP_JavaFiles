package day4;
import java.util.Scanner;

public class forloop5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String msg;
		int count;
		
		System.out.println("Message is");
		msg = s.next();
		
		System.out.println("Number of time message will pring is ");
		count = s.nextInt();
		
		for(int i=1;i<=count;i++)
		{
			System.out.println(msg);
			
		}
		System.out.println("****end of program****");
		

	}

}
