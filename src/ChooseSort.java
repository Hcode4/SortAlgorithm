
public class ChooseSort implements SortAlgorithm{
	public int[] sort(int[] array) {
		int i = 0;
		int j;
		int temp ;
		int x ;
		int min;
		while(i < array.length) {
			j = i ;
			min = array[i];
			x = i;
			temp = array[i];
			while(j < array.length) {
				if(array[j] < min) {
					x = j;
					min = array[j];
				}
				j++;
			}
			array[i] = min;
			array[x] = temp;
			i++;
		}
		for( i = 0 ; i < array.length; i++) {
			System.out.println(array[i]);
		}
		return array;
	}
}
