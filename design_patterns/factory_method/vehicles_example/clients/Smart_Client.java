package design_patterns.factory_method.vehicles_example.clients;

import design_patterns.factory_method.vehicles_example.factory.VehicleFactory;
import design_patterns.factory_method.vehicles_example.vehicles.Vehicle;

/**
 * Client class to demonstrate the use of the Factory Method design pattern.
 * This class creates a vehicle based on the input provided via command-line arguments.
 */
public class Smart_Client {

    /**
     * Main method to execute the client logic.
     *
     * @param args command-line arguments where the first argument specifies the vehicle type
     */
    public static void main(String[] args) {
        // Ensure that a vehicle type is provided as an argument
        if (args.length == 0) {
            System.out.println("Please provide a vehicle type (e.g., car, bike) as a command-line argument.");
            return;
        }

        String vehicleType = args[0]; // Retrieve the vehicle type from the arguments

        // Create a new vehicle using the factory method
        Vehicle vehicle = VehicleFactory.getVehicle(vehicleType);

        // Call the method to simulate vehicle creation
        vehicle.createVehicle();
    }
}
