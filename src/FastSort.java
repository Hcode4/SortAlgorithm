
public class FastSort implements SortAlgorithm{
	public int[]sort(int[] array){
		QuickSort(array , array.length - 1 ,0);
		for(int i = 0 ; i < array.length; i++) {
			System.out.println(array[i]);
		}
		return array;
	}
	public void QuickSort(int []array , int high , int low) {
		if(high > low) {
			int temp = Partition(array , high , low);
			QuickSort(array , temp -1 , low);
			QuickSort(array , high, temp + 1);
		}
	}
	public int Partition(int []array , int high , int low) {
		int temp ;
		temp = array[low];
		while(low < high) {
			while(low < high && array[high] >= temp)high--;
			array[low] = array[high];
			while(low < high && array[low] < temp) low ++;
			array[high] = array[low];
		}
		array[low] = temp ;
		return low;
	}
}
