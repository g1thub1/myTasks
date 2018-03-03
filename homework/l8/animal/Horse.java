package homework.l8.animal;

public class Horse extends Animal {
    public Horse(String food, String location) {
        super(food, location);
    }

    public void eat() {
        System.out.println("Лошадка кушает ");
    }

    public void makeNoise() {
        System.out.println("*звук коня*");
    }
}
