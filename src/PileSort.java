
public class PileSort implements SortAlgorithm{
	public int[] sort(int []array) {
		BuildMaxHeap(array , array.length -1);
		int temp ;
		int i;
		for( i= array.length -1 ; i > 1 ; i--) {
			temp = array[1];
			array[i] = temp ;
			AdjustDown(array,1 , i - 1);
		}
		for( i = 0 ; i < array.length; i++) {
			System.out.println(array[i]);
		}
		return array;
	}
	public void  BuildMaxHeap(int []array , int len) {
		for(int i = len/2 ; i > 0  ; i--) {
			AdjustDown(array , i , len);
		}
	}
	public void AdjustDown(int []array , int k , int len) {
		array[0] = array[k];
		int i ;
		for( i = 2 * k ; i <= len ; i *= 2) {
			if( i < len && array[i] > array[i+1])i++;
			if(array[0] < array[i])break;
			else {
				array[k] = array[i];
				k = i ;
			}
		}
		array[k] = array[0];
	}
}
