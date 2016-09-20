package bubbleSort;

public class BubbleSortExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array[]={9,6,3,4,7,0};
		BubbleSort bs = new BubbleSort();
		int[] array = bs.sort(Array);
		
		for (int i=0;i<array.length;i++){ //Bubble Sort한 배열 출력
			System.out.print(array[i]+" ");
		}
		
	}

}
