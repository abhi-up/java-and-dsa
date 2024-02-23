public class Car {
    // Private variables to represent the state of the Car object
    private String model;
    private int year;
    private double price;

    // Public constructor to initialize the Car object
    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Getter methods to access the private variables
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods to modify the private variables
    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}