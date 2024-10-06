/*package cseb23rollno61;
import java.util.Scanner;

abstract class Employee2 {
    protected String name;
    protected String type;

    // Constructor to initialize name and type
    public Employee2(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Abstract method to calculate the monthly salary
    public abstract double calculateMonthlySalary();

    // Method to get the name of the employee
    public String getName() {
        return name;
    }
}

class FullTimeEmployee2 extends Employee2 {
    private double salary;
    private static final double HRA = 1000.0; // Fixed HRA

    // Constructor to initialize name and salary
    public FullTimeEmployee2(String name, double salary) {
        super(name, "FullTime");
        this.salary = salary;
    }

    // Implementation of abstract method to calculate monthly salary
    @Override
    public double calculateMonthlySalary() {
        return salary + HRA; // Fixed salary + HRA
    }
}

class PartTimeEmployee2 extends Employee2 {
    private double hourlyWage;
    private int hoursWorkedPerDay;
    private static final int WORKING_DAYS = 25; // Fixed number of working days

    // Constructor to initialize name, hourlyWage, and hoursWorkedPerDay
    public PartTimeEmployee2(String name, double hourlyWage, int hoursWorkedPerDay) {
        super(name, "PartTime");
        this.hourlyWage = hourlyWage;
        this.hoursWorkedPerDay = hoursWorkedPerDay;
    }

    // Implementation of abstract method to calculate monthly salary
    @Override
    public double calculateMonthlySalary() {
        return hourlyWage * hoursWorkedPerDay * WORKING_DAYS;
    }
}

class Intern extends Employee2 {
    private double stipend;

    // Constructor to initialize name and stipend
    public Intern(String name, double stipend) {
        super(name, "Intern");
        this.stipend = stipend;
    }

    // Implementation of abstract method to calculate monthly salary
    @Override
    public double calculateMonthlySalary() {
        return stipend; // Fixed stipend
    }
}

public class MonthlySalaryCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueOption = ""; // Initialize continueOption with an empty string

        do {
            // Step 1: Ask for the employee's name
            System.out.print("Enter the employee's name: ");
            String employeeName = scanner.nextLine();

            // Step 2: Ask for the employee type
            System.out.print("Enter the employee type (FullTime/PartTime/Intern): ");
            String employeeType = scanner.nextLine();

            Employee2 employee = null;

            // Step 3: Collect further details based on the employee type
            if (employeeType.equalsIgnoreCase("FullTime")) {
                System.out.print("Enter the monthly salary: ");
                double salary = scanner.nextDouble();
                employee = new FullTimeEmployee2(employeeName, salary);

                // Clear the buffer
                scanner.nextLine();

            } else if (employeeType.equalsIgnoreCase("PartTime")) {
                System.out.print("Enter the hourly wage: ");
                double hourlyWage = scanner.nextDouble();
                System.out.print("Enter the hours worked per day: ");
                int hoursWorkedPerDay = scanner.nextInt();
                employee = new PartTimeEmployee2(employeeName, hourlyWage, hoursWorkedPerDay);

                // Clear the buffer
                scanner.nextLine();

            } else if (employeeType.equalsIgnoreCase("Intern")) {
                System.out.print("Enter the monthly stipend: ");
                double stipend = scanner.nextDouble();
                employee = new Intern(employeeName, stipend);

                // Clear the buffer
                scanner.nextLine();

            } else {
                System.out.println("Invalid employee type entered.");
                continue; // Skip to next iteration
            }

            // Print name and monthly salary
            if (employee != null) {
                System.out.println(employee.getName() + " (" + employeeType + "): $" + employee.calculateMonthlySalary());
            }

            // Ask the user if they want to continue
            System.out.print("Do you want to enter details for another employee? (yes/no): ");
            continueOption = scanner.nextLine();

        } while (continueOption.equalsIgnoreCase("yes"));

        // Closing the scanner to prevent resource leaks
        scanner.close();
    }
}*/
