package assignment2;

public class Q23_breakcommand {

	public static void main(String[] args) {
		for (int x=2;x<20;x++)
		{
			if(x%2==0)
			System.out.println(x);
			if(x==16)
			break;
		}
	}

}