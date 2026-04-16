package PersonAddressRefactor;

public class Student extends Person{
    private double salary;

    public Student(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void introducePerson() {
        System.out.printf("I am %s and I am %d years old. My current salary is %.2f\n", getName(), getAge(), this.salary);
    }
}
