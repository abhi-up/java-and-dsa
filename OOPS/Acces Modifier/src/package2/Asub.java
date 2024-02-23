package package2; // Declaring the package name

import package1.*; // Importing classes from package1

public class Asub extends A { // Declaring a public class named Asub, which extends class A

    public static void main(String[] args) { // Declaring the main method
        @SuppressWarnings("unused")
        C c = new C(); // Creating an object of class C

        // Attempting to access a default access modifier variable from class C,
        // which results in an error because it's only visible within package2
        // Error message: The field C.defaultMessage is not visible
        // System.out.println(c.defaultMessage);

        Asub asub = new Asub(); // Creating an object of class Asub

        System.out.println(asub.protectedMessage); // Accessing the protected access modifier variable from class A
                                                   // through inheritance
    }
}
