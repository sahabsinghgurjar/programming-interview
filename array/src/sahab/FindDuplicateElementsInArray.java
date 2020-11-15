package sahab;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsInArray {
	
	private static void printDuplicates(Integer arr[]) {
		Set<Integer> uniqueNumber=new HashSet<>();
		for(Integer num:arr) {
			if(uniqueNumber.contains(num)) {
				System.out.println("Duplicate element:"+num);
			}else {
				uniqueNumber.add(num);
			}
		}
	}
	
	private static void printDuplicatesMethod2(Integer arr1[]){
		  for(int i=0; i < arr1.length-1; i++){
		        for(int j=i+1; j < arr1.length; j++) {
		            
		            if(arr1[i].equals(arr1[j]) ) {
		                System.out.println("Duplicate in Array is : "+ arr1[j]);

		            }
		        }
		  }
	}
	
	public static void main(String[] args) {
		printDuplicates(new Integer[] {1,2,3,2,7,565,656,22,3,566,899});
		printDuplicatesMethod2(new Integer[] {1,2,3,2,7,565,656,22,3,566,899});
	}

}
