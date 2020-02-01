package pvt.automation.valentin;

public class Task_5_Multiplier {
    public static void main(String[] args) {
        Creator creator = new Creator();
        int [] array = creator.createArray();
        int multiplyOfAllArrayElements = 1;
        for (int element : array) {
            System.out.print(element + " ");
            multiplyOfAllArrayElements = multiplyOfAllArrayElements * element;
        }
        System.out.print("\nMultiply of all array elements = " + multiplyOfAllArrayElements);
    }
}
