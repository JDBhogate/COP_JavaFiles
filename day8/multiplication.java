package day8;

public class multiplication {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},   
			    {11,22,33},
			    {2,3,4}};
	
	
	
	int b[][]= {{2,1,4},
		        {2,2,4},
		        {2,3,4}};

	
	int c[][]= new int [3][3];
	
	//c[0][0]= (a[0][0]*b[0][0] +a[0][1]*b[1][0] + a[0][2]*b[2][0]);
	//c[0][1]=  (a[0][0]*b[1][0] +a[0][1]*b[1][1] + a[0][2]*b[2][1]);
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			for(int k=0;k<3;k++)
			{
				
	
				 c[i][j] = c[i][j]+a[i][k]*b[k][j] ;    
				           //c[i][j] + a[0][0] * b[0][0]; //10*1
				           //c[i][j] + a[0][1]*b[1][0]	//20*2
				           //c[i][j] + a[0][2] *b[2][0]	//30*3	 c[0][1]= 140 
			}
		}
	 
	}
	
	
	
	
	for(int i=0;i<3;i++)
	{
		for (int j=0;j<3;j++)
		{
			System.out.print("   "+ c[i][j]);
		}
		System.out.println();
	
		}
	
}

}