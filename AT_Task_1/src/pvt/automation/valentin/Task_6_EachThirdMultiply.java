package pvt.automation.valentin;

public class Task_6_EachThirdMultiply {
    public static void main(String[] args) {
        Creator creator = new Creator();
        int[] array = creator.createArray();
        int multiplier = 2;
        int divider = 3;
        int j = 2;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % divider == 0) {
                System.out.print("(" + array[i] * multiplier + ") ");
            }
        }
        System.out.println("\nSecond way to multiply by 2 each third element and output then:");
        while (j < array.length) {
            System.out.print("(" + array[j] * multiplier + ") ");
            j = j + 3;
        }
    }
}
