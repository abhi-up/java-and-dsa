// Define a public class named ArrayOfObjects
public class ArrayOfObjects {

    // Define a static inner class called Food to represent food items
    public static class Food {

        // String variable to store the name of the food
        String name;

        // Constructor that initializes the name of the food
        Food(String food) {
            this.name = food;
        }

        // Method to simulate eating the food, returning a descriptive string
        public String eat() {
            return "eat " + this.name;
        }
    }

    // Main method where program execution begins
    public static void main(String[] args) {

        // Create an array of Food objects with a capacity of 3
        Food[] refrigerator1 = new Food[3];

        // Create individual Food objects with specific names
        Food food1 = new Food("pizza");
        Food food2 = new Food("hotdog");
        Food food3 = new Food("hamburger");

        // Create another array of Food objects using an initializer list
        Food[] refrigerator2 = { food1, food2, food3 };

        // Assign the Food objects to the array elements
        refrigerator1[0] = food1;
        refrigerator1[1] = food2;
        refrigerator1[2] = food3;

        // Print the name of the first food in refrigerator1
        System.out.println(refrigerator1[0].name);

        // Call the eat() method on the second food in refrigerator1 and print the
        // result
        System.out.println(refrigerator1[1].eat());

        // Print the name of the second food in refrigerator2
        System.out.println(refrigerator2[1].name);

        // Call the eat() method on the first food in refrigerator2 and print the result
        System.out.println(refrigerator2[0].eat());

    }

}
