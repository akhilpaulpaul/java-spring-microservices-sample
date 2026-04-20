package ConsoleProject;

import java.util.Scanner;

public class Main {
    void main() {
        EmployeeRepositoryInMemory repo = new EmployeeRepositoryInMemory();
        EmployeeService service = new EmployeeService(repo);

        repo.save(new Employee(1, "Sam", 26, 10000, Department.IT));
        repo.save(new Employee(2, "Michael", 27, 20000, Department.IT));
        repo.save(new Employee(3, "Lisha", 26, 14000, Department.IT));
        repo.save(new Employee(4, "Justin", 33, 50000, Department.HR));
        repo.save(new Employee(5, "Tisha", 46, 100000, Department.FINANCE));
        repo.save(new Employee(6, "Paul", 19, 9000, Department.FINANCE));

        System.out.println("--- Employee management system ---");
        System.out.println("""
        Choose from the below services:
        1. Show all employees
        2. Show employees greater than an age
        3. Show employees above a salary
        4. Show total payroll
        5. Remove an employee
        """);
        try(var scanner = new Scanner(System.in)) {
            int choice = scanner.nextInt();
            System.out.println("Choice - " + choice);

            switch (choice) {
                case 1 -> {
                    var employees = repo.findAll();
                    employees.forEach(System.out::println);
                }
                case 2 -> {
                    var employees = service.getByAgeRange(25);
                    employees.forEach(System.out::println);
                }
                case 3 -> {
                    var employees = service.getBySalary(30000);
                    employees.forEach(System.out::println);
                }
                case 4 -> {
                    var total = service.getTotalPayroll();
                    System.out.printf("Total payroll is %.2f", total);
                }
                case 5 -> {
                    repo.delete(2);
                    var employees = repo.findAll();
                    employees.forEach(System.out::println);
                }
            }
        }
    }
}
