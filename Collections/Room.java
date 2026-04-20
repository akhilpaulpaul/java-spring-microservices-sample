package Collections;

public class Room {
    private String name;
    private String type;
    private int capacity;
    private double rate;

    public Room(String name, String type, int capacity, double rate) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.rate = rate;
    }

    public double getRate() {
        return this.rate;
    }
}
