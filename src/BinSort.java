
public class BinSort implements SortAlgorithm{
	public int[] sort(int []array) {
		int high ;
		int low ;
		int midum ;
		int i = 1;
		int j ;
		int temp ;
		while(i < array.length) {
			temp = array[i];
			low = 0 ;
			high = i - 1 ;
			while( low  <= high) {
				midum = (low + high) / 2 ;
				if(array[midum] > temp) {
					high = midum - 1;
				}else {
					low = midum + 1 ;
				}
			}
			for( j = i - 1 ; j >= high + 1 ; --j) {
				array[j+1] = array[j];
			}
			array[high + 1 ] = temp;
			i++;
		}
		for( i = 0 ; i < array.length; i++) {
			System.out.println(array[i]);
		}
		return array;
	}
}
