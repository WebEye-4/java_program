import java.util.Scanner;

class Employee {
    private String empId;
    private String name;
    private double hoursWorked;
    private double hourlyRate;

    public Employee(String empId, String name, double hoursWorked, double hourlyRate) {
        this.empId = empId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class Salary_of_employee{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee ID: ");
            String empId = scanner.nextLine();
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter hours worked by " + name + ": ");
            double hoursWorked = scanner.nextDouble();
            System.out.print("Enter hourly rate for " + name + ": ");
            double hourlyRate = scanner.nextDouble();
            scanner.nextLine(); // consume newline character

            employees[i] = new Employee(empId, name, hoursWorked, hourlyRate);
        }

        System.out.println("\nSalary Details:");
        for (Employee emp : employees) {
            double salary = emp.calculateSalary();
            System.out.printf("Employee ID: %s, Name: %s, Salary: $%.2f%n", emp.getEmpId(), emp.getName(), salary);
        }
    }
}