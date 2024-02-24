// Define an enum called Level
enum Level {
    LOW,
    MEDIUM,
    HIGH
}

// Main class for executing the program
public class EnumClass {
    public static void main(String[] args) {
        // Initialize a variable of type Level
        Level myVar = Level.MEDIUM;

        // Switch statement to check the value of myVar
        switch (myVar) {
            // Case for LOW level
            case LOW:
                System.out.println("Low Level");
                break;
            // Case for MEDIUM level
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            // Case for HIGH level
            case HIGH:
                System.out.println("High Level");
                break;
        }
    }
}
