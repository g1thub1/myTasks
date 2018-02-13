package homework.l4;

public class Girlyanda {
    public static void main(String[] args) {
        int g = 32;
        punkt1(g);
        punkt2(g);
        punkt3(g);
        punkt4(g);
    }

    private static void punkt4(int g) {
        System.out.println(Integer.toBinaryString(g));
    }

    private static void punkt3(int g) {
        int p3 = g & 1;
        System.out.println(Integer.toBinaryString(p3));
    }

    private static void punkt2(int g) {
        int p2 = g >> 1;
        System.out.println(Integer.toBinaryString(p2));
    }

    private static void punkt1(int g) {
        int p1 = ~g;
        System.out.println(Integer.toBinaryString(p1));
    }
}
