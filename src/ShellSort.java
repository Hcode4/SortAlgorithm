//布尔排序，有间隔排序
public class ShellSort  implements SortAlgorithm{
	public int[] sort(int[] array) {
		int i ;
		int j ;
		int z ;
		int temp ;
		for(int dk = array.length / 2; dk > 0 ; dk = dk / 2) {//每次减少一半作为步长的变化依据
			j = 0;
			for(j = j + dk ; j < array.length ; j = j + dk) {
				z = j ;
				temp = array[j];
				while( z - dk >= 0 && array[z - dk] > temp) {
					z = z -dk ;
				}
				
				while(j - dk >= z) {
					array[j] = array[j-dk];
					j -= dk;
				}
				array[z] = temp ;
			}
		}
		for( i = 0 ; i < array.length; i++) {
			System.out.println(array[i]);
		}
		return array;
	}
}
