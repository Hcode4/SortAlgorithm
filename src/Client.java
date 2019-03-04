
public class Client {
	public static void main(String[]args) {
		int []array = {2,1,4,3,5,1};
//		SortAlgorithm d1 = new DirSort();
//		SortAlgorithm d2 = new BinSort();
//		SortAlgorithm d3 = new ShellSort();
//		SortAlgorithm d4 = new BubbleSort();
//		SortAlgorithm d5 = new FastSort();
//		SortAlgorithm d6 = new ChooseSort();
		SortAlgorithm d7 = new PileSort();
		d7.sort(array);
	}
}

