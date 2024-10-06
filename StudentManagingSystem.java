/*This program is to implement Inheritance and Abstract class in Java
 * Written by Niya Justine
 * CSE B
 * Roll no 61 */
package cseb23rollno61;
import java.util.Scanner;
abstract class Student {
	String name;
	int rollNo;
	String course;
	Student(String name, int rollNo, String course) {
		this.name = name;
		this.rollNo = rollNo;
		this.course = course;
	}
	abstract void display();
}
class Hostler extends Student {
	String hostelName;
	Hostler(String name, int rollNo, String course, String hostelName) {
		super(name, rollNo, course);
		this.hostelName = hostelName;
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll number: "+rollNo);
		System.out.println("Course: "+course);
		System.out.println("Hostel Name: "+hostelName);
	}
}
class Dayscholar extends Student {
	String busRoute;
	Dayscholar(String name, int rollNo, String course, String busRoute) {
		super(name, rollNo, course);
		this.busRoute = busRoute;
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll number: "+rollNo);
		System.out.println("Course: "+course);
		System.out.println("Bus Route: "+busRoute);
	}
}
public class StudentManagingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name:");
		String name = sc.nextLine();
		System.out.println("Enter Roll Number:");
		int rollNo = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Course:");
		String course = sc.nextLine();
		
		System.out.println("Enter type of Student (Hostler/Dayscholar):");
		String studentType = sc.nextLine();
		
		Student st;
		
		if (studentType.equalsIgnoreCase("Hostler")) {
			System.out.println("Enter Hostel Name:");
			String hostelName = sc.nextLine();
			st = new Hostler(name, rollNo, course, hostelName);
		} else if (studentType.equalsIgnoreCase("Dayscholar")) {
			System.out.println("Enter Bus Route:");
			String busRoute = sc.nextLine();
			st = new Dayscholar(name, rollNo, course, busRoute);		
	} else {
		System.out.println("Invalid Student type");
		sc.close();
		return;
	}
		System.out.println("\nStudent Details:");
		st.display();
		sc.close();

   }
}
