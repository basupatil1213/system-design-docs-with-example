package design_patterns.factory_method.vehicles_example.vehicles;

/**
 * Base class representing a generic vehicle.
 * This class can be extended by specific types of vehicles (e.g., Car, Bike).
 */
public class Vehicle {

    /**
     * Default constructor for the Vehicle class.
     */
    public Vehicle() {
    }

    /**
     * Method to simulate the creation of a vehicle.
     * This can be overridden by subclasses to provide specific behavior.
     */
    public void createVehicle() {
        System.out.println("Vehicle created");
    }
    
}