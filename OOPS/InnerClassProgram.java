// Define the OuterClass
class OuterClass {
    // Instance variable x
    int x = 10;

    // InnerClass within OuterClass
    class InnerClass {
        // Inner class instance variable y
        int y = 5;
    }

    // PrivateInnerClass within OuterClass
    class PrivateInnerClass {
        // Inner class instance variable y
        int y = 15;
    }

    // StaticInnerClass within OuterClass
    static class StaticInnerClass {
        // Static inner class instance variable y
        int y = 20;
    }
}

// Main class for executing the program
public class InnerClassProgram {
    public static void main(String[] args) {
        // Create an instance of OuterClass
        OuterClass myOuter = new OuterClass();

        // Create an instance of InnerClass using myOuter instance
        OuterClass.InnerClass myInner = myOuter.new InnerClass();

        // Create an instance of PrivateInnerClass using myOuter instance
        OuterClass.PrivateInnerClass myPrivateInner = myOuter.new PrivateInnerClass();

        // Create an instance of StaticInnerClass directly
        OuterClass.StaticInnerClass myStaticInner = new OuterClass.StaticInnerClass();

        // Print the sum of instance variable y of InnerClass and instance variable x of
        // OuterClass
        System.out.println(myInner.y + myOuter.x);

        // Print the sum of instance variable y of PrivateInnerClass and instance
        // variable x of OuterClass
        System.out.println(myPrivateInner.y + myOuter.x);

        // Print the sum of instance variable y of StaticInnerClass and instance
        // variable x of OuterClass
        System.out.println(myStaticInner.y + myOuter.x);
    }
}
