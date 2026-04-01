import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Banner
        System.out.println("===================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("===================================\n");

        // Create empty list (train consist)
        List<String> trainConsist = new ArrayList<>();

        // Initial Output
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);

        System.out.println("\nSystem ready for operations...");
    }
}
