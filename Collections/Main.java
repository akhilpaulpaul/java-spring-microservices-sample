package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    static void main(String[] args) {
        Room room1 = new Room("Manchester", "Single AC Room", 2, 1500);
        Room room2 = new Room("London", "Single Non-AC Room", 1, 1100);
        double total = getRevenue(room1, room2);
        System.out.printf("The revenue is %.2f\n", total);

        Collection<String> c = new ArrayList<>();
        c.add("One");
        c.add("Two");
        c.add("One");

        Collection<Room> room = new ArrayList<>();
        room.add(room1);
        room.add(room2);
        room.stream().forEach(e -> System.out.print(e.getRate() + "\n"));

    }

    private static double getRevenue(Room room1, Room room2) {
        return room1.getRate() + room2.getRate();
    }
}
