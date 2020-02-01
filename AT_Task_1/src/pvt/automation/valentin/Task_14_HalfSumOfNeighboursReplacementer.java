package pvt.automation.valentin;

public class Task_14_HalfSumOfNeighboursReplacementer {
    public static void main(String[] args) {
        Creator creator = new Creator();
        int[] array = creator.createArray();
        Printer printer = new Printer();
        int divider = 2;
        int step = 1;
        int stepForPreviousElement = 2;
        printer.printArray(array);
        array[0] = array[1] / divider;
        for (int i = 1; i < array.length - step; i = i + step) {
            array[i] = (array[i - step] + array[i + step]) / divider;
        }
        array[array.length - 1] = array[array.length - stepForPreviousElement] / divider;
        System.out.println();
        printer.printArray(array);
    }
}
