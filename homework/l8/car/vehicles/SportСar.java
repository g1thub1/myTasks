package homework.l8.car.vehicles;

import homework.l8.car.details.Engine;
import homework.l8.car.professions.Driver;

public class SportСar extends Car {
    private int maxSpeed;

    public SportСar(String brand, String carClass, int weight, Driver driver, Engine engine, int maxSpeed) {
        super(brand, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("\nMaximal speed: " + maxSpeed);
    }
}
