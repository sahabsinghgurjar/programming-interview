package sahab;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//given an integer k  and list of integers , count the number of distinct valid pairs of integer(a,b) for which a+k=b or a=b+k. Two pais of integer (a,b) and (c,d) are considered distinct if there is atleast one element of (a,b) does not exist in (c,d)
public class FindDistinctPairs {
	private static void findDistinctPairs(int arr[], int k) {

		Set<String> distinct = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			int first = arr[i];
			for (int j = i; j < arr.length; j++) {
				int second = arr[j];
				
				int[] subArray=new int[] {first,second};
				Arrays.sort(subArray);
				String key=Arrays.toString(subArray);

				if (!distinct.contains(key) && ((first + k == second)||(first == second+k))) {
					System.out.println(first + "," + second);
					distinct.add(key);

				}
			}

		}
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 1, 1, 2, 3 };
		System.out.println("Output1");
		findDistinctPairs(arr, 1);
		arr= new int[] {1, 5, 3, 4, 2};
		System.out.println("Output2");
		findDistinctPairs(arr, 3);
		
		arr= new int[] {8, 12, 16, 4, 0, 20};
		System.out.println("Output3");
		findDistinctPairs(arr, 4);
	}
}
