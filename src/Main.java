import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // 🔹 Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 🔹 Attempt to add duplicate
        trainFormation.add("Sleeper"); // duplicate

        // 🔹 Display final formation
        System.out.println("\nFinal Train Formation (Ordered & Unique):");
        System.out.println(trainFormation);

        System.out.println("\nNote: Duplicate bogies are not added, and order is preserved.");

        System.out.println("\nProgram continues...");
    }
}