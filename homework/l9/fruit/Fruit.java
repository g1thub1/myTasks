package homework.l9.fruit;

public abstract class Fruit {
    private int weight;
    private static int costFruit;
    private static int cnt;

    public Fruit(int weight, int costFruit) {
        this.weight = weight;
        Fruit.costFruit += costFruit;
        cnt++;
    }

    public abstract int getCost();

    public abstract String getFirstName();

    public abstract int getCostFruit();

    public static int getCostFruit() {
        return costFruit;
    }

    public static int getCnt() {
        return cnt;
    }

    public static void setCnt(int cnt) {
        Fruit.cnt = cnt;
    }

    public final void printManufactured() {
        System.out.println("Made in Ukraine ");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
