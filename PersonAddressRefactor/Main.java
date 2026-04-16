package PersonAddressRefactor;

public class Main {
    static void main() {
        User emp = new Employee("Sam", 29, 12000);
        User student = new Student("Ben", 20, 5000);

        emp.introducePerson();
        student.introducePerson();
    }
}
