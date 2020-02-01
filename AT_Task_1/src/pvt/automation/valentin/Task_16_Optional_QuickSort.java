package pvt.automation.valentin;

public class Task_16_Optional_QuickSort {
    public static void main(String[] args) {
        Creator creator = new Creator();
        int[] array = creator.createArray();
        Printer printer = new Printer();
        printer.printArray(array);
        int low = 0;
        int high = array.length - 1;
        QuickSort quickSort = new QuickSort();
        long startPoint = System.currentTimeMillis();
        quickSort.quickSort(array, low, high);
        System.out.println("\nTime for sort your array by Quick Sort Method (in milliseconds): "
                + (double) (System.currentTimeMillis() - startPoint));
        printer.printArray(array);
    }
}
