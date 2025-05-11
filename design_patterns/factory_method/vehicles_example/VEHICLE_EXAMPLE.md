# Vehicle Example - Factory Method Design Pattern

This document provides an overview of the code in the `factory_method/vehicles_example` folder. The code demonstrates the Factory Method design pattern using a vehicle creation example.

## Folder Structure
```
design_patterns/
└── factory_method/
    └── vehicles_example/
        ├── clients/
        │   ├── Dumb_Client.java
        │   ├── Smart_Client.java
        ├── factories/
        │   ├── VehicleFactory.java
        ├── models/
        │   ├── Bike.java
        │   ├── Car.java
        │   ├── Vehicle.java
```

## File Descriptions

### `Vehicle.java`
- Defines the base `Vehicle` class.
- Contains common attributes and methods for all vehicles, such as:
  - `name`: The name of the vehicle.
  - `drive()`: A method to simulate driving the vehicle.

### `Car.java`
- Implements the `Car` class, which inherits from the `Vehicle` class.
- Overrides the `drive()` method to provide specific behavior for cars.

### `Bike.java`
- Implements the `Bike` class, which inherits from the `Vehicle` class.
- Overrides the `drive()` method to provide specific behavior for bikes.

### `VehicleFactory.java`
- Defines the `VehicleFactory` class, which is the core of the Factory Method pattern.
- Contains the `createVehicle(String vehicleType)` method to instantiate `Car` or `Bike` objects based on the input type.

## Design Pattern Explanation
The Factory Method design pattern is used to delegate the instantiation of objects to a factory class. This approach promotes loose coupling and makes the code more maintainable and scalable.

### Key Benefits:
- Encapsulation of object creation logic.
- Flexibility to add new vehicle types without modifying existing code.
