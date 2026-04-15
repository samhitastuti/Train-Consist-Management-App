public class Main {

    // 🔍 Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String key) {
        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(key)) {
                return true; // Early termination
            }
        }
        return false; // Not found
    }

    public static void main(String[] args) {

        System.out.println("🚆 Train Consist Management System - UC18\n");

        // Sample bogie IDs
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        // ✅ Test Cases
        System.out.println("Search BG309: " + linearSearch(bogies, "BG309")); // true
        System.out.println("Search BG999: " + linearSearch(bogies, "BG999")); // false
        System.out.println("Search BG101: " + linearSearch(bogies, "BG101")); // true
        System.out.println("Search BG550: " + linearSearch(bogies, "BG550")); // true

        // Single element case
        String[] single = {"BG101"};
        System.out.println("Search in single array: " + linearSearch(single, "BG101")); // true

        System.out.println("\n🚆 Linear Search Completed!");
    }
}