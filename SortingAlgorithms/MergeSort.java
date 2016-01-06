package algorithms.sorting;

public class MergeSort {

	public static int[] input;

	/** mergeSort() method implements the merge sort algorithm.
	 *  
	 *  the method takes the input unsorted array as an argument
	 */
	
	public static void mergeSort(int[] input){
		
		int length = input.length;
		
		/* when array contains only one element, it will always
		   be sorted. 
		   At this point, start merging the sub arrays.
		   */
		if(length < 2)
			return;
		//calculate middle of the array
		int middle  = length/2;
		
		//first sub array will hold elements left of the middle element
		int[] left = new int[middle];
		// second sub array will hold elements right of the middle element
		int[] right = new int[length-middle];
		
		for(int i = 0; i< middle; i++)
			left[i] = input[i];
		
		for(int i = middle; i< length; i++)
			right[i-middle] = input[i];
		
		
		/* divide and conquer left sub array until 
		 * array is left with only one element 
		 */
		mergeSort(left);
		
		/* divide and conquer right sub array until 
		 * array is left with only one element 
		 */
		mergeSort(right);
		
		/* merge the two sorted halves */
		merge(left, right,input);
			
	}
	
	public static void merge(int[] left, int[] right, int[] input){
		
		int leftLength = left.length;
		int rightLength = right.length;
		int  i = 0;
		int j = 0;
		int k = 0;
		
		/* compare the elements from start of both left and right
		 * arrays.
		 * 
		 * Overwrite the input array with smallest element of the two
		 * and move towards end of the two arrays*/
		while(i<leftLength && j < rightLength){
			if(left[i]<=right[j]){
				input[k] = left[i];
				i++;
			}
			else{
				input[k] = right[j];
				j++;
			}
			k++;
		}
		
		/* In some cases, elements will be left over in either left
		 * or right array that are not added to the parent array.
		 * 
		 * Elements will be left over in only one of the sub arrays.
		 * */
		
		/* if elements are left in the left array that are not added
		 * to the input array, add them*/
		while(i<leftLength){
			input[k] = left[i];
			k++;
			i++;
		}
		
		/* if elements are left in the right array that are not added
		 * to the input array, add them*/
		while(j<rightLength){
			input[k] = right[j];
			k++;
			j++;
		}
		
	}
	
	public static void main(String[] args) {

		int[] arr = {45,23,11,89,77,98,4,28,65,43};
		MergeSort.input = arr;
		mergeSort(MergeSort.input);
		
		System.out.println("Sorted: ");
		for(int i = 0; i< MergeSort.input.length;i++)
			System.out.print(MergeSort.input[i]+ " ");
		
	}

}