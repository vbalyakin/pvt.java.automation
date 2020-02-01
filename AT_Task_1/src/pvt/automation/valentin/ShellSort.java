package pvt.automation.valentin;

public class ShellSort {
    public void sort(int[] array) {
        int hop = 1;
        int divider = 3;
        while (hop * divider < array.length)
            hop = hop * divider + 1;

        while (hop >= 1) {
            hopSort(array, hop);
            hop = hop / divider;
        }
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void hopSort(int[] array, int hop) {
        int length = array.length;
        for (int i = hop; i < length; i++) {
            for (int j = i; j >= hop; j = j - hop) {
                if (array[j] < array[j - hop]) {
                    swap(array, j, j - hop);
                } else {
                    break;
                }
            }
        }
    }
}
