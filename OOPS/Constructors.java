
public class Constructors {

    public static class Student {
        String name;
        int rno;
        double percent;
    }

    public static class Person {
        String name;
        int age;

        // Default Constructor: don't takes arguments & sets a default value
        Person() {
            // Assigning values to instance variables using 'this'
            this.name = "Abhishek Upadhyay";
            this.age = 22;
        }

        // Parameterized Constructor
        Person(String name, int age) {
            // Assigning values to instance variables using 'this'
            this.name = name;
            this.age = age;
        }

        // Method to display Person information
        void printDetails() {
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
        }
    }

    public static void main(String[] args) {
        // Creating Student object without using constructors
        Student s1 = new Student();

        // Initializing the instance attributes values
        s1.name = "Abhishek";
        s1.rno = 1;
        s1.percent = 92.55;

        System.out.println(s1); /*
                                 * Output: Constructors$Student@4f51b3e0
                                 * ✨ Constructors$Student: This refers to an inner class named Student that is
                                 * nested within another class named Constructors.
                                 * 
                                 * ✨ @: It is used as a separator between the object's class name and its unique
                                 * identifier.
                                 * 
                                 * ✨ 4f51b3e0: This is a hexadecimal identifier assigned by Java to distinguish
                                 * the specific object instance (s1) from other Student objects. It identifies
                                 * the object uniquely within the Java Virtual Machine (JVM) but does not
                                 * directly correspond to a physical memory address.
                                 */

        // Creating Person objects using different constructors
        Person p1 = new Person();
        Person p2 = new Person("Anubhav Verma", 21);

        // Displaying persons information
        p1.printDetails();
        p2.printDetails();
    }
}
