// Define a public class named ObjectPassing
public class ObjectPassing1 {

    // Define a static inner class named Garage representing a parking space
    public static class Garage {

        // Method to park a Car object in the garage
        void park(Car car) {
            // Access and print the car's name using the passed object
            System.out.println(car.carName + " is parked in the garage.");
        }
    }

    // Define a static inner class named Car representing a car
    public static class Car {

        // String variable to store the car's name
        String carName;

        // Constructor that initializes the car's name
        Car(String name) {
            this.carName = name;
        }
    }

    // Main method where program execution begins
    public static void main(String[] args) {

        // Create a new Garage object
        Garage garage = new Garage();

        // Create two Car objects with different names
        Car car1 = new Car("MustangGT");
        Car car2 = new Car("Rolls Royce");

        // Call the park() method on the Garage object, passing each Car object
        System.out.println();
        garage.park(car1); // Park MustangGT
        garage.park(car2); // Park Rolls Royce
    }
}
