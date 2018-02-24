package homework.l8.flowers;

public class Roses extends Flowers {
    public Roses(String country, int price, int b) {
        super(country, price, b);
    }

    public Roses(String country, int b) {
        super(country, b);
        this.price = 50;
    }

    public Roses() {
    }

    public int getPrice() {
        return price;
    }
}
