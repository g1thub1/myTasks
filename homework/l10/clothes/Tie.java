package homework.l10.clothes;

public class Tie extends Clothes implements MensClothing{
    public Tie(Sizes size, Double price, String color) {
        super(size, price, color);
        name = "Галстук";
    }

    public Tie() {
    }

    public void clotheAMan() {
    }

    @Override
    public String toString() {
        return "Tie{" +
                "size=" + getSize() +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
