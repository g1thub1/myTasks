package homework.l2;

import java.util.Scanner;

public class Metod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число ");
        int a = result(scan);
        int b = result(scan);
        System.out.println("Ответ " + (a + b));
    }

    public static int result(Scanner scan) {
        if (scan.hasNextInt()) {
            return scan.nextInt();
        } else {
            System.exit(0);
            return 0;
        }
    }
}
