public class DirSort implements SortAlgorithm{
	public int[] sort(int []array) {
		int i = 1 ;
		int j ;
		int temp ;
		int z ;
		while(i < array.length) {
			for( j = i -1 ; j >= 0 ; ) {
				if(array[j] > array[i]) {
					j--;
				}else {
					break;
				}
			}
			temp = array[i];
			for( z = i ; z > j && z > 0 ; z--) {
				array[z] = array[z-1];
			}
			array[j + 1] = temp;
			i++ ;
		}
		i = 0;
		while( i < array.length) {
			System.out.println(array[i]);
			i++;
		}
		return array;
	}
}