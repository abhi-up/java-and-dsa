import java.util.Random;
import java.util.Scanner;

public class RandomArrayGenerate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        sc.close();

        int[] array = generateRandomArray(size); // Generating a random array
        printArray(array); // Printing the generated array
    }

    // Method to generate a random array of given size
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Generates random integers between 0 and 99
        }
        return array;
    }

    // Method to print the array
    private static void printArray(int[] array) {
        System.out.println("Generated Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
