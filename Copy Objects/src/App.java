/**
 * The App class demonstrates the usage of the Car class by creating instances
 * of cars and manipulating their properties.
 */
public class App {
    public static void main(String[] args) throws Exception {
        // Creating instances of Car class with different constructors
        Car car1 = new Car("Chevrolet", "Camaro", 2021);
        Car car2 = new Car("Ford", "MustangGT", 2022);
        Car car3 = new Car("BMW", "X8", 2018);
        Car car4 = new Car(car2); // Copying car2 using copy constructor

        // Incorrect approach: Assigning reference of car1 to car3
        // car3 = car1;

        // Correct approach: Copying the properties of car1 to car3
        car3.copy(car1);

        // Printing details of each car
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

        System.out.println(); // Adding empty line for readability

        // Printing details of car1
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        System.out.println(); // Adding empty line for readability

        // Printing details of car2
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

        System.out.println(); // Adding empty line for readability

        // Printing details of car3
        System.out.println(car3.getMake());
        System.out.println(car3.getModel());
        System.out.println(car3.getYear());

        System.out.println(); // Adding empty line for readability

        // Printing details of car4
        System.out.println(car4.getMake());
        System.out.println(car4.getModel());
        System.out.println(car4.getYear());
    }
}
