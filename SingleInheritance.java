/*This program is to show Single Inheritance
 * Written by Niya Justine
 * CSE B S3
 * Roll no 61*/
package cseb23rollno61;
import java.util.Scanner;
class Employee {
	String name;
	int empid;
	void display() {
		System.out.print("Name :"+name);
		System.out.print("\nEmployee ID :"+empid);
	}
}
class Manager extends Employee {
	String department;
	void Department() {
		System.out.print("\nDepartment :"+department+"\n");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee em = new Employee();
		Manager mng = new Manager();
		
		System.out.print("\nEnter the details of the Employee :");
		System.out.print("\nEnter Employee's name :");
		em.name = sc.nextLine();
		System.out.print("\nEnter Employee's ID :");
		em.empid = sc.nextInt();
		
		sc.nextLine();
		System.out.print("\nEnter the details of the Manager :");
		System.out.print("\nEnter Manager's name :");
		mng.name = sc.nextLine();
		System.out.print("\nEnter Manager's ID :");
		mng.empid = sc.nextInt();
		sc.nextLine();
		System.out.print("\nEnter department :");
		mng.department = sc.nextLine();
		
		System.out.print("\nMANAGER'S DETAILS :\n");
		mng.display();
		mng.Department();
		
		System.out.print("\nEMPLOYEE'S DETAILS :\n");
		em.display();
		
		sc.close();
	}

}
