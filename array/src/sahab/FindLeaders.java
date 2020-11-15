package sahab;

public class FindLeaders {
	private static void findLeaders(int arr[]) {
		System.out.println("");
		int max=arr[arr.length-1];
		System.out.println("Leaders are:");
		System.out.print(max);
		for(int j=arr.length-2;j>=0;j--) {
			if(arr[j]>max) {
				System.out.print(","+arr[j]);
				max=arr[j];
			}
		}
	}
public static void main(String[] args) {
	findLeaders(new int[] {12, 9, 7, 14, 8, 6, 3});
	findLeaders(new int[] {8, 23, 19, 21, 15, 6, 11});
	findLeaders(new int[] {55, 67, 71, 57, 51, 63, 38});
}
}
