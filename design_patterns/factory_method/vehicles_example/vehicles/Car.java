package design_patterns.factory_method.vehicles_example.vehicles;

/**
 * Class representing a specific type of vehicle: Car.
 * This class extends the base Vehicle class and overrides its behavior.
 */
public class Car extends Vehicle {

    /**
     * Default constructor for the Car class.
     */
    public Car() {
    }

    /**
     * Overrides the createVehicle method to provide specific behavior for Car.
     */
    @Override
    public void createVehicle() {
        System.out.println("Car created");
    }
    
}
