public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = { car, bicycle, boat };

        for (Vehicle x : racers) {
            x.go();
        }
    }
}
