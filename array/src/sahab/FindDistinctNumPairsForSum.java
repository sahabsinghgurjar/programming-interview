package sahab;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDistinctNumPairsForSum {
	
	private static void findDistinctNumPairsForSum(int [] arr, int sum) {
		Set<String> set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			int first=arr[i];
			for(int j=i;j<arr.length;j++) {
				int second=arr[j];
				
				int[] subArray=new int[] {first,second};
				Arrays.sort(subArray);
				String key=Arrays.toString(subArray);
				
				if(first+second==sum && !set.contains(key)) {
					System.out.println(first+","+second);
					set.add(key);
				}
			}
		}
		
	}
	
public static void main(String[] args) {
	int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9,5 };
	findDistinctNumPairsForSum(numbersWithDuplicates,7);
}
}
