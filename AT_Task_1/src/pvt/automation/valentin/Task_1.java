package pvt.automation.valentin;

public class Task_1 {
    public static void main(String[] args) {
        int j = 0;
        int sizeOfArray = 26;
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        while (j < array.length) {
            System.out.print(array[j] + " ");
            j++;
        }
    }
}
