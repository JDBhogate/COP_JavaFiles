package day7;

public class sorting {

	public static void main(String[] args) {
		char k='A';
		int space=0;
		
		for(int i=1;i<=4;i++)
		{
			k='A';
		                                                          //i  1         2    3   4
			for(int j=4;j>=i;j--)  			System.out.print(k++);   //ABCD      ABC  AB  A                      
						
			for(int l=1;l<=space;l++)		System.out.print(" ");  //no space    2   4   6    space
			
			for(int j=4;j>=i;j--)           System.out.print(--k);    //DCBA     CBA  BA   A
			
			
			System.out.println();
			space=space+2;
		}

	}

} 
