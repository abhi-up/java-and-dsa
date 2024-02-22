public class ObjectPassing2 {

    // Define a class named Person
    public static class Person {
        String name; // Declare a String variable to store the name of the person

        // Constructor for the Person class
        Person(String name) {
            this.name = name; // Initialize the name of the person
        }

        // Method to get the name of the person
        public String getName() {
            return this.name; // Return the name of the person
        }
    }

    // Define a class named Employee
    public static class Employee {
        Person person; // Declare a variable of type Person to store information about the employee

        // Constructor for the Employee class
        Employee(Person person) {
            this.person = person; // Initialize the person associated with the employee
        }

        // Method to display information about the employee
        public void displayEmployee() {
            System.out.println("Employee name: " + this.person.getName()); // Print the name of the employee
        }
    }

    // Main method where the program execution starts
    public static void main(String[] args) {
        // Create a Person object representing Donald Trump
        Person person1 = new Person("Donald Trump");
        // Create a Person object representing Adolf Hitler
        Person person2 = new Person("Adolf Hitler");

        // Create an Employee object with person1 (Donald Trump) as an argument
        Employee emp1 = new Employee(person1);
        // Create an Employee object with person2 (Adolf Hitler) as an argument
        Employee emp2 = new Employee(person2);

        // Display information about emp1 (Donald Trump)
        emp1.displayEmployee();
        // Display information about emp2 (Adolf Hitler)
        emp2.displayEmployee();
    }
}
