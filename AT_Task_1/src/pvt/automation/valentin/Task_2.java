package pvt.automation.valentin;

public class Task_2 {
    public static void main(String[] args) {
        int startPoint = 2;
        int divider = 2;
        int finishPoint = 20;
        for (int i = startPoint; i <= finishPoint; i++) {
            if (i % divider == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
