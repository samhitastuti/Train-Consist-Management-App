/**
 * Train Consist Management App
 *
 * Use Case 3: Track Unique Bogie IDs (HashSet)
 *
 * Demonstrates enforcing uniqueness using Set (HashSet)
 * and preventing duplicate bogie IDs.
 *
 * @author Samhita
 * @version 3.0
 */

import java.util.*;

// 🔹 Main Class
public class Main {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("   Train Consist Management App - UC3");
        System.out.println("==========================================\n");

        // 🔹 Create HashSet for Bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // 🔹 ADD bogie IDs (with duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("Bogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);

        // 🔹 Check existence
        boolean exists = bogieIds.contains("BG101");
        System.out.println("\nDoes BG101 exist? " + exists);

        System.out.println("\nTotal unique bogies: " + bogieIds.size());

        System.out.println("\nSystem running...\n");
    }
}