/*package cseb23s3Rollno61;
import java.util.Scanner;

public class ShapeAreaCalculator {

    // Method to calculate the area of a triangle
    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate the area of a rectangle
    public int calculateArea(int width, int length) {
        return width * length;
    }

    // Method to calculate the area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

 
    public double calculateArea(double side1, double side2, double height) {
        return 0.5 * (side1 + side2) * height;
    }

    public static void main(String[] args) {
        ShapeAreaCalculator calculator = new ShapeAreaCalculator();
        Scanner scanner = new Scanner(System.in);

        // Input and calculate area for triangle
        System.out.print("Enter the base of the Triangle: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter the height of the Triangle: ");
        double triangleHeight = scanner.nextDouble();
        double triangleArea = calculator.calculateArea(triangleBase, triangleHeight);
        System.out.println("Area of Triangle with base: " + triangleBase + " and height: " + triangleHeight + " is: " + triangleArea);

        // Input and calculate area for rectangle
        System.out.print("Enter the width of the Rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        System.out.print("Enter the length of the Rectangle: ");
        double rectangleLength = scanner.nextDouble();
        double rectangleArea = calculator.calculateArea(rectangleWidth, rectangleLength);
        System.out.println("Area of Rectangle with width: " + rectangleWidth + " and length: " + rectangleLength + " is: " + rectangleArea);

        // Input and calculate area for circle
        System.out.print("Enter the radius of the Circle: ");
        double circleRadius = scanner.nextDouble();
        double circleArea = calculator.calculateArea(circleRadius);
        System.out.println("Area of Circle with radius: " + circleRadius + " is: " + circleArea);

        // Input and calculate area for trapezium
        System.out.print("Enter the lengths of parallel sides and height of the Trapezium: ");
        double trapeziumSide1 = scanner.nextDouble();
        double trapeziumSide2 = scanner.nextDouble();
        double trapeziumHeight = scanner.nextDouble();
        double trapeziumArea = calculator.calculateArea(trapeziumSide1, trapeziumSide2, trapeziumHeight);
        System.out.println("Area of Trapezium is: " + trapeziumArea);
        scanner.close();
    }
}*/