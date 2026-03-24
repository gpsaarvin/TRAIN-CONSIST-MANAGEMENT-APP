import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty list for bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train consist initialized successfully.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // Program continues...
        System.out.println("Ready to add bogies in next use cases...");
    }
}