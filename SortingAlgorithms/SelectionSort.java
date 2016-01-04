package algorithms.sorting;

public class SelectionSort {

	/** selectionSort() method implements Selection Sort algorithm.
	 * 
	 * It takes input list i.e. unsorted list as a parameter.
	 */
	
	
	public static void selectionSort(int[] input) {
		System.out.println("Unsorted List: ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("**************");

		// used to determine the smallest element in every pass
		int index;
		for (int i = 0; i < input.length; i++) {
			index = i;

			/* find the smallest member positioned between i and 
			 * length of input list.
			 * 
			 * Swap element at ith position with the smallest member.
			 * If ith position element is the smallest member, do nothing. 
			 */
			
			for (int j = i + 1; j < input.length; j++) {
				// computation of smallest element index
				if (input[j] < input[index])
					index = j;
			}

			// swap current element with smallest element in this pass
			int smallestNumber = input[index];
			input[index] = input[i];
			input[i] = smallestNumber;

		}

		System.out.println("Sorted List: ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]);
			System.out.print(" ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 10, 34, 2, 56, 7, 67, 88, 42 };
		selectionSort(arr1);
	}

}
