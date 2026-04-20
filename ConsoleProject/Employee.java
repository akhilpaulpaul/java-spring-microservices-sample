package ConsoleProject;

public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private Department department;

    public Employee(int id, String name, int age, double salary, Department department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public Department getDepartment() {
        return this.department;
    }

    @Override
    public String toString() {
        return "Employee { " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department=" + department.getDisplayName() +
                " " +
                '}';
    }
}
