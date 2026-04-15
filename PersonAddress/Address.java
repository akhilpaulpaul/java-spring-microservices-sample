package PersonAddress;

public class Address {
    private String street;
    private String city;
    private int postalCode;

    public Address(String street, String city, int postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return this.street + ", " + this.city + ", " + this.postalCode;
    }
}
