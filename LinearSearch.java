package search.linear_search;

public class LinearSearch {

	/** linearSearch method implements the linear or sequential search algorithm.
	 *  First parameter i.e. input is the input array upon 
	 *  which the search is to be performed.
	 *  
	 *  Second parameter i.e. searchKey is the key that needs to be searched
	 *  in the given input array
	 */
	public static int linearSearch(int[] input, int searchKey) {

		/* Loop over each of the elements in the input array and make
		 * a comparison with the searchKey till a match is found.
		 * 
		 * If a match is found, return the index at which the match is found.
		 * If  no match is found, return -1.
		 */
		for (int i = 0; i < input.length; i++) {
			if (input[i] == searchKey)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input1 ={2,6,3,9,5,1};
		int key1= 3;
		System.out.println("Search 1: "+ linearSearch(input1, key1));
		
		int[] input2 ={4,-8,12,1,7,3};
		int key2= 6;
		System.out.println("Search 2: "+ linearSearch(input2, key2));
	}

}
