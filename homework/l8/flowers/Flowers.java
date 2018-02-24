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

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setB(int b) {
        this.b = b;
    }
}
