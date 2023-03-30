package assignment2;

public class Q7d_pattern {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1; i<=9;i++) {
			if(i%2==0) {
				continue;
			}
			for(j=0;j<=9-i;j++) {
				System.out.print(" ");
			}
			for(k=j;k<=9;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}



