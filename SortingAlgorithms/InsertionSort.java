package algorithms.sorting;

public class InsertionSort {

	/** selectionSort() method implements Selection Sort algorithm.
	 * 
	 * It takes input list i.e. unsorted list as a parameter.
	 */
	
	public static void insertionSort(int[] input) {

		System.out.println("Unsorted List: ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("**************");

		/* In each pass, one element's actual position is determined.
		 * Compare an element with all its previous elements 
		 * and swap them if the order is wrong.
		 * 
		 * In each pass, the sorted array grows in size.
		 */
		
		for (int i = 1; i < input.length; i++) {
			for (int j = i; j > 0; j--) {
				if (input[j] < input[j - 1]) {
					int temp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = temp;
				}
			}
		}

		System.out.println("Sorted List: ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]);
			System.out.print(" ");
		}

	}

	public static void main(String[] args) {

		int[] arr1 = { 10, 34, 2, 56, 7, 67, 88, 42 };
		insertionSort(arr1);

	}

}
