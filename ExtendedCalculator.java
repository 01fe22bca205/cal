public class ExtendedCalculator extends SimpleCalculator {
    public static void main(String[] args) {
        double a = 5;
        double b = 3;

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
        System.out.println("Square: " + square(a));
        System.out.println("Modulus: " + modulus(a, b));
        System.out.println("Cube Root: " + cubeRoot(a));
    }

    public static double square(double a) {
        return a * a;
    }

    public static double modulus(double a, double b) {
        return a % b;
    }

    public static double cubeRoot(double a) {
        return Math.cbrt(a);
    }
}
