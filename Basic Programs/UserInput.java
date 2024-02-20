
// Imported Scanner class
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        // Prompt the user to enter their age
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        // Prompt the user to enter their salary
        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();

        // Prompt the user to verify their account by answering a question
        System.out.println("Verify your account:");
        System.out.println("Enter 'T' for True or 'F' for False: Is a cat an animal?");
        char ans = sc.next().charAt(0);

        // Check the user's answer and provide appropriate feedback
        if (ans == 'T') {
            System.out.println("Logged In");
            System.out.println("Your name is: " + name);
            System.out.println("Your age is: " + age);
            System.out.println("Your salary is: " + salary);
        } else if (ans == 'F') {
            System.out.println("Login Failed!");
        } else {
            System.out.println("You chose a wrong character as your answer.");
        }

        // Close the Scanner object to release resources
        sc.close();
    }
}
