package pvt.automation.valentin;

public class Task_10_EdgeElementsChanger {
    public static void main(String[] args) {
        Creator creator = new Creator();
        Printer printer = new Printer();
        int[] array = creator.createArray();
        int divider = 2;
        int step = 1;
        int clipboardArrayElements;
        printer.printArray(array);
        switch (array.length % divider) {
            case 0:
                int middlePointForEvenArray = array.length / divider - 1;
                for (int i = 0; i <= middlePointForEvenArray; i = i + step) {
                    clipboardArrayElements = array[i];
                    array[i] = array[array.length - (i + 1)];
                    array[array.length - (i + 1)] = clipboardArrayElements;
                }
                break;
            case 1:
                int middlePointForNotEvenArray = (array.length - 1) / divider - 1;
                for (int i = 0; i <= middlePointForNotEvenArray; i = i + step) {
                    clipboardArrayElements = array[i];
                    array[i] = array[array.length - (i + 1)];
                    array[array.length - (i + 1)] = clipboardArrayElements;
                }
                break;
        }
        System.out.println();
        printer.printArray(array);
    }
}
