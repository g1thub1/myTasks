package homework.l8.animal;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("лосось ", "двор"), new Dog("рыба ", "будка"),
                new Horse("сено ", "поле")};
        Veterinar veterinar = new Veterinar();
        for (Animal an : animals) {
            veterinar.treatAnimal(an);
        }
    }
}

