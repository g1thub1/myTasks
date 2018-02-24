package homework.l8.flowers;

public class Tulips extends Flowers {
    public Tulips(String country, int price, int b) {
        super(country, price, b);
    }

    public Tulips(String country, int b) {
        super(country, b);
        this.price = 50;
    }

    public Tulips() {
    }

    public int getPrice() {
        return price;
    }
}
}
