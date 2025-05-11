package design_patterns.factory_method.vehicles_example.vehicles;

/**
 * Class representing a specific type of vehicle: Bike.
 * This class extends the base Vehicle class and overrides its behavior.
 */
public class Bike extends Vehicle {

    /**
     * Default constructor for the Bike class.
     */
    public Bike() {
    }

    /**
     * Overrides the createVehicle method to provide specific behavior for Bike.
     */
    @Override
    public void createVehicle() {
        System.out.println("Bike created");
    }
}
