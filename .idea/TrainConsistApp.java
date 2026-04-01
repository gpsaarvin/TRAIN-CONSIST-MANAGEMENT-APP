import java.util.regex.*;
import java.util.Scanner;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        Scanner scanner = new Scanner(System.in);

        // 🔹 Input from user
        System.out.print("\nEnter Train ID: ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = scanner.nextLine();

        // 🔹 Regex Patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // 🔹 Compile patterns
        Pattern trainRegex = Pattern.compile(trainPattern);
        Pattern cargoRegex = Pattern.compile(cargoPattern);

        // 🔹 Match inputs
        Matcher trainMatcher = trainRegex.matcher(trainId);
        Matcher cargoMatcher = cargoRegex.matcher(cargoCode);

        // 🔹 Validate Train ID
        if (trainMatcher.matches()) {
            System.out.println("\nTrain ID is VALID ✅");
        } else {
            System.out.println("\nTrain ID is INVALID ❌");
        }

        // 🔹 Validate Cargo Code
        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is VALID ✅");
        } else {
            System.out.println("Cargo Code is INVALID ❌");
        }

        System.out.println("\nProgram continues...");
    }
}