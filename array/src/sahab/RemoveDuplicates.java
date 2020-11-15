package sahab;

import java.util.Arrays;

public class RemoveDuplicates {
	 static void removeDuplicates(int[] arrayWithDuplicates)
	    {
	        System.out.println("Array With Duplicates : "+Arrays.toString(arrayWithDuplicates));
	          
	        //Assuming all elements in input array are unique
	        int lastIndexOfUniqueElements = arrayWithDuplicates.length;
	          
	        //Comparing each element with all other elements
	        for (int i = 0; i < lastIndexOfUniqueElements; i++) 
	        {
	            for (int j = i+1; j < lastIndexOfUniqueElements; j++)
	            {
	                  
	                if(arrayWithDuplicates[i] == arrayWithDuplicates[j])
	                {
	                    //Replace duplicate element with last unique element
	                    arrayWithDuplicates[j] = arrayWithDuplicates[lastIndexOfUniqueElements-1];
	                    lastIndexOfUniqueElements--;
	                    j--;
	                }
	            }
	        }
	          
	        //Copying only unique elements of arrayWithDuplicates into arrayWithoutDuplicates
	        int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, lastIndexOfUniqueElements);
	        //Printing arrayWithoutDuplicates
	        System.out.println("Array Without Duplicates : "+Arrays.toString(arrayWithoutDuplicates));
	        System.out.println("==============================");
	    }
	      
	    public static void main(String[] args) 
	    {        
	        removeDuplicates(new int[] {4, 3, 2, 4, 9, 2});
	        removeDuplicates(new int[] {1, 2, 1, 2, 1, 2});
	        removeDuplicates(new int[] {15, 21, 11, 21, 51, 21, 11});
	        removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});
	    }  
}
