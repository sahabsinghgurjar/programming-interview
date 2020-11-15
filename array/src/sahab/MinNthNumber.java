package sahab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinNthNumber {
	
	private int minNthNumber(int index,Integer arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int j=0;
			count=0;
			for(;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					count++;
				}
				if(count>index-1) {
					break;
				}
			}
			if(count==index-1&&j>=arr.length) {
				return arr[i];
			}
		}
		return 0;
	}
	
	public static void main(String args[]) {
		
		MinNthNumber minNthNumber=new MinNthNumber();
		//int arr[]=new int[8];
		Integer arr[]=new Integer[]{4,6,545,788,13,8,446,878,21,575,980,686,53};
		int minNumber=minNthNumber.minNthNumber(1, arr);
		List<Integer> list=Arrays.asList(arr);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(minNumber);
		
	}

}
