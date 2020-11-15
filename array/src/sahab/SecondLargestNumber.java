package sahab;

public class SecondLargestNumber {
	private static int secondLargest(int arr[]) {
		int firstLargest = arr[0];
		int secondLargest = arr[1];

		if (arr[1] > arr[0]) {
			firstLargest = arr[1];
			secondLargest = arr[0];
		}

		for (int i = 2; i < arr.length; i++) {
			if (firstLargest < arr[i]) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}else if(secondLargest<arr[i]) {
				secondLargest=arr[i];
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {
		System.out.println("second largest:" + secondLargest(new int[] {565, 23, 4, 5, 7, 8, 21, 65, 6, 569, 5, 6, 69,800}));
	}
}
