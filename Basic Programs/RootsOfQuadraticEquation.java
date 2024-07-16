public class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        double a = 2.0, b = -7.0, c = 3.0; // Example coefficients

        // Calculate discriminant
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and distinct:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            // One real root (roots are equal)
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal:");
            System.out.println("Root = " + root);
        } else {
            // Imaginary or complex roots (not handled in this basic program)
            System.out.println("The equation has complex roots.");
        }
    }
}
