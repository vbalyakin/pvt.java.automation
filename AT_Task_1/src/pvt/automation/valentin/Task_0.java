package pvt.automation.valentin;

public class Task_0 {
    public static void main(String[] args) {
        int i = 1;
        int a = i++; // сперва a присваивается значение i, а потом i увеличивается на 1 (a = 1; i = 2)
        int b = ++i; // сначала i увеличивается на 1, а потом присваивается b (b = 3; i = 3)
        System.out.println(a);
        System.out.println(b);
    }
}
