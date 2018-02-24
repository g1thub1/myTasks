package homework.l8.flowers;

public class FlowersDemo {
    public static void main(String[] args) {
        Flowers roses = new Roses("Italy", 50, 20);
        Flowers tulips = new Tulips("Germany", 50, 20);
        Flowers carnation = new Carnation("Spain", 50, 20);

        Flowers[]bquet1 = new Flowers[]{roses,carnation,tulips};
        Flowers[]bquet2 = new Flowers[]{roses,carnation,carnation,tulips};
        Flowers[]bquet3 = new Flowers[]{roses,carnation,tulips,roses};

        System.out.println(roses);
    }
}
