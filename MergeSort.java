public class MergeSort implements SortingAlgorithm{
	
	public void sort(int[] a){

		int[] newArray = new int[a.length];
		mergedivided(a, 0 ,a.length, newArray);

	}
	public void merge(int[] array, int top, int middle, int bot, int[] newArray){
		int i = top;
		int j = middle;
		int k = 0;

		while(i < middle && j < bot){
			if(array[i] < array[j]){
	
				newArray[k++]= array[i++];
			}else{

				newArray[k++] = array[j++];
			}
		}

		while(i < middle){
			newArray[k++] = array[i++];
		}

		while(j < bot){

			newArray[k++] = array[j++];
		}

		for(int m = 0; m < k; m++){

			array[top + m] = newArray[m];
		}
	}

	public void mergedivided(int[] array, int top, int bot, int[] newArray){

		if(top + 1 < bot){

			int middle = (top + bot)/2;
			mergedivided(array, top, middle, newArray);
			mergedivided(array, middle, bot, newArray);
			merge(array, top, middle, bot, newArray);
		}
	}

 
}