package BinarySearch;

public class BinarySearchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//임의로 배열과 key값을 설정
		int[] Array = {1, 5, 7, 8, 9, 11, 12, 15, 17, 21}; 
		int key = 15; 
		
		BinarySearch bs = new BinarySearch();
		
		int result = bs.search(Array, key);
		System.out.println("key = "+ key + " Found key = " +result);
	}
	
}
