package algorithms.sorting;

public class QuickSort {
	private static int[] input;

	/**  quickSort() method implements Quick Sort algorithm
	 *   The method takes two arguments.
	 *   
	 *   start is the start index of the list for sorting.
	 *   end is the end index of the list for sorting.
	 *  
	 *   The elements between start and end will be sorted.
	 * 
	 * */
	public static void quickSort(int start, int end) {

		/* recurse the same function as long as start value 
		 * is less than end.
		 * 
		 * The function will terminate when start 
		 * becomes equal to end indicating array has been sorted.
		 * */
	  	
		if (start < end) {
			int pIndex = partition(start, end);
			quickSort(start, pIndex - 1);
			quickSort(pIndex + 1, end);
		}

	}

	/**  partition() method will partition the input array
	 *   in such a way that the elements that are less than the pivot
	 *   will be moved to the left of the pivot and elements that are 
	 *   greater than the pivot thus will be moved to the right of the pivot.
	 *  
	 *    pivot can be chosen to be any element. 
	 *    In the  below implementation, pivot has been chosen to
	 *    be the right most element in the array. 
	 *    
	 *    the method takes start and end arguments 
	 *    and around these values, the input array will
	 *    be partitioned on the pivot and
	 *    the index of pivot will be returned. 
	 *    
	 * */
	
	public static int partition(int start, int end) {

		int pivot = input[end];
		int pIndex = start;

		for (int i = start; i <= end - 1; i++) {
			if (input[i] < pivot) {
				int temp = input[pIndex];
				input[pIndex] = input[i];
				input[i] = temp;
				pIndex++;
			}
		}

		int temp = input[pIndex];
		input[pIndex] = input[end];
		input[end] = temp;

		return pIndex;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12 };
		QuickSort.input = arr;
		quickSort(0, arr.length - 1);

		System.out.println("Sorted:");
		for (int i : QuickSort.input) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

}
