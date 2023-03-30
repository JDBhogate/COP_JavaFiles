package Assignment1;
import java.util.Scanner;

/* wap to ask product name and price of product from user and calculate discount i.e 
if price > 2000 then discount is 10 percent of price 
else 
discount is 7 % of price*/

public class e_discount {

	public static void main(String[] args) {
		 try (Scanner s = new Scanner(System.in)) {
			{
			 double discount,finalprice;
			  
			  String name;
			  System.out.print("Product name: ");
			  name = s.nextLine();
			
			
			  int num1;
			  System.out.print("Product price: ");
			  num1 = s.nextInt();
			  
			 
			   
			  if(num1>=2000)
			  {
				  discount = 0.1 * num1;
				 
			  }
			  else
			  {
				  discount = 0.07 * num1;
				  
			  }
			  finalprice= num1-discount;
			  
			  System.out.print("Discount on the product is : "+discount);
			 }
		}

	}

}
