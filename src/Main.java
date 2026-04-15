import java.util.Arrays;

public class Main {

    // 🔍 Binary Search Method
    public static boolean binarySearch(String[] bogies, String key) {

        int low = 0;
        int high = bogies.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = bogies[mid].compareTo(key);

            if (cmp == 0) {
                return true; // Found
            } else if (cmp < 0) {
                low = mid + 1; // Search right
            } else {
                high = mid - 1; // Search left
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        System.out.println("🚆 Train Consist Management System - UC19\n");

        // ✅ Sorted Input
        String[] bogies1 = {"BG101","BG205","BG309","BG412","BG550"};
        System.out.println("Search BG309: " + binarySearch(bogies1, "BG309")); // true
        System.out.println("Search BG999: " + binarySearch(bogies1, "BG999")); // false

        // ✅ First & Last Element
        System.out.println("Search BG101: " + binarySearch(bogies1, "BG101")); // true
        System.out.println("Search BG550: " + binarySearch(bogies1, "BG550")); // true

        // ✅ Single Element
        String[] single = {"BG101"};
        System.out.println("Single Element: " + binarySearch(single, "BG101")); // true

        // ✅ Empty Array
        String[] empty = {};
        System.out.println("Empty Array: " + binarySearch(empty, "BG101")); // false

        // ✅ Unsorted Input → Sort first
        String[] unsorted = {"BG309","BG101","BG550","BG205","BG412"};
        Arrays.sort(unsorted);
        System.out.println("Unsorted handled (BG205): " + binarySearch(unsorted, "BG205")); // true

        System.out.println("\n🚆 Binary Search Completed!");
    }
}