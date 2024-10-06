/*This program is to implement Multilevel Inheritance
 * Written by Niya Justine
 * CSE B 
 * Roll no 61 */
package cseb23rollno61;
import java.util.Scanner;
class Vehicle {
	String model;
	int year;
}
class Car extends Vehicle {
	int numberOfDoors;
}
class ElectricCar extends Car {
	String batteryCapacity;
	void display() {
		System.out.print("\nModel :"+model);
		System.out.print("\nYear :"+year);
		System.out.print("\nNumber of Doors :"+numberOfDoors);
		System.out.print("\nBattery Capacity :"+batteryCapacity);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ElectricCar ec = new ElectricCar();
		
		System.out.print("Enter the details  of the car :");
		System.out.print("\nEnter the car model :");
		ec.model = sc.nextLine();
		System.out.print("Enter the year :");
		ec.year = sc.nextInt();
		System.out.print("\nEnter the number of Doors :");
		ec.numberOfDoors = sc.nextInt();
		System.out.print("\nEnter the battery capacity :");
		ec.batteryCapacity = sc.next();
		
		System.out.print("\nCAR DETAILS :");
		ec.display();
		sc.close();
	}
}
