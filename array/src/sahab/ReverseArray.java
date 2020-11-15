package sahab;

public class ReverseArray {
	private static void reverse(int arr[]) {
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		System.out.println("reverse of the array");
		for (int num : arr) {
			System.out.print(num + ",");
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 4, 6, 2, 6, 7, 9, 0, 77, 99 };
		for (int num : arr) {
			System.out.print(num + ",");
		}
		reverse(arr);
	}
}
