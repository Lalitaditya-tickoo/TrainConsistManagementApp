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
        // ================= UC4 =================
        System.out.println("\n===================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("===================================\n");

        // Create LinkedList (maintains order)
        LinkedList<String> trainConsistLL = new LinkedList<>();

        // ADD bogies
        trainConsistLL.add("Engine");
        trainConsistLL.add("Sleeper");
        trainConsistLL.add("AC");
        trainConsistLL.add("Cargo");
        trainConsistLL.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsistLL);

        // INSERT at position 2 (index 2)
        trainConsistLL.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsistLL);

        // REMOVE first and last
        trainConsistLL.removeFirst();
        trainConsistLL.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsistLL);

        System.out.println("\nUC4 ordered consist operations completed...");
        // ================= UC5 =================
        System.out.println("\n===================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("===================================\n");

        // LinkedHashSet (order + no duplicates)
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // ADD bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // ADD duplicate intentionally
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // DISPLAY final formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
        // ================= UC6 =================
        System.out.println("\n===================================");
        System.out.println("UC6 - Map Bogie to Capacity");
        System.out.println("===================================\n");

        // Create HashMap (key = bogie, value = capacity)
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // ADD data
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("Cargo", 120);

        // DISPLAY using entrySet()
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}