package assignment2;

public class Q7e_pattern {

	public static void main(String[] args) {
		int count=0;
		int i,j,k;
		for(i=1;i<=9;i++) {
			if (i%2==0) {
				continue;
			}
			for(j=1;j<=9-i;j++) {
				System.out.print(" ");
			}
			count++;
			
			for(k=j;k<=9;k++) {
				System.out.print(count);
				
			}
			System.out.println("");
		}

	
	}

}
	
	