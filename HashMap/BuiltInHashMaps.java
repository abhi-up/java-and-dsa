import java.util.HashMap;
import java.util.Map;

public class BuiltInHashMaps {
    public static void main(String[] args) {
        // Creating a HashMap object with Integer keys and String values
        Map<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put(1, "Abhishek");
        map.put(7, "Dhoni");
        map.put(45, "Rohit");
        map.put(18, "Virat");

        // Printing the HashMap contents
        System.out.println(map); // {1=Abhishek, 18=Virat, 7=Dhoni, 45=Rohit}

        // Retrieving value associated with key 18
        System.out.println(map.get(18)); // Virat

        // Retrieving value associated with key 2 (which doesn't exist)
        System.out.println(map.get(2)); // null: as we don't have any key with value 2

        // Checking if key 5 exists in the HashMap
        System.out.println(map.containsKey(5)); // false: returns a boolean value if key is present

        // Checking if the HashMap is empty
        System.out.println(map.isEmpty()); // false

        // Getting the size of the HashMap
        System.out.println(map.size()); // 4

        // Removing the key-value pair associated with key 45
        System.out.println(map.remove(45)); // Rohit

        // Printing the HashMap after removing the key-value pair
        System.out.println(map); // {1=Abhishek, 18=Virat, 7=Dhoni}

        // Printing the set of keys in the HashMap
        System.out.println(map.keySet());

        // Printing the collection of values in the HashMap
        System.out.println(map.values());
    }
}
