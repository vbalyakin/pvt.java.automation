package pvt.automation.valentin;

public class Task_11_MaxMinElementsFinder {
    public static void main(String[] args) {
        Creator creator = new Creator();
        Printer printer = new Printer();
        int[] array = creator.createArray();
        int maxElementOfArray = 0;
        int minElementOfArray = array[0];
        printer.printArray(array);
        for (int element : array) {
            if (element > maxElementOfArray) {
                maxElementOfArray = element;
            }
            if (element < minElementOfArray) {
                minElementOfArray = element;
            }
        }
        System.out.println("\nValue of max element = " + maxElementOfArray + "; value of min element = " + minElementOfArray);
    }
}
