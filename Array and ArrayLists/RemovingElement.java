
public class RemovingElement { // Class for linear search operations
    public static class MyArray { // Nested class to represent a custom array
        int[] array; // Array to hold the elements
        int currentIndex; // Index to keep track of the current position for insertion

        // Constructor to initialize the array with a given size
        MyArray(int index) {
            this.array = new int[index]; // Initialize the array with the given size
            this.currentIndex = 0; // Initialize currentIndex to 0
        }

        // Method to insert an element into the array
        public void insert(int val) {
            if (currentIndex < array.length) { // Check if there is space available in the array
                this.array[currentIndex] = val; // Insert the value at the current index
                currentIndex++; // Increment the currentIndex for the next insertion
            } else {
                System.out.println("Array is full. Cannot insert more elements.");
            }
        }

        // Method to convert the array to a string for printing
        public String toString() {
            StringBuilder str = new StringBuilder(); // Create a StringBuilder to build the string representation
            str.append("[ "); // Add opening bracket for the array
            for (int i = 0; i < this.currentIndex; i++) { // Iterate up to the current index to include only inserted
                // elements
                str.append(this.array[i]); // Append the current element to the string
                if (i < this.currentIndex - 1) { // Check if the current element is not the last one
                    str.append(", "); // Add comma and space if it's not the last element
                }
            }
            str.append(" ]"); // Add closing bracket for the array
            return str.toString(); // Return the string representation of the array
        }

        // Method to find the index of a specified value in the array
        public int indexOf(int value) {
            for (int i = 0; i < this.currentIndex; i++) { // Iterate through the array
                if (this.array[i] == value) { // If the value is found
                    return i; // Return the index of the value
                }
            }
            return -1; // If the value is not found, return -1
        }

        public void delete(int index) {
            if (index >= this.currentIndex) {
                throw new IllegalArgumentException();
            }
            for (int i = index; i < this.currentIndex - 1; i++) {
                this.array[i] = this.array[i + 1];
            }
            currentIndex--;
            this.array[this.currentIndex] = 0;
        }

    }

    public static void main(String[] args) {
        MyArray arr = new MyArray(5); // Create an instance of MyArray with initial size 5

        // Insert elements into the array
        arr.insert(5);
        arr.insert(3);
        arr.insert(9);
        arr.insert(7);
        arr.insert(1);

        // Search for an element and print its index
        System.out.println("The index of the searched element is: " + arr.indexOf(1));

        arr.delete(2);
        System.out.println(arr); // Print the array
    }
}
