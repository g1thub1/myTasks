package homework.l2;

import java.util.Scanner;

public class Metod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        result(sc);
    }

    private static void result(Scanner sc) {
        sc.hasNextInt();
        int a = sc.nextInt();
        sc.hasNextInt();
        int b = sc.nextInt();
        a += b;
        System.out.println(a);
    }
}
