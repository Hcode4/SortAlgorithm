
public class BubbleSort implements SortAlgorithm{
	public int[] sort(int []array) {
		 int i ; 
		 int j ;
		 int temp ;
		 for(i = 0 ; i < array.length ; i++) {
			 for(j = 0 ; j < array.length - i -1 ; j++) {
				 if(array[j] > array[j + 1]) {
					 temp = array[j];
					 array[j] = array[j + 1];
					 array[j + 1 ] = temp;
				 }
			 }
		 }
		 for( i = 0 ; i < array.length; i++) {
				System.out.println(array[i]);
			}
		return array;
	}
}
