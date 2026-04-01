import java.util.*;
import java.util.stream.*;
import java.util.regex.*;

// ===== Bogie Class (UC7–UC10) =====
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

// ===== Goods Bogie Class (UC12) =====
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return type + " -> " + cargo;
    }
}

// ===== MAIN CLASS =====
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // ================= UC1 =================
        System.out.println("=== Train Consist Management App ===");
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // ================= UC2 =================
        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");
        passengerBogies.remove("AC Chair");
        System.out.println("\nUC2 Passenger Bogies: " + passengerBogies);

        // ================= UC3 =================
        Set<String> bogieIds = new HashSet<>();
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101");
        System.out.println("\nUC3 Unique IDs: " + bogieIds);

        // ================= UC4 =================
        LinkedList<String> trainLL = new LinkedList<>();
        trainLL.add("Engine");
        trainLL.add("Sleeper");
        trainLL.add("AC");
        trainLL.add("Cargo");
        trainLL.add("Guard");
        trainLL.add(2, "Pantry Car");
        trainLL.removeFirst();
        trainLL.removeLast();
        System.out.println("\nUC4 Ordered Consist: " + trainLL);

        // ================= UC5 =================
        LinkedHashSet<String> formation = new LinkedHashSet<>();
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");
        System.out.println("\nUC5 Formation: " + formation);

        // ================= UC6 =================
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Sleeper", 72);
        map.put("AC Chair", 56);
        map.put("First Class", 24);
        System.out.println("\nUC6 Capacity Map:");
        map.forEach((k, v) -> System.out.println(k + " -> " + v));

        // ================= UC7 =================
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("General", 90));

        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nUC7 Sorted Bogies:");
        bogieList.forEach(System.out::println);

        // ================= UC8 =================
        List<Bogie> filtered = bogieList.stream()
                .filter(b -> b.capacity > 60)
                .toList();

        System.out.println("\nUC8 Filtered (>60):");
        filtered.forEach(System.out::println);

        // ================= UC9 =================
        Map<String, List<Bogie>> grouped =
                bogieList.stream().collect(Collectors.groupingBy(b -> b.name));

        System.out.println("\nUC9 Grouped:");
        grouped.forEach((k, v) -> System.out.println(k + " -> " + v));

        // ================= UC10 =================
        int total = bogieList.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("\nUC10 Total Capacity: " + total);

        // ================= UC11 =================
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        boolean trainValid = Pattern.matches("TRN-\\d{4}", trainId);
        boolean cargoValid = Pattern.matches("PET-[A-Z]{2}", cargoCode);

        System.out.println("\nUC11 Validation:");
        System.out.println(trainId + " -> " + trainValid);
        System.out.println(cargoCode + " -> " + cargoValid);

        // ================= UC12 =================
        List<GoodsBogie> goods = new ArrayList<>();
        goods.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goods.add(new GoodsBogie("Open", "Coal"));
        goods.add(new GoodsBogie("Box", "Grain"));

        boolean safe = goods.stream()
                .allMatch(g -> !g.type.equals("Cylindrical") || g.cargo.equals("Petroleum"));

        System.out.println("\nUC12 Safety: " + (safe ? "SAFE" : "UNSAFE"));
    }
}