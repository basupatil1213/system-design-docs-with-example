package design_patterns.factory_method.vehicles_example.clients;

import design_patterns.factory_method.vehicles_example.vehicles.Bike;
import design_patterns.factory_method.vehicles_example.vehicles.Car;
import design_patterns.factory_method.vehicles_example.vehicles.Vehicle;

/**
 * Client class that demonstrates a non-factory approach to creating vehicles.
 * This class directly instantiates specific vehicle types based on input.
 */
public class Dumb_Client {

    /**
     * Main method to execute the client logic.
     *
     * @param args command-line arguments where the first argument specifies the vehicle type
     */
    public static void main(String[] args) {
        // Ensure that a vehicle type is provided as an argument
        if (args.length == 0) {
            System.out.println("Please provide a vehicle type (e.g., Bike, Car) as a command-line argument.");
            return;
        }

        String vehicleType = args[0]; // Retrieve the vehicle type from the arguments
        Vehicle vehicle = null; // Initialize the vehicle reference

        // Check the vehicle type and instantiate the corresponding class
        if (vehicleType.equalsIgnoreCase("Bike")) {
            vehicle = new Bike();
        } else if (vehicleType.equalsIgnoreCase("Car")) {
            vehicle = new Car();
        } else {
            vehicle = new Vehicle(); // Default to a generic Vehicle
        }

        // Call the method to simulate vehicle creation
        vehicle.createVehicle();
    }
}
