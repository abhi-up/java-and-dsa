
public class StringComparison {
    public static void main(String[] args) {
        // difference reference variables pointing to the same object in memory
        String str1 = "Abhishek";
        String str2 = "Abhishek";

        System.out.println(str1 == str2); // This will return to true

        // difference reference variables pointing to the different object in memory
        String str3 = new String("Upadhyay");
        String str4 = new String("Upadhyay");

        System.out.println(str3 == str4); // This will return to false

    }

}