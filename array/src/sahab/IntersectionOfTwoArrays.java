package sahab;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
	
	private static void intersectionOfTwoArrays(Integer arr1[], Integer arr2[]) {
		Set<Integer> set1=new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		
		set1.addAll(Arrays.asList(arr1));
		set2.addAll(Arrays.asList(arr2));
		set1.retainAll(set2);
		System.out.println("Intersection of the elements");
		for(Integer num:set1) {
			System.out.print(num+",");
		}
	}
public static void main(String[] args) {
	intersectionOfTwoArrays(new Integer[] {4,5,6,6121,4},new Integer[] {3,5,2,6,6121,4} );
}
}
