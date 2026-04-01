import java.util.*;

/**
 * UC7: Sort Bogies by Capacity using Comparator
 * Demonstrates custom sorting of objects.
 */

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " → Capacity: " + capacity;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // 🔹 Before sorting
        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 🔹 Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // 🔹 After sorting
        System.out.println("\nAfter Sorting (Ascending by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nProgram continues...");
    }
}