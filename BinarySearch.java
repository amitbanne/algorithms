package algorithms.searching;

public class BinarySearch {

	/** binarySearch method implements the binary search algorithm.
	 *  First parameter i.e. input is the input array upon 
	 *  which the search is to be performed.
	 *  
	 *  Second parameter i.e. searchKey is the key that needs to be searched
	 *  in the given input array
	 */
	public static int binarySearch(int[] input, int searchKey){
		int low = 0;
		int high = input.length-1;
		int middle = (low + high)/2;
		
		/* Compare searchKey to the middle element of the array.
		 * If there is a match, return the index at which the match is found.
		 * 
		 * If middle element is less than searchKey, 
		 * a) then low will be updated to middle + 1. 
		 * b) high value remains unchanged. 
		 * c) New middle value is computed.
		 * 
		 * If middle element is greater than searchKey, 
		 * a) then high will be updated to middle - 1. 
		 * b) low value remains unchanged. 
		 * c) New middle value is computed.
		 * 
		 * Comparison is made for match. If no match, repeat the above steps
		 * till either a match is found or low value becomes greater than
		 * or equal to high value.
		 * 
		 * If  low becomes greater or equal to high, return -1.
		 */
		
		while(low <= high){
			if(input[middle] == searchKey)
				return middle;
			else if(input[middle] > searchKey)
				high = middle - 1;
			else if(input[middle] < searchKey)
				low = middle + 1;
			
			middle = (low + high)/2;
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input1 = {1,2,3,4,5,6};
		int key1 = 7;
		System.out.println("Search 1: "+ binarySearch(input1,key1));
		
		key1 = 5;
		System.out.println("Search 2: "+ binarySearch(input1,key1));
		
		
	}

}
