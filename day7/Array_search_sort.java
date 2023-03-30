package day7;

public class Array_search_sort {

	public static void main(String[] args) {
		//unsorted array
				int k[]= {22,3,5,566,34,67,34};
				   //1  predefined method 
				  //2  write logic
				 
				//ascending order 
				 Arrays.sort(k) ;
				 
				 
				       //enhanced for loop
						 for(int u:k)
						 {
							 System.out.print("  "+ u);
						 }
						 
				//binary search works on sorted data 
				// this method return position of element to be searched in array 
				//if number does not exists then it will return  negative value 		 
				 System.out.println("\n"+ Arrays.binarySearch(k,35));

			}

		}