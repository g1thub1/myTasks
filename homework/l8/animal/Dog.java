package homework.l8.animal;

public class Dog extends Animal {
    public Dog(String food, String location) {
        super(food, location);
    }

    public void eat() {
        System.out.println("Песик кушает ");
    }

    public void makeNoise() {
        System.out.println("Who let the dogs out?");
    }
}
