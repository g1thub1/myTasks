package homework.l8.flowers;

public class Carnation extends Flowers {
    public Carnation(String country, int price, int b) {
        super(country, price, b);
    }

    public Carnation(String country, int b) {
        super(country, b);
        this.price = 50;
    }

    public Carnation() {
    }

    public int getPrice() {
        return price;
    }
}
}
