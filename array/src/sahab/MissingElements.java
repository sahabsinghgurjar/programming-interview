package sahab;

public class MissingElements {
	public static void main(String args[]) {
		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(getSingleMissingNumber(arr, 2));

		int arr1[] = new int[] { 1, 2, 4, 5, 8, 12, 18, 20 };
		
		int missingElements[] = findAllMissingElements(arr1, 20);
		for(int e:missingElements) {
		System.out.print(e+",");
		}
	}

	public static int[] findAllMissingElements(int arr[], int lastElement) {
		int arrayInd[] = new int[lastElement];
		int count = 0;
		for (int element : arr) {
			if (arrayInd[element - 1] != 1) {
				arrayInd[element - 1] = 1;
				count++;
			}
		}

		int temp[] = new int[lastElement-count];
		for (int i = 0, j = 0; i < arrayInd.length; i++) {
			if(arrayInd[i]!=1) {
			temp[j] = i + 1;
			j++;
			}
		}
		return temp;
	}

	private static int getSingleMissingNumber(int[] a, int n) {
		int i, total;
		// formula to calculate sun of n elements is n*(n+1)/2
		total = (n + 1) * (n + 2) / 2;
		for (i = 0; i < n; i++)
			total -= a[i];
		return total;
	}

}
