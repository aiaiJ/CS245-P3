public class SelectionSort implements SortingAlgorithm{

	public void sort(int [] a){

		int n = a.length;
		for(int i = 0; i < n; i++){

			int small = i;

			for(int j = i+1; j < n; j++){

				if(a[j] < a[small]){

					small = j;
				}
			}

			int temp = a[small];
			a[small] = a[i];
			a[i] = temp;
		}
	}

}