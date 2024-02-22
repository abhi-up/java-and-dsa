public class BasicOOPs {

    public static void main(String[] args) {
        // Create a Dog object
        Dog d = new Dog();

        // Set the size of the dog
        d.size = 40;

        // Make the dog bark
        d.bark();

        // Print the size of the dog
        System.out.println("The size of the dog is: " + d.size);
    }
}

class Dog {
    // Instance variables
    int size;
    String breed;
    String name;

    // Method to make the dog bark
    public void bark() {
        System.out.println("Ruff! Ruff!");
    }
}
