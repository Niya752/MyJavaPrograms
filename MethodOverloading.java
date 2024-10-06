package oopj24cseb61;
import java.util.Scanner;
public class MethodOverloading {
	public double Area(double base, double height) {
		return 0.5 * base * height;
	}
	public int Area(int length,int breadth) {
		return length * breadth;
	}
	public double Area(double radius) {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		MethodOverloading obj = new MethodOverloading();
		
		System.out.println("Enter the base of the triangle :");
		double baseTriangle = sc.nextDouble();
		System.out.println("Enter the height of the triangle :");
	    double heightTriangle = sc.nextDouble();
		
		System.out.println("Enter the length of the rectangle :");
		int widthRectangle = sc.nextInt();
		System.out.println("Enter the breadth of the rectangle :");
		int heightRectangle = sc.nextInt();
		
		System.out.println("Enter the radius of the circle :");
		double circleRadius = sc.nextDouble();
		
		double triangleResult = obj.Area(baseTriangle, heightTriangle);
		System.out.println("The area of triangle with base "+baseTriangle+" and height "+heightTriangle+" is :"+triangleResult);
		
		int rectangleResult = obj.Area(widthRectangle,heightRectangle);
		System.out.println("The area of rectangle with length "+widthRectangle+" and breadth "+heightRectangle+" is :"+rectangleResult);
		
		double circleResult = obj.Area(circleRadius);
		System.out.println("The area of circle with radius "+circleRadius+" is :"+circleResult);			
	}
}
