/*This program is to implement hierarchical Inheritance
 * Written by Niya Justine
 * CSE B
 * Roll no 61 */
package cseb23rollno61;
import java.util.Scanner;
class Employee1 {
	String name;
	int empid;
	String department;
	void employee() {
		System.out.print("\nName :"+name);
		System.out.print("\nEmployee ID :"+empid);
		System.out.print("\nDepartment :"+department);
	}	
} 
class FullTimeEmployee extends Employee1 {
	float annualSalary;
	void salary() {
		System.out.print("\nAnnual Salary :"+annualSalary);
	}
}
class PartTimeEmployee extends Employee1 {
	float hourlySalary;
	void salaryHour() {
		System.out.print("\nHourly Salary :"+hourlySalary);
	}
}
public class HierarchialInheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FullTimeEmployee obj = new FullTimeEmployee();
		PartTimeEmployee obj1 = new PartTimeEmployee();
		System.out.print("\nEnter the details of the Employee :");
		System.out.print("\nEnter name :");
		obj.name = sc.nextLine();
		System.out.print("\nEnter Employee ID :");
		obj.empid = sc.nextInt();
		sc.nextLine();
		System.out.print("\nEnter Department :");
		obj.department = sc.nextLine();
		System.out.print("\nEnter the Annual Salary :");
		obj.annualSalary = sc.nextFloat();
		System.out.print("\nEnter the salary per hour :");
		obj1.hourlySalary = sc.nextFloat();
		
		System.out.print("\nEMPLOYEE DETAILS :");
		obj.employee();
		obj.salary();
		obj1.salaryHour();
		
		sc.close();	
	}

}
