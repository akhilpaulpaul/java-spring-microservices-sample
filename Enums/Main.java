package Enums;

public class Main {
    static void main() {
        RoomTypes[] types = RoomTypes.values();

        for (RoomTypes type : types) {
            System.out.println(type + ": " + type.getPrice());
        }
//        switch (r) {
//            case SingleAc -> System.out.println("Single AC Room");
//            case DoubleAc -> System.out.println("Double AC Room");
//            default -> throw new IllegalStateException("Unexpected value: " + r);
//        }


    }
}
