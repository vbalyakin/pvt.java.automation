package pvt.automation.valentin;

public class Task_17_Optional_ShellSort {
    public static void main(String[] args) {
        Creator creator = new Creator();
        int[] array = creator.createArray();
        Printer printer = new Printer();
        printer.printArray(array);
        ShellSort shellSort = new ShellSort();
        long startPoint = System.currentTimeMillis();
        shellSort.sort(array);
        System.out.println("\nTime for sort your array by Shell Method (in milliseconds): "
                + (double) (System.currentTimeMillis() - startPoint));
        printer.printArray(array);
    }
}
