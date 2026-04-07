/**
 * Train Consist Management App
 *
 * Use Case 2: Add Passenger Bogies (ArrayList Operations)
 *
 * Demonstrates dynamic insertion, deletion, and search
 * operations using ArrayList.
 *
 * @author Samhita
 * @version 2.0
 */

import java.util.*;

// 🔹 Main Class
public class Main {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("   Train Consist Management App - UC2");
        System.out.println("==========================================\n");

        // 🔹 Create Passenger Bogie List
        List<String> passengerBogies = new ArrayList<>();

        // 🔹 ADD bogies (CREATE)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger bogies added:");
        System.out.println(passengerBogies);

        // 🔹 REMOVE bogie (DELETE)
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // 🔹 CHECK existence (READ)
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes Sleeper bogie exist? " + exists);

        // 🔹 FINAL STATE
        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);

        System.out.println("\nSystem running...\n");
    }
}