package cseb23s3Rollno61;
//Base class: Shape
class Shape {
 protected int length;
 protected int breadth;

 // Constructor
 public Shape(int length, int breadth) {
     this.length = length;
     this.breadth = breadth;
 }

 // Method to display the values of length and breadth
 public void show() {
     System.out.println("Length: " + length);
     System.out.println("Breadth: " + breadth);
 }
}

//Subclass: Rectangle
class Rectangle extends Shape {

 // Constructor
 public Rectangle(int length, int breadth) {
     super(length, breadth);
 }

 // Method to calculate the perimeter of the rectangle
 public int getPerimeter() {
     return 2 * (length + breadth);
 }

 // Method to calculate the area of the rectangle
 public int getArea() {
     return length * breadth;
 }

 // Method to display the properties of the rectangle
 public void showRectangle() {
     System.out.println("Rectangle");
     show();
     System.out.println("Perimeter: " + getPerimeter());
     System.out.println("Area: " + getArea());
     System.out.println();
 }
}

//Subclass: Square
class Square extends Shape {

 // Constructor
 public Square(int side) {
     super(side, side); // Since length and breadth are the same for a square
 }

 // Method to calculate the perimeter of the square
 public int getPerimeter() {
     return 4 * length;
 }

 // Method to calculate the area of the square
 public int getArea() {
     return length * length;
 }

 // Method to display the properties of the square
 public void showSquare() {
     System.out.println("Square");
     show();
     System.out.println("Perimeter: " + getPerimeter());
     System.out.println("Area: " + getArea());
     System.out.println();
 }
}

//Main class to test the program
public class ClassHw {
 public static void main(String[] args) {
     // Creating a Rectangle object
     Rectangle rectangle = new Rectangle(5, 3);
     rectangle.showRectangle();

     // Creating a Square object
     Square square = new Square(4);
     square.showSquare();
 }
}