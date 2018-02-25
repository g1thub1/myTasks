package homework.l8.car.vehicles;

import homework.l8.car.details.Engine;
import homework.l8.car.professions.Driver;

public class CarDemo {
    public static void main(String[] args) {
        Driver d1, d2, d3;
        Car c1, c2, c3;

        c1 = new Car("Lada", "sedan", 1200, d1 = new Driver("John", "Konnor",
                32, 14), new Engine(305, "Gunma Oizumi Plant"));
        c2 = new Lorry("Bmw", "x6", 3000, d2 = new Driver("Frederico",
                "Castle", 35, 17), new Engine(450, "GM"), 400);
        c3 = new SportСar("Mitsubishi", "g65", 1300, d3 = new Driver("Carl",
                "Johnsson", 22, 4), new Engine(450, "MM"), 250);

        c1.start();
        c1.stop();
        c1.turnLeft();
        c1.turnRight();

        c2.start();
        c2.stop();
        c2.turnLeft();
        c2.turnRight();

        c3.start();
        c3.stop();
        c3.turnLeft();
        c3.turnRight();
    }
}
