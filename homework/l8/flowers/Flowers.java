package homework.l8.flowers;

/**
 * Создать класс Flower, который содержит переменные страна производитель, срок хранения в днях, цена.
 * Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны и... что-то на свой вкус).
 * Собрать 3 букета (используем массив) с определением их стоимости.
 * В букет может входить несколько цветов разного типа.
 * Также подсчитать количество проданных цветов (используем статическую переменную).
 */
public class Flowers {
    private String country;
    private int price;
    private int b;
    private static int count = 0;

    public Flowers(String country, int price, int b) {
        this.country = country;
        this.price = price;
        this.b = b;
    }

    public Flowers(String country, int b) {
        this.country = country;
        this.b = b;
    }

    Flowers() {
    }

    public String getCountry() {
        return country;
    }

    public int getPrice() {
        return price;
    }

    public int getB() {
        return b;
    }

    public static int getCount() {
        return count;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void setCount(int count) {
        Flowers.count = count;
    }

    public static void main(String[] args) {
        Flowers[] bquet1 = new Flowers[2];
        bquet1[0] = new Carnation("Ukraine", 12, 50);
        bquet1[1] = new Roses("Russia", 14, 50);

        Flowers[] bquet2 = new Flowers[3];
        bquet2[0] = new Carnation("Ukraine", 12, 30);
        bquet2[1] = new Roses("Russia", 14, 23);
        bquet2[2] = new Tulips("India", 16, 21);

        Flowers[] bquet3 = new Flowers[4];
        bquet3[0] = new Carnation("Ukraine", 12, 32);
        bquet3[1] = new Roses("Russia", 14, 21);
        bquet3[2] = new Tulips("India", 16, 43);

        Flowers.bouquetPrice(bquet1);
        Flowers.bouquetPrice(bquet2);
        Flowers.bouquetPrice(bquet3);
        Flowers.setCount(bquet1.length + bquet2.length + bquet3.length);
        System.out.println("Всего продано цветов = " + Flowers.getCount());
    }


    public static void bouquetPrice(Flowers[] bquets) {
        double priceOfBquet = 0.0;
        for (int i = 0; i < bquets.length; i++) {
            priceOfBquet += bquets[i].getPrice();
        }
        System.out.println("Цена букета составляет : " + priceOfBquet);
    }
}
