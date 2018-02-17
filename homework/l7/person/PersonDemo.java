package homework.l7.person;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person("Alice", 19);
        Person person1 = new Person();

        person.talk("Leia");
        System.out.println(person.fullName + " " + person1.age);
    }
}
