package pvt.automation.valentin;

public class Task_3 {
    public static void main(String[] args) {
        int startPoint = 2;
        int divider = 2;
        int finishPoint = 20;
        int middlePoint = 10;
        for (int i = startPoint; i <= finishPoint; i++) {
            if ((i % divider == 0) && (i > middlePoint)) {
                System.out.print(i + " ");
            }
        }
    }
}
