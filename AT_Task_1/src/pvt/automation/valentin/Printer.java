package pvt.automation.valentin;

public class Printer {
    public void printArray(int[] array) {
        System.out.println();
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public void printReverseArray(int[] array) {
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
