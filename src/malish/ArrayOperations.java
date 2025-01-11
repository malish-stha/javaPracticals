package malish;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        System.out.println("Name: Malish Shrestha\nRollno: 1015\n");

        int marks[] = {88, 77, 34, 56, 78, 21, 82};

        displayArray(marks);
        displayArrayInReverse(marks);
        displayMaximum(marks);
        displayMinimum(marks);
        displaySum(marks);
        displayAverage(marks);
        displayElementsLessThan(marks, 50);
        sortArray(marks);
    }

    // a. Display the array elements
    public static void displayArray(int[] arr) {
        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

    // b. Display the array elements in reverse
    public static void displayArrayInReverse(int[] arr) {
        System.out.println("Array elements in reverse:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    // c. Display the maximum element
    public static void displayMaximum(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
        System.out.println("Maximum element: " + max + "\n");
    }

    // d. Display the minimum element
    public static void displayMinimum(int[] arr) {
        int min = Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);
        System.out.println("Minimum element: " + min + "\n");
    }

    // e. Display the sum of all integers in the array
    public static void displaySum(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum of all elements: " + sum + "\n");
    }

    // f. Display the average of the array elements
    public static void displayAverage(int[] arr) {
        double average = Arrays.stream(arr).average().orElse(0.0);
        System.out.println("Average of elements: " + average + "\n");
    }

    // g. Display elements less than a given limit
    public static void displayElementsLessThan(int[] arr, int limit) {
        System.out.println("Elements less than " + limit + ":");
        for (int num : arr) {
            if (num < limit) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");
    }

    // h. Sort the array in ascending order
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Array elements in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
