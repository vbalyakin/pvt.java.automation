package pvt.automation.valentin;

public class Task_4_ArrayPrinter {
    public static void main(String[] args) {
        Creator creator = new Creator();
        int[] array = creator.createArray();
        Printer printer = new Printer();
        printer.printArray(array);
        printer.printReverseArray(array);
    }
}
