package homework.l8.animal;

/**
 * Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
 * Класс Animal содержит переменные food, location и методы makeNoise,
 * eat, sleep. Dog, Cat, Horse переопределяют методы makeNoise, eat.
 * Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
 * Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
 * Пусть этот метод распечатывает food и location пришедшего на прием животного.
 * В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
 * В цикле отправляйте их на прием к ветеринару.
 */
public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void sleep() {
        System.out.println("sleep ");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
