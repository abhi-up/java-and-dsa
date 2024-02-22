public class InheritanceInJava {
    // Superclass representing a generic Vehicle
    public static class Vehicle {
        String make; // Make of the vehicle
        String model; // Model of the vehicle
        int year; // Year of manufacture

        // Constructor for initializing Vehicle attributes
        Vehicle(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        // Method to display details of the vehicle
        void displayDetails() {
            System.out.println("Vehicle make: " + this.make);
            System.out.println("Vehicle model: " + this.model);
            System.out.println("Vehicle year: " + this.year);
        }
    }

    // Subclass representing a Car, inheriting from Vehicle
    public static class Car extends Vehicle {
        int numDoors; // Number of doors in the car

        // Constructor for initializing Car attributes
        Car(String make, String model, int year, int numDoors) {
            super(make, model, year); // Call superclass constructor
            this.numDoors = numDoors;
        }

        // Override method to display details of the car, including number of doors
        @Override
        void displayDetails() {
            super.displayDetails(); // Call superclass method to display generic vehicle details
            System.out.println("Number of doors: " + this.numDoors);
        }
    }

    // Subclass representing a Truck, inheriting from Vehicle
    public static class Truck extends Vehicle {
        double cargoCapacity; // Cargo capacity of the truck (in ton)

        // Constructor for initializing Truck attributes
        Truck(String make, String model, int year, double cargoCapacity) {
            super(make, model, year); // Call superclass constructor
            this.cargoCapacity = cargoCapacity;
        }

        // Override method to display details of the truck, including cargo capacity
        @Override
        void displayDetails() {
            super.displayDetails(); // Call superclass method to display generic vehicle details
            System.out.println("Cargo capacity (in ton): " + this.cargoCapacity);
        }
    }

    // Main method to demonstrate the usage of Vehicle, Car, and Truck classes
    public static void main(String[] args) {
        // Create an instance of Vehicle
        Vehicle vehicle = new Vehicle("Ninja", "H2R", 2021);

        // Create an instance of Car
        Car car = new Car("Ford", "Mustang GT", 2016, 2);

        // Create an instance of Truck
        Truck truck = new Truck("Ashok LeyLand", "RTX-07", 2024, 105.60);

        // Display details of the vehicle
        vehicle.displayDetails();
        System.out.println();

        // Display details of the car
        car.displayDetails();
        System.out.println();

        // Display details of the truck
        truck.displayDetails();
    }
}
