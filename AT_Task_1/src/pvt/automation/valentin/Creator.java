package pvt.automation.valentin;

import java.util.Scanner;

public class Creator {
    public int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter array size (between 2 & 30 for example):");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int multipliersStep = 99;
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * multipliersStep);
        }
        return array;
    }
}
