package BinarySearch;

public class BinarySearch {
	public int search(int[] elems, int key){
		
		int arr[] = elems;
		
		int low = 0;
		int high = elems.length - 1;
		int mid = (low+elems.length) / 2;

		while (arr[mid] != key){
			
			if (arr[mid] < key){
				low = mid;
			}
			else{
				high = mid;
			}
			
			mid = (low + high)/2;
			
				
		} 
		return mid;
	}
}
