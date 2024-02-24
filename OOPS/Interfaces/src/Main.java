// Define the Main class
public class Main {
    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Create instances of Rabbit, Hawk, and Fish classes
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        // Make the rabbit flee
        rabbit.flee();
        // Make the hawk hunt
        hawk.hunt();

        // Make the fish flee (assuming Fish class has a flee() method)
        fish.flee();
        // Make the fish hunt (assuming Fish class has a hunt() method)
        fish.hunt();
    }
}
