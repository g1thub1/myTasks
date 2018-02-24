package homework.l7.recursion;

public class TwoNumbers {
    public int between(int a, int b) {
        if (a == b - 1 || a > b - 1) {
            return a;
        } else {
            a++;
            System.out.println(a);
            between(a, b);
            return a;
        }
    }
}
