package homework.l7.person;

/**
 * Создать класс Person, который содержит:
 * a) поля fullName, age.
 * б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
 * в) Добавьте два конструктора  - Person() и Person(fullName, age).
 * Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
 */
public class Person {
    String fullName = "Wyster";
    private int age = 10;

    Person(String fullName, int age) {
        fullName = "Haryy";
        age = 24;
    }

    Person() {
    }

    void talk(String person) {
        this.move();
        System.out.println("Говорит " + person);
    }

    String move() {
        return fullName;
    }
}
