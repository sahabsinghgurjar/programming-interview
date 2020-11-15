package sahab;

public class ContinueousSubArrayEqToSum {

	private static void continueousSubArrayEqToSum(int arr[], int sum) {


		for (int i = 0; i < arr.length; i++) {
			int tempSum = 0;
			for (int k = i; k < arr.length; k++) {
				tempSum += arr[k];
				if (tempSum == sum) {
					System.out.println("");
					System.out.print("Sub array:");
					for (int j = i; j <= k; j++) {
						System.out.print(arr[j]+",");
					}
					return;
				} else if (tempSum > sum) {
					break;
				}
			}
		}

	}
	
	

	public static void main(String[] args) {
		continueousSubArrayEqToSum(new int[] {42, 15, 12, 8, 6, 32}, 26);
		continueousSubArrayEqToSum(new int[] {12, 5, 31, 13, 21, 8}, 49);
		continueousSubArrayEqToSum(new int[] {15, 51, 7, 81, 5, 11, 25}, 41);
	}
}
