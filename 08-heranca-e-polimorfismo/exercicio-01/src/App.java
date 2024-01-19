import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class App {

    public static void main(String[]args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int count = sc.nextInt();

        Employee[] employees = new Employee[count];
        
        for (int i = 0; i < count; i++) {
            System.out.println("Employee #" + (i + 1) + " data: ");
            System.out.print("Outsourced? (y/n): ");
            sc.nextLine();
            Character outsourced = sc.nextLine().charAt(0);

            System.out.print("Name: ");
            String employeeName = sc.nextLine();

            System.out.print("Hours: ");
            Integer employeeHours = sc.nextInt();

            System.out.print("Value P/ Hours: ");
            Double employeeValue = sc.nextDouble();

            if (outsourced == 'y') {
                System.out.print("Additional Charge: ");
                Double employeeAdditional = sc.nextDouble();
                employees[i] = new OutsourcedEmployee(employeeName, employeeHours, employeeValue, employeeAdditional);
            } else {
                employees[i] = new Employee(employeeName, employeeHours, employeeValue); 
            }

            System.out.println();
        }

        System.out.println("PAYMENTS: ");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
        }

        sc.close();

    }

}