package algorithms.sorting;

public class BubbleSort {

	/** In BubbleSort, a number and its next number are compared 
	 *  for greater/less than relationship and swapped accordingly.
	 * 
	 *  This swap continues until all the members are sorted.
	 */
	
	public static void bubbleSort(int[] input) {

		// printing members before sorting
		System.out.println("Members before sorting:");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]);
			System.out.print(" ");
		}
		System.out.println("");
		System.out.println("***********************");

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j <= i; j++) {
				
				/*
				 * Ascending sort. 
				 * For Descending sort, reverse the comparison sign
				 */
				if (input[j] > input[i]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}

		// printing sorted members
		System.out.println("Sorted Members:");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]);
			System.out.print(" ");
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		bubbleSort(input);
	}

}
