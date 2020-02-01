package pvt.automation.valentin;

public class Methods {
    public int findMinNumber(int firstNumber, int secondNumber) {
        return Math.min(firstNumber, secondNumber);
    }

    public boolean isEvenNumber(int number) {
        int divider = 2;
        return (number % divider == 0);
    }

    public double getSquareNumber(int number) {
        int multiplier = 2;
        return Math.pow(number, multiplier);
    }

    public double getTripleNumber(int number) {
        int multiplier = 3;
        return Math.pow(number, multiplier);
    }
}
