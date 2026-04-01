import java.util.*;

// ===== Bogie Class (for UC7) =====
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " -> " + capacity;
    }
}

// ===== MAIN CLASS =====
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

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + passengerBogies.contains("Sleeper"));

        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...\n");


        // ================= UC3 =================
        System.out.println("===================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("===================================\n");

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG104");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIds);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...\n");


        // ================= UC4 =================
        System.out.println("===================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("===================================\n");

        LinkedList<String> trainConsistLL = new LinkedList<>();

        trainConsistLL.add("Engine");
        trainConsistLL.add("Sleeper");
        trainConsistLL.add("AC");
        trainConsistLL.add("Cargo");
        trainConsistLL.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsistLL);

        trainConsistLL.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car':");
        System.out.println(trainConsistLL);

        trainConsistLL.removeFirst();
        trainConsistLL.removeLast();

        System.out.println("\nAfter Removing First and Last:");
        System.out.println(trainConsistLL);

        System.out.println("\nUC4 operations completed...\n");


        // ================= UC5 =================
        System.out.println("===================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("===================================\n");

        LinkedHashSet<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper"); // duplicate

        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves order and removes duplicates.");

        System.out.println("\nUC5 completed...\n");


        // ================= UC6 =================
        System.out.println("===================================");
        System.out.println("UC6 - Map Bogie to Capacity");
        System.out.println("===================================\n");

        HashMap<String, Integer> capacityMap = new HashMap<>();

        capacityMap.put("First Class", 24);
        capacityMap.put("AC Chair", 56);
        capacityMap.put("Sleeper", 72);
        capacityMap.put("Cargo", 120);

        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 mapping completed...\n");


        // ================= UC7 =================
        System.out.println("===================================");
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("===================================\n");

        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("General", 90));

        System.out.println("Before Sorting:");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        System.out.println("\nUC7 sorting completed...");
    }
}