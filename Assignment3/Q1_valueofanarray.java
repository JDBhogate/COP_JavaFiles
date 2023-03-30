package Assignment3;
/* Write a Java program to sum values of an array.*/
public class Q1_valueofanarray {

	public static void main(String[] args) {
		int sum=0;
		int x[]= {3,4,5,6,7};
		for(int i=0;i<x.length;i++)
		{
			sum = sum + x[i];
			System.out.println("Sum of array element is :"+sum);			
		}
	}
}
