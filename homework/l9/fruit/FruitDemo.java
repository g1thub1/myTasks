package homework.l9.fruit;

public class FruitDemo {
    public static void main(String[] args) {
        Fruit[] fruits = {new Apple(3, 6, "green ", "variety", 5),
                new Pear(5, 8, "red", "variety", 9),
                new Abricos(22, 7, "variety", 7)};
        for (Fruit fruit : fruits) {
            System.out.println(" "+ fruit.getFirstName() + fruit.getCostFruit()+ " ");
        }
    }
}
