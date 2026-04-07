/**
 * Train Consist Management App
 *
 * Use Case 4: Maintain Ordered Train Consist (LinkedList)
 *
 * Demonstrates ordered storage and efficient insertion/deletion
 * using LinkedList to model real train chaining.
 *
 * @author Samhita
 * @version 4.0
 */

import java.util.*;

// 🔹 Main Class
public class Main {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("   Train Consist Management App - UC4");
        System.out.println("==========================================\n");

        // 🔹 Create LinkedList for Train Consist
        LinkedList<String> train = new LinkedList<>();

        // 🔹 Add bogies (ORDER MATTERS)
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // 🔹 Insert Pantry Car at position 2 (index = 2)
        train.add(2, "Pantry");

        System.out.println("\nAfter adding Pantry at position 2:");
        System.out.println(train);

        // 🔹 Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(train);

        // 🔹 Final Ordered Train
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);

        System.out.println("\nSystem running...\n");
    }
}