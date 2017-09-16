public class QuickSort implements SortingAlgorithm{

	private int a[];
    private int length;
 
    public void sort(int[] array) {
         
        if (array == null || array.length == 0) {
            return;
        }
        this.a = array;
        length = array.length;
        sort(0, length - 1);
    }
 
    private void sort(int top, int bot) {
         
        int i = top;
        int j = bot;
        int pivot = a[top+(bot-top)/2];
        while (i <= j) {
            
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (top < j)
            sort(top, j);
        if (i < bot)
            sort(i, bot);
    }
 
    private void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}