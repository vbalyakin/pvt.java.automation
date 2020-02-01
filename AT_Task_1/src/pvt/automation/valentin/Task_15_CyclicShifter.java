package pvt.automation.valentin;

public class Task_15_CyclicShifter {
    public static void main(String[] args) {
        Creator creator = new Creator();
        Printer printer = new Printer();
        int[] array = creator.createArray();
        int[] arrayWithShift = new int[array.length];
        int shift = 2;
        printer.printArray(array);
        for (int i = 0; i < shift; i++) {
            arrayWithShift[i] = array[array.length - shift + i];
        }
        for (int i = 0; i < array.length - shift; i++) {
            arrayWithShift[i + shift] = array[i];
        }
        printer.printArray(arrayWithShift);
    }
}
