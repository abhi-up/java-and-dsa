public class App {
    public static void main(String[] args) throws Exception {
        // Create a new Car object with initial values
        Car newCar = new Car("Ford Mustang GT", 2017, 75_00_000.00);

        // Print the initial values using getter methods
        System.out.println("Initial Car Details:");
        System.out.println("Model: " + newCar.getModel());
        System.out.println("Year: " + newCar.getYear());
        System.out.println("Price: " + newCar.getPrice());

        // Modify the Car details using setter methods
        newCar.setModel("Lamborghini Urus");
        newCar.setYear(2022);
        newCar.setPrice(4_00_00_000.00);

        // Print the modified values using getter methods
        System.out.println("\nModified Car Details:");
        System.out.println("Model: " + newCar.getModel());
        System.out.println("Year: " + newCar.getYear());
        System.out.println("Price: " + newCar.getPrice());
    }
}
