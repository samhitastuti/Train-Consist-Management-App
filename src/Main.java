public class Main {

    // 🔁 Bubble Sort Method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop → number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop → compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if out of order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 🖨️ Utility to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("🚆 Train Consist Management System - UC16\n");

        // ✅ Test Case 1: Basic Sorting
        int[] capacities1 = {72, 56, 24, 70, 60};
        System.out.print("Before Sorting: ");
        printArray(capacities1);

        bubbleSort(capacities1);

        System.out.print("After Sorting:  ");
        printArray(capacities1);
        System.out.println();

        // ✅ Test Case 2: Already Sorted
        int[] capacities2 = {24, 56, 60, 70, 72};
        bubbleSort(capacities2);
        System.out.print("Already Sorted: ");
        printArray(capacities2);
        System.out.println();

        // ✅ Test Case 3: Duplicates
        int[] capacities3 = {72, 56, 56, 24};
        bubbleSort(capacities3);
        System.out.print("With Duplicates: ");
        printArray(capacities3);
        System.out.println();

        // ✅ Test Case 4: Single Element
        int[] capacities4 = {50};
        bubbleSort(capacities4);
        System.out.print("Single Element: ");
        printArray(capacities4);
        System.out.println();

        // ✅ Test Case 5: All Equal
        int[] capacities5 = {40, 40, 40};
        bubbleSort(capacities5);
        System.out.print("All Equal: ");
        printArray(capacities5);
        System.out.println();

        System.out.println("🚆 Sorting completed using Bubble Sort!");
    }
}