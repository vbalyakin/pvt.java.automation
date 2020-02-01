package pvt.automation.valentin;

public class QuickSort {
    public void quickSort(int[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int i = low;
        int j = high;
        int divider = 2;
        int middle = low + (high - low) / divider;
        int base = array[middle];
        while (i <= j) {
            while (array[i] < base) {
                i++;
            }
            while (array[j] > base) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(array, low, j);
        }
        if (high > i) {
            quickSort(array, i, high);
        }
    }
}
