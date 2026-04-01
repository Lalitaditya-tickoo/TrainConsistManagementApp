import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // ================= UC1 =================
        System.out.println("===================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("===================================\n");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);

        System.out.println("\nSystem ready for operations...\n");


        // ================= UC2 =================
        System.out.println("===================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("===================================\n");

        List<String> passengerBogies = new ArrayList<>();

        // ADD
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // REMOVE
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // CHECK
        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + passengerBogies.contains("Sleeper"));

        // FINAL
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...\n");


        // ================= UC3 =================
        System.out.println("===================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("===================================\n");

        // HashSet (no duplicates)
        Set<String> bogieIds = new HashSet<>();

        // ADD (with duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG104");

        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // DISPLAY
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIds);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}