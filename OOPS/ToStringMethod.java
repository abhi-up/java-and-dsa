/**
 * ToStringMethod
 */
public class ToStringMethod {
    public static class Car {
        String brand;
        String model;
        int year;

        // Constructor
        Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        // Override toString() method to provide a meaningful representation
        @Override
        public String toString() {
            return "Car{ " +
                    "brand= '" + brand + '\'' +
                    ", model= '" + model + '\'' +
                    ", year= " + year +
                    '}';
        }

    }

    public static void main(String[] args) {
        // Create a Car object
        Car c = new Car("BMW", "X8", 2020);

        // Print the object using toString()
        System.out.println(c.toString());

        // toString() is implicitly called when you concatenate an object with a string
        System.out.println("My car: " + c);

    }
}