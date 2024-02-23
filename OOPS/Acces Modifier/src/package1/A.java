package package1; // Declaring the package name

import package2.*; // Importing classes from package2

public class A { // Declaring a public class named A

    protected String protectedMessage = "This is protected"; // Declaring a protected string variable

    public static void main(String[] args) { // Declaring the main method
        C c = new C(); // Creating an object of class C

        // Attempting to access a default access modifier variable from class C,
        // which results in an error because it's only visible within package2
        // Error message: The field C.defaultMessage is not visible
        // System.out.println(c.defaultMessage);

        System.out.println(c.publicMessage); // Accessing the public access modifier variable from class C

        @SuppressWarnings("unused")
        B b = new B(); // Creating an object of class B

        // Error: The field B.privateMessage is not visible
        // Attempting to access a private access modifier variable from class B,
        // which results in an error because it's only visible within class B
        // System.out.println(b.privateMessage);
    }
}
