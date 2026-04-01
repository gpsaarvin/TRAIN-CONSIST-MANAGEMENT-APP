import java.util.*;
import java.util.stream.*;

// 🔹 Bogie Class
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

// 🔹 Main Class
public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Luxury Coach", 80));

        // 🔹 Display bogies
        System.out.println("\nBogies:");
        bogies.forEach(System.out::println);

        // 🔹 Calculate total capacity using Stream
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // 🔹 Display result
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nProgram continues...");
    }
}