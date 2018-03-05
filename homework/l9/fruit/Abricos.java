package homework.l9.fruit;

public class Abricos extends Fruit {
    private String variety;
    private int abricostCost;
    private static int cstAbricos = 0;
    private static int abricosCnt = 0;

    public Abricos(int weight, int costFruit, String variety, int abricostCost) {
        super(weight, costFruit);
        this.variety = variety;
        this.abricostCost = abricostCost;
        abricosCnt++;
        cstAbricos += abricostCost;
    }

    public int getCostFruit() {
        return cstAbricos;
    }

    public int getCost() {
        return 0;
    }

    public String getFrstName() {
        return "Apricots";
    }

    public static int getAbricosCnt() {
        return abricosCnt;
    }

    public static int getcstAbricos() {
        return cstAbricos;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getAbricostCost() {
        return abricostCost;
    }

    public void setAbricostCost(int apricotCost) {
        this.abricostCost = apricotCost;
    }
}
