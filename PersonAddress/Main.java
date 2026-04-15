package PersonAddress;

public class Main {
    static void main() {
        Address address = new Address("Wall Street", "Texas", 43455);
        Person person = new Person("Sam", 33, address);
        person.introduceUser();
    }
}
