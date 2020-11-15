package sahab;

import java.util.Arrays;

public class CarRooferProblem {

	private static void carRooferProblem(int cars[], int numOfCarsToCovered) {

		Arrays.sort(cars);
		System.out.println("Cars parked:" + Arrays.toString(cars));
		int minimumLengthToCover = cars[numOfCarsToCovered - 1] - cars[0];

		for (int i = 1; i + numOfCarsToCovered < cars.length - 1; i++) {
			int tempLength = cars[i + numOfCarsToCovered - 1] - cars[i];
			if (tempLength < minimumLengthToCover) {
				minimumLengthToCover = tempLength;
			}
		}
		System.out.println("Minimum length:" +( minimumLengthToCover + 1));
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 6, 2, 12, 7 };

		carRooferProblem(arr, 3);

		arr = new int[] { 2, 10, 8, 17 };

		carRooferProblem(arr, 3);
	}

}
