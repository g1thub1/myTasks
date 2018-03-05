package homework.l9.fruit;

public class Apple extends Fruit {
    private String appleColor;
    private String variety;
    private int appleCost;
    private static int cstApple = 0;
    private static int appleCnt = 0;

    public Apple(int weight, int costFruit, String appleColor, String variety, int appleCost) {
        super(weight, costFruit);
        this.appleColor = appleColor;
        this.variety = variety;
        this.appleCost = appleCost;
    }

    public int getCostFruit() {
        return cstApple;
    }

    public int getCost() {
        return getWeight() * appleCost;
    }

    public String getFrstName() {
        return "Apples ";
    }

    public static int getAppleCnt() {
        return appleCnt;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getAppleCost() {
        return appleCost;
    }

    public void setAppleCost(int appleCost) {
        this.appleCost = appleCost;
    }
}
