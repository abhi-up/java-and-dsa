import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do u want?");
        System.out.print("( 1=dog ) or ( 2=cat ): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                animal = new Dog();
                break;
            case 2:
                animal = new Cat();
                break;
            default:
                animal = new Animal();
                System.out.println("Choice was invalid.");
                break;
        }
        animal.speak();

        scanner.close();

    }
}
