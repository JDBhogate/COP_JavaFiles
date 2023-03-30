package day7;

public class binrary {

	public static void main(String[] args) {
		 int y[]= { 11 ,22,33,44,55,66,77,88};
				  //(0,  1, 2, 3, 4, 5, 6, 7 )
		 int s=33 ;
		 int f=0;
		 int l=y.length-1;// 7
		 System.out.println(l);
		 int count =1;
		 while(f<=l)
		 {
			 int mid= (f+l)/2;
			 if(y[mid]==s)
			 {
				 System.out.println("record found " );
				 System.out.println("Count is : "+count + "   "+ "Mid is : "+ mid );
				 break;
			 }
			 else if(y[mid]<s)
				 f= mid+1;
			 else 
				 l= mid-1;
			 
			 count++;
		 }
	
		 if(f>l)
			 System.out.println("record not found " +count);
		 	
	}

}

	