package Assignment1;

/*How to swap two numbers without using a third variable?*/

public class g_swap {

	public static void main(String[] args) {
		
		int a=25;
		int b =50;
		
		System.out.println("Before swap a was : "+a);
		System.out.println("Before swap b was : "+b);
		
		a = a+b; //15
		b = a-b; //5
		a = a-b; //10
		
	
		
		System.out.println("After swap a became : "+a);
		System.out.println("After swap b became : "+b);
		
	}

}
