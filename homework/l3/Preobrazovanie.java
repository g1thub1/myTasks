package homework.l3;

public class Preobrazovanie {
    public static void main(String[] args) {
        doubleToStr();
        longToStr();
        floatToStr();
        intToStr();
        intToLong();
        intToFloat();
        longToInt();
        doubleToInt();
        doubleToByte();
        intToByte();
        longToByte();
        floatToByte();
        shortToByte();
    }

    private static void shortToByte() {
        short a = 12834;
        byte b = (byte) a;
        System.out.println(b);
    }

    private static void floatToByte() {
        float a = 12.8f;
        byte b = (byte) a;
        System.out.println(b);
    }

    private static void longToByte() {
        long a = 1283453;
        byte b = (byte) a;
        System.out.println(b);
    }

    private static void intToByte() {
        int a = 1234;
        byte b = (byte) a;
        System.out.println(b);
    }

    private static void doubleToByte() {
        double a = 128;
        byte b = (byte) a;
        System.out.println(b);
    }

    private static void doubleToInt() {
        double d = 4.14;
        int i = (int) d;
        System.out.println(i);
    }

    private static void longToInt() {
        long l = 456789365;
        int i = (int) l;
        System.out.println(i);
    }

    private static void intToFloat() {
        int i = 4847;
        float f = (float) (i);
        System.out.println(f);
    }

    private static void intToLong() {
        int i = 4848;
        long l = (long) (i);
        System.out.println(l);
    }

    private static void floatToStr() {
        float i = 4.48f;
        String str = Float.toString(i);
        System.out.println(str);
    }

    private static void longToStr() {
        long i = 4444488;
        String str = Long.toString(i);
        System.out.println(str);
    }

    private static void doubleToStr() {
        double i = 44.4e40;
        String str = Double.toString(i);
        System.out.println(str);
    }

    private static void intToStr() {
        int i = 35;
        String str = Integer.toString(i);
        System.out.println(str);
    }

}
