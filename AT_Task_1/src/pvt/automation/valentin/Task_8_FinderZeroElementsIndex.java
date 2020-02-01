package pvt.automation.valentin;

public class Task_8_FinderZeroElementsIndex {
    public static void main(String[] args) {
        Creator creator = new Creator();
        int[] array = creator.createArray();
        int counterOfZeroElements = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] == 0) {
                System.out.print("(Zero element, index = " + i + ") ");
                counterOfZeroElements = counterOfZeroElements + 1;
            }
        }
        if (counterOfZeroElements == 0) {
            System.out.println(" - No zero elements found");
        }
    }
}
