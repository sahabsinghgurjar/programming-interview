package sahab;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArrayAndListConversion {
	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 3, 4, 6, 7, 1, 7, 89 };
		List<Integer> list = Arrays.asList(arr);
		Integer arr2[] = new Integer[list.size()];
		list.toArray(arr2);
		

		for (Integer num : arr) {
			System.out.print(num + ",");
		}
		System.out.println("");
		for (Integer num : list) {
			System.out.print(num + ",");
		}
		System.out.println("");
		for (Integer num : arr2) {
			System.out.print(num + ",");
		}
	}
}
