package design_patterns.factory_method.vehicles_example.factory;

import design_patterns.factory_method.vehicles_example.vehicles.Bike;
import design_patterns.factory_method.vehicles_example.vehicles.Car;
import design_patterns.factory_method.vehicles_example.vehicles.Vehicle;

/**
 * Factory class to create instances of different types of vehicles.
 * This class uses the Factory Method design pattern to instantiate objects
 * based on the provided vehicle type.
 */
public class VehicleFactory {

    /**
     * Returns an instance of a Vehicle based on the provided vehicle type.
     *
     * @param vehicleType the type of vehicle to create (e.g., "car", "bike")
     * @return an instance of the specified Vehicle type
     * @throws IllegalArgumentException if the vehicle type is null, empty, or unknown
     */
    public static Vehicle getVehicle(String vehicleType) {
        // Validate the input to ensure it is not null or empty
        if (vehicleType == null || vehicleType.isEmpty()) {
            throw new IllegalArgumentException("Vehicle type cannot be null or empty");
        }

        // Determine the type of vehicle to create based on the input
        switch (vehicleType.toLowerCase()) {
            case "car":
                return new Car(); // Return a Car instance
            case "bike":
                return new Bike(); // Return a Bike instance
            default:
                // Throw an exception for unknown vehicle types
                throw new IllegalArgumentException("Unknown vehicle type: " + vehicleType);
        }
    }
}
