package pvt.automation.valentin;

public class Task_12_MaxMinElementsIndexFinder {
    public static void main(String[] args) {
        Creator creator = new Creator();
        Printer printer = new Printer();
        int[] array = creator.createArray();
        int maxElementOfArray = 0;
        int indexOfMaxElementOfArray = 0;
        int minElementOfArray = array[0];
        int indexOfMinElementOfArray = 0;
        printer.printArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElementOfArray) {
                maxElementOfArray = array[i];
                indexOfMaxElementOfArray = i;
            }
            if (array[i] < minElementOfArray) {
                minElementOfArray = array[i];
                indexOfMinElementOfArray = i;
            }
        }
        System.out.println("\nValue of max element = " + maxElementOfArray + ", index = " + indexOfMaxElementOfArray
                + "; value of min element = " + minElementOfArray + ", index = " + indexOfMinElementOfArray);
    }
}
