public class Car {
    // Instance variables to store make, model, and year of the car
    private String make;
    private String model;
    private int year;

    // Constructor to initialize make, model, and year of the car
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Copy constructor to create a new Car object from an existing one
    Car(Car x) {
        // First Method: Copying individual fields
        // this.make = x.make;
        // this.model = x.model;
        // this.year = x.year;

        // Second Method: Using the copy method
        this.copy(x);
    }

    // Getter method for retrieving the make of the car
    public String getMake() {
        return this.make;
    }

    // Getter method for retrieving the model of the car
    public String getModel() {
        return this.model;
    }

    // Getter method for retrieving the year of the car
    public int getYear() {
        return this.year;
    }

    // Setter method for updating the make of the car
    public void setMake(String make) {
        this.make = make;
    }

    // Setter method for updating the model of the car
    public void setModel(String model) {
        this.model = model;
    }

    // Setter method for updating the year of the car
    public void setYear(int year) {
        this.year = year;
    }

    // Method to copy the details of another Car object
    public void copy(Car x) {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}
