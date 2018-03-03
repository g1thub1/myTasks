package homework.l8.animal;

public class Cat extends Animal {
    public Cat(String food, String location) {
        super(food, location);
    }

    public void eat() {
        System.out.println("Котик кушает ");
    }

    public void makeNoise() {
        System.out.println("MEOW!");
    }
}
