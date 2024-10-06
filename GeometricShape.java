package oopj24cseb61;
import java.util.Scanner;
abstract class Shape {
	
	abstract void numberOfSides();
}
class Rectangle extends Shape {
	int sides;
	Rectangle(int sides) {
		this.sides = sides;
	}
	void numberOfSides() { 
		System.out.println("Shape with 4 sides:");
		System.out.println("I am the Rectangle. I have "+sides+" sides.");
		int sum = ((sides - 2)*180);
		System.out.println("Sum of Angles "+sum);				
	}
}
class Triangle extends Shape {
	int sides;
	Triangle(int sides) {
		this.sides = sides;
	}
	void numberOfSides() {
		System.out.println("Shape with 3 sides:");
		System.out.println("I am the Triangle. I have "+sides+" sides.");
		int sum = ((sides - 2)*180);
		System.out.println("Sum of Angles "+sum);	
	}
}
class Hexagon extends Shape {
	int sides;
	Hexagon(int sides){
		this.sides = sides;
	}
	void numberOfSides() {
		System.out.println("Shape with 6 sides:");
		System.out.println("I am the Hexagon. I have "+sides+" sides.");
		int sum = ((sides - 2)*180);
		System.out.println("Sum of Angles "+sum);	
	}
	
}
public class GeometricShape {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice;
		do {
			System.out.println("Enter the number of sides for the geometric shape:");
			int sides = sc.nextInt();
			if (sides == 4) {
				Rectangle r = new Rectangle(4);
				r.numberOfSides();
			}
			else if (sides == 3) {
				Triangle t = new Triangle(3);
				t.numberOfSides();
			}
			else if (sides == 6) {
				Hexagon h = new Hexagon(6);
				h.numberOfSides();
			}
			else {
				System.out.println("Shape with 5 sides is not supported");
			}
			sc.nextLine();
			System.out.println("Do you want to continue (yes/no):");
			choice = sc.nextLine();
		} while(choice.toLowerCase().equals("yes"));
		System.out.println("Exiting program.  Goodbye!");
		sc.close();
		
	}

}

