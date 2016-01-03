package algorithms.searching;

public class BinarySearchRecursion {

	/** binarySearch method implements the binary search algorithm.
	 *  First parameter i.e. input is the input array upon 
	 *  which the search is to be performed.
	 *  
	 *  Second parameter i.e. searchKey is the key that needs to be searched
	 *  in the given input array
	 *  
	 *  Third parameter i.e. low is the low value of boundary for the search.
	 *  
	 *  Fourth parameter i.e. high is the high value of boundary for the search.
	 */
	
	public static void binarySearch(int[] input,int searchKey, int low, int high){
		
		int middle = (low + high)/2;
		/* Compare searchKey to the middle element of the array.
		 * If there is a match, print the index at which the match is found.
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
		 * If  low becomes greater or equal to high, print that key is not found.
		 */

		if(low <= high){
			if(input[middle] == searchKey)
				System.out.println("Key found at index: "+middle);
			else if(input[middle] > searchKey){
				high = middle - 1;	
				//recurse with new high value of boundary for search
				binarySearch(input, searchKey, low, high);
			}
			else if(input[middle] < searchKey){
				low = middle + 1;
				// recurse with new low value of boundary for search
				binarySearch(input, searchKey, low, high);
			}
		}else{
			System.out.println("Key not found");
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input1 = {1,2,3,4,5,6};
		int key1 = 7;
		int low = 0;
		int high = input1.length - 1;
		System.out.println("Search 1: ");
		binarySearch(input1,key1,low,high);
		
		key1 = 5;
		System.out.println("Search 2: ");
		binarySearch(input1,key1,low,high);
		
		
	}


}
