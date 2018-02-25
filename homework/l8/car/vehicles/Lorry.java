package homework.l8.car.vehicles;

import homework.l8.car.details.Engine;
import homework.l8.car.professions.Driver;

public class Lorry extends Car {
    private int carryingCapacity;

    public Lorry(String brand, String carClass, int weight, Driver driver, Engine engine, int carryingCapacity) {

        super(brand, carClass, weight, driver, engine);
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("\nCarrying capacity: " + carryingCapacity);
    }
}
