package pvt.automation.valentin;

public class Task_9_NeighborsSwapper {
    public static void main(String[] args) {
        Creator creator = new Creator();
        Printer printer = new Printer();
        int[] array = creator.createArray();
        int clipboardArrayElements;
        int divider = 2;
        int step = 2;
        int controllerOutOfBound = 2;
        printer.printArray(array);
        switch (array.length % divider) {
            case 0:
                for (int i = 0; i < array.length - 1; i = i + step) {
                    clipboardArrayElements = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = clipboardArrayElements;
                }
                break;
            case 1:
                for (int i = 0; i < array.length - controllerOutOfBound; i = i + step) {
                    clipboardArrayElements = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = clipboardArrayElements;
                }
                break;
        }
        System.out.println();
        printer.printArray(array);
    }
}
