# System Design Docs with Examples

This repository contains system design concepts and examples implemented using various design patterns. The goal is to provide a practical understanding of system design principles through real-world examples.

## Folder Structure
```
system-design/
├── design_patterns/
│   ├── factory_method/
│   │   └── vehicles_example/
│   │       ├── clients/
│   │       │   ├── Dumb_Client.java
│   │       │   ├── Smart_Client.java
│   │       ├── factories/
│   │       │   ├── VehicleFactory.java
│   │       ├── models/
│   │       │   ├── Bike.java
│   │       │   ├── Car.java
│   │       │   ├── Vehicle.java
│   │       ├── README.md
```

## Examples Included
### 1. Factory Method Design Pattern
- **Description**: Demonstrates the Factory Method design pattern using a vehicle creation example.
- **Key Components**:
  - `VehicleFactory`: A factory class to create `Car` and `Bike` objects.
  - `DumbClient` and `SmartClient`: Client classes showcasing basic and advanced usage of the factory.
  - `Vehicle`, `Car`, and `Bike`: Model classes representing different types of vehicles.
- **Location**: `design_patterns/factory_method/vehicles_example/`

## How to Use
1. Clone the repository:
   ```bash
   git clone https://github.com/basupatil1213/system-design-docs-with-example.git
   ```
2. Navigate to the desired example folder.
3. Follow the instructions in the respective `README.md` files to understand and run the examples.

## Purpose
This repository is intended for:
- Learning and understanding system design principles.
- Exploring design patterns through practical examples.
- Serving as a reference for implementing design patterns in real-world projects.

## Contributing
Contributions are welcome! If you have ideas for new examples or improvements, feel free to open an issue or submit a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.