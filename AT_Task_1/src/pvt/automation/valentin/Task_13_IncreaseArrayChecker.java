package pvt.automation.valentin;

public class Task_13_IncreaseArrayChecker {
    public static void main(String[] args) {
        Creator creator = new Creator();
        Printer printer = new Printer();
        int[] array = creator.createArray();
        int counter = 0;
        printer.printArray(array);
        for (int i = 1; i < array.length; i++) {
            counter = (array[i] > array[i - 1]) ? counter + 1 - 1 : counter + 1;
        }
        String result = (counter > 0) ? "This array is not increasing" : "This array is increasing";
        System.out.println("\n" + result);
    }
}
