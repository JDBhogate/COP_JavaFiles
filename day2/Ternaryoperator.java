package day2;

public class Ternaryoperator 
{

	public static void main(String[] args) 
//	{
//		int a = 10;
//		int b = 12;
//		int c = a > b  ?  b  :  a;
//		System.out.println(c);  //10
//	}

	
//	{
//		int a = 34;
//		int b = 21;
//		int c = a > b ? (a+b) : (a-b);
//		System.out.println(c);  //55
//		
//		
//	}
	
	{
	int a = 20;
	int b = 30;
	int c = 40;
	
	int min = (a<=b)  ?  (a<=c ? a : c)  :  (b<=c ? b : c);
	       //condi1  ?  (condi2 ? var1 : var3)  :  (condi3 ? var2 : var3)
	System.out.println(min);  //20
	}
	
//	{
//		int a = 20;
//		int b = 30;
//		int c = 40;
//		
//		int max = (a>=b)  ?  (a>=c ? a : c)  :  (b>=c ? b : c);
//		       //condi1  ?  (condi2 ? var1 : var3)  :  (condi3 ? var2 : var3)
//		System.out.println(max);  //20
//		}
}


