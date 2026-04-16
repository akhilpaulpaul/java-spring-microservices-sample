package PersonAddressRefactor;

public class Employee extends Person {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void introducePerson() {
        System.out.printf("I am %s and I am %d years old. My current salary is %.2f\n", getName(), getAge(), this.salary);
    }
}
