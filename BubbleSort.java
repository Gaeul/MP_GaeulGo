package bubbleSort;

import java.lang.reflect.Array;

public class BubbleSort { 
	public int[] sort(int a[]){ //큰 수를 뒤로 보내기
		
		int array[] = a ;
		
		for (int i = 0 ; i<array.length -1 ; i++){
			for (int j = 0 ; j<array.length -1 ; j++){
				
				if (array[j] > array[j+1]) {
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				} else continue;
					
			}
		}
		
		return array;
	}
}
