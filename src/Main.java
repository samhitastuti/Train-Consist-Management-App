public class Main {

    // 🔍 Search with Fail-Fast Validation
    public static boolean searchBogie(String[] bogies, String key) {

        // 🚨 Fail-Fast Check
        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("No bogies available in the train. Cannot perform search.");
        }

        // 🔍 Linear Search (can reuse UC18 logic)
        for (int i = 0; i < bogies.length; i++) {
            if (bogies[i].equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("🚆 Train Consist Management System - UC20\n");

        // ❌ Test Case 1: Empty Array → Exception
        try {
            String[] empty = {};
            System.out.println("Searching in empty array...");
            searchBogie(empty, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("❌ Exception: " + e.getMessage());
        }

        System.out.println();

        // ✅ Test Case 2: Data exists → Search allowed
        String[] bogies = {"BG101","BG205","BG309"};

        System.out.println("Search BG205: " + searchBogie(bogies, "BG205")); // true
        System.out.println("Search BG999: " + searchBogie(bogies, "BG999")); // false

        // ✅ Test Case 3: Single Element
        String[] single = {"BG101"};
        System.out.println("Single Element: " + searchBogie(single, "BG101")); // true

        System.out.println("\n🚆 Search operation completed with validation!");
    }
}