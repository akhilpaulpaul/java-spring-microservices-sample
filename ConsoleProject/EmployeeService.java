package ConsoleProject;

import java.util.List;

public class EmployeeService {
    private EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public List<Employee> getByDepartment(Department dept) {
        return repo.findAll()
                .stream()
                .filter(e -> e.getDepartment() == dept)
                .toList();
    }

    public List<Employee> getBySalary(double salary) {
        return repo.findAll()
                .stream()
                .filter(e -> e.getSalary() > salary)
                .toList();
    }

    public List<Employee> getByAgeRange(int age) {
        return repo.findAll()
                .stream()
                .filter(e -> e.getAge() > age)
                .toList();
    }

    public double getTotalPayroll() {
        return repo.findAll()
                .stream()
                .mapToDouble(Employee::getSalary)
                .sum();
    }
}
