/*This program is to manage employees in a company
 * Written by Niya Justine
 * CSE B
 * Roll no 61 */
package cseb23rollno61;
import java.util.Scanner;
abstract class Employee3 {
	String name;
	String type;	
	Employee3(String name, String type) {
		this.name = name;
		this.type = type;
	}
	abstract double calculateMonthlySalary();
	String getName() {
		return name;
	}
}
class FullTimeEmployee1 extends Employee3 {
	double salary;
	final double hra = 1000.0;
	FullTimeEmployee1(String name, double salary) {
		super(name, "FullTime");
		this.salary = salary;
	}
	double calculateMonthlySalary() {
		return salary + hra;
	}	
}
class PartTimeEmployee1 extends Employee3 {
	double hourlyWage;
	double hoursWorkedPerDay;
	final int workingDays = 25;
	PartTimeEmployee1(String name, double hourlyWage, int hoursWorkedPerDay) {
		super(name, "PartTime");
		this.hourlyWage = hourlyWage;
		this.hoursWorkedPerDay = hoursWorkedPerDay;
	}
	double calculateMonthlySalary() {
		return hourlyWage*hoursWorkedPerDay*workingDays;
	}
}
class Intern1 extends Employee3 {
	double stipend;
	Intern1(String name, double stipend) {
		super(name, "Intern");
		this.stipend = stipend;
	}
	double calculateMonthlySalary() {
		return stipend;
	}
}
public class EmployeeType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "";
		do {
			System.out.print("Enter employee's name: ");
			String name = sc.nextLine();
			System.out.print("Enter employee's job type(Full-time/Part-time/Intern): ");
			String type = sc.nextLine();
			Employee3 em = null;
			if (type.equalsIgnoreCase("FullTime")) {
				System.out.print("Enter the monthly Salary: ");
				double salary = sc.nextDouble();
				em = new FullTimeEmployee1(name, salary);
				sc.nextLine();
			}
			else if (type.equalsIgnoreCase("PartTime")) {
				System.out.print("Enter the hourly wage: ");
				double hourlyWage = sc.nextDouble();
				System.out.print("Enter the hours worked per day: ");
				int hoursWorkedPerDay = sc.nextInt();
				em = new PartTimeEmployee1(name, hourlyWage, hoursWorkedPerDay);
				sc.nextLine();
			}
			else if (type.equalsIgnoreCase("Intern")) {
				System.out.print("Enter the monthly stipend: ");
				double stipend = sc.nextDouble();
				em = new Intern1(name, stipend);
				sc.nextLine();
			}
			else {
				System.out.print("Invalid Employee type");
			}
			if (em != null) {
				System.out.println(em.getName()+"'s salary : Rs "+em.calculateMonthlySalary());
			}
			System.out.print("Do you want to continue (yes/no):");
			choice = sc.nextLine();
			
		} while (choice.equalsIgnoreCase("Yes"));
		System.out.println("Exiting...");
		sc.close();

	}

}
