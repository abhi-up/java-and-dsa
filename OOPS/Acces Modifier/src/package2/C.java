package package2; // Declaring the package name

import package1.*; // Importing classes from package1

@SuppressWarnings("unused")
public class C { // Declaring a public class named C

    String defaultMessage = "This is the default"; // Declaring a default access modifier variable

    public String publicMessage = "This is public"; // Declaring a public access modifier variable

    protected String protectedMessage = "This is protected"; // Declaring a protected access modifier variable

    private String privateMessage = "This is private"; // Declaring a private access modifier variable
}
