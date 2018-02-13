package homework.l4;

import java.util.Scanner;

public class SredneeZnach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.print("Введите число: ");
        sc.hasNextInt();
        a = sc.nextInt();
        System.out.print("Введите второе число: ");
        sc.hasNextInt();
        b = sc.nextInt();
        System.out.print("Введите третье число: ");
        sc.hasNextInt();
        c = sc.nextInt();
        System.out.print("Ответ ");
        System.out.print((a + b + c) / 3);
    }
}
