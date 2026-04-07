/**
 * Train Consist Management App
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Demonstrates application startup, dynamic initialization
 * using ArrayList, and basic console output.
 *
 * @author Samhita
 * @version 1.0
 */

import java.util.*;

// 🔹 Main Class
public class Main {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("==========================================");
        System.out.println("   Train Consist Management App");
        System.out.println("==========================================\n");

        // 🔹 Initialize Train Consist (Empty List)
        List<String> trainConsist = new ArrayList<>();

        // 🔹 Display Initial Bogie Count
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        System.out.println("\nSystem ready.\n");
    }
}