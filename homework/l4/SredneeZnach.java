package homework.l4;

import java.util.Scanner;

public class SredneeZnach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите три числа ");
        float a = result(sc);
        float b = result(sc);
        float c = result(sc);
        System.out.print("Ответ ");
        System.out.print((a + b + c) / 3);
    }

    private static int result(Scanner sc) {
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
            System.exit(0);
            return 0;
        }
    }
}
