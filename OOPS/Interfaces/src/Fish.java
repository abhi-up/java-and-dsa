// Define the Fish class implementing Prey and Predator interfaces
public class Fish implements Prey, Predator {

    // Method to describe how the fish hunts
    @Override
    public void hunt() {
        System.out.println("This fish is hunting smaller fishes.");
    }

    // Method to describe how the fish flees
    @Override
    public void flee() {
        System.out.println("This fish is fleeing from a larger fish.");
    }

}
