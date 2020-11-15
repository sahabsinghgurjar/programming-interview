package sahab;

public class MoveZerosToEnd {
	private static void moveZerosToEnd(int arr[]) {
		System.out.println("Length of array:"+arr.length);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				for (int j = arr.length-1; j > i; j--) {
					if (arr[j] != 0) {
						arr[i] = arr[j];
						arr[j] = 0;
						break;
					}
				}
			}
		}
		for(int num:arr) {
			System.out.print(num+",");
		}
	}

	public static void main(String[] args) {
		moveZerosToEnd(new int[] {0,4,5,0,3,0,6,0,0,45,5,6,7,0});
		moveZerosToEnd(new int[] {1, -5, 0, 0, 8, 0, 1});
		moveZerosToEnd(new int[] {0, 1, 0, 1, -5, 0, 4});
		moveZerosToEnd(new int[] {-4, 1, 0, 0, 2, 21, 4});
	}
}
