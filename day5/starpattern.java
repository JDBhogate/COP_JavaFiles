package day5;

public class starpattern {

	public static void main(String[] args) {
		
	char k;
	for (int i=1;i<=5;i++)	//row	
	{	k='A';
		for(int j=1;j<=i;j++) //column
		{
			System.out.print(k);
			k++;
		}
		System.out.println( "");
	}

	}

}
