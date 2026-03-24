import java.util.LinkedList;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // 🔹 Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // 🔹 Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry");

        // 🔹 Display after insertion
        System.out.println("\nTrain Consist after adding Pantry:");
        System.out.println(trainConsist);

        // 🔹 Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // 🔹 Final consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nProgram continues...");
    }
}