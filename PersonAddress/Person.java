package PersonAddress;

public class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.name = (name == null || name.isEmpty()) ? "Unknown" : name;
        this.age = age;
        this.address = address;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public Address getAddress() {
        return address;
    }

    public void introduceUser() {
        System.out.printf("Hi, I am %s. My age is %d. I live at %s.%n", this.getName(), this.getAge(), this.getAddress());
    }
}
