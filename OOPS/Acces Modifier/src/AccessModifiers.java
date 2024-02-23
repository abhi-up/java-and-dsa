/* This code defines a class named MyClass with four member variables (publicVar, protectedVar, defaultVar, privateVar) and four methods (publicMethod, protectedMethod, defaultMethod, privateMethod), each demonstrating the use of different access modifiers in Java. */

public class AccessModifiers {
    public int publicVar; // Accessible from anywhere
    protected int protectedVar; // Accessible within this package and by subclasses
    int defaultVar; // Accessible within this package
    @SuppressWarnings("unused")
    private int privateVar; // Accessible only within this class

    // Constructor
    public AccessModifiers() {
        // Inside the class, all access modifiers are accessible
        publicVar = 1;
        protectedVar = 2;
        defaultVar = 3;
        privateVar = 4;
    }

    // Methods
    public void publicMethod() {
        // Accessible from anywhere
    }

    protected void protectedMethod() {
        // Accessible within this package and by subclasses
    }

    void defaultMethod() {
        // Accessible within this package
    }

    @SuppressWarnings("unused")
    private void privateMethod() {
        // Accessible only within this class
    }
}
