package homework.l9.fruit;

public class Pear extends Fruit {
    private String pearColor;
    private String variety;
    private int pearCost;
    private static int cstPear = 0;
    private static int pearCnt = 0;

    public Pear(int weight, int costFruit, String pearColor, String variety, int pearCost) {
        super(weight, costFruit);
        this.pearColor = pearColor;
        this.variety = variety;
        this.pearCost = pearCost;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getCostFruit() {
        return cstPear;
    }

    public int getCost() {
        return getWeight() * pearCost;
    }

    public String getFrstName() {
        return "Pears ";
    }

    public static int getCstPear() {
        return cstPear;
    }

    public static void setCstPear(int cstPear) {
        Pear.cstPear = cstPear;
    }

    public static int getPearCnt() {
        return pearCnt;
    }

    public static void setPearCnt(int pearCnt) {
        Pear.pearCnt = pearCnt;
    }

    public void setPearColor(String pearColor) {
        this.pearColor = pearColor;
    }

    public String getPearColor() {
        return pearColor;
    }

    public void setPearolor(String pearColor) {
        this.pearColor = pearColor;
    }

    public int getPearCost() {
        return pearCost;
    }

    public void setPearCost(int pearCost) {
        this.pearCost = pearCost;
    }
}
