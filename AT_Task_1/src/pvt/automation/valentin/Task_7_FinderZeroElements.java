package pvt.automation.valentin;

public class Task_7_FinderZeroElements {
    public static void main(String[] args) {
        Creator creator = new Creator();
        int[] array = creator.createArray();
        int counterOfZeroElements = 0;
        for (int element : array) {
            System.out.print(element + " ");
            if (element == 0) {
                counterOfZeroElements = counterOfZeroElements + 1;
            }
        }
        if (counterOfZeroElements > 0) {
            System.out.println(" - Count of zero elements = " + counterOfZeroElements);
        } else {
            System.out.println(" - No zero elements found");
        }
    }
}
