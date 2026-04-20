package Enums;

public enum RoomTypes {
    SingleNonAc(800),
    SingleAc(1500),
    DoubleNonAc(1200),
    DoubleAc(1800),
    Suite(3000);

    private int price;

    RoomTypes(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
