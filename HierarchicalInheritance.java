package oopj24cseb61;
import java.util.Scanner;
class Employee {
	String name = new String();
	int age;
	long phoneno;
	String address;
	int salary;
	void printSalary() {
		System.out.println("\nSalary :"+salary);
	}
	void printEmployee() {
		System.out.print("\nName :"+name+"\nAge :"+age+"\nAddress :"+address+"\nPhone no :"+phoneno);
	}
	
}
// Manager is the derived class of base class employee
class Manager extends Employee {
	String department = new String();
	void printDepartment() {
		System.out.print("\nDepartment :"+department);
	}
}
// officer is the derived class of base class Employee
class Officer extends Employee {
	String specialisation = new String();
	void printSpecialisation() {
		System.out.print("\nSpecialisation :"+specialisation);
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// creating object of Manager class
		Manager mng = new Manager();
		// creating object of Officer class
		Officer of = new Officer();
		
		// Entering the details of the manager
		System.out.print("\nEnter the Manager's name :");
		mng.name = sc.nextLine();
		System.out.print("\nEnter address :");
		mng.address = sc.nextLine();
		System.out.print("\nEnter Department :");
		mng.department = sc.nextLine();
		System.out.print("\nEnter age :");
		mng.age = sc.nextInt();
		System.out.print("\nEnter Phone no :");
		mng.phoneno = sc.nextLong();
		System.out.print("\nEnter salary :");
		mng.salary = sc.nextInt();
			
        // entering the details of the officer
		sc.nextLine();
		System.out.print("\nEnter the Officer's name :");
		of.name = sc.nextLine();
		System.out.print("\nEnter address :");
		of.address = sc.nextLine();
		System.out.print("\nEnter specialisation :");
		of.specialisation = sc.nextLine();
		System.out.print("\nEnter age :");
		of.age = sc.nextInt();
		System.out.print("\nEnter Phone no :");
		of.phoneno = sc.nextLong();
		System.out.print("\nEnter salary :");
		of.salary = sc.nextInt();
	    
		// displaying the details of the officer
		System.out.print("\nOFFICER DETAIL :");
		of.printEmployee();
		of.printSpecialisation();
		of.printSalary();
		
		// displaying the details of the manager
		System.out.print("\nMANAGER DETAILS :");
		mng.printEmployee();
		mng.printDepartment();
		mng.printSalary();						
	}
}
