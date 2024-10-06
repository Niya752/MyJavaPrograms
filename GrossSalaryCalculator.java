package oopj24cseb61;
import java.util.Scanner;
class Employee2 {
	float salary;
	float da;
	float hra;
	float gross;
	Employee2(float salary, float da, float hra) {
		this.salary = salary;
		this.da = da;
		this.hra = hra;
	}
	void display() {
		System.out.println("....Employee....");
	}
	void calcSalary() {
		gross = salary + ((da/100)*salary)+((hra/100)*salary);
		System.out.println("The gross salary of the employee is "+gross);
	}
	
}
class Engineer extends Employee2 {
	float salary;
	float da;
	float hra;
	Engineer(float salary, float da, float hra){
		super(salary,da,hra);
	}
	void display() {
		super.display();
		super.calcSalary();
		System.out.println("....Engineer....");
	}
	
	void calcSalary() {
		System.out.println("The gross salary of the engineer is "+(2*gross));
	}
	
}

public class GrossSalaryCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.print("\nEnter the basic salary of the employee:");
		float salary = sc.nextFloat();
		System.out.print("Enter the DA % of the employee:");
		float da = sc.nextFloat();
		System.out.print("Enter the HRA % of the employee:");
		float hra = sc.nextFloat();
	    Engineer en = new Engineer(salary,da,hra);

		en.display();
		en.calcSalary();	
	}
}
