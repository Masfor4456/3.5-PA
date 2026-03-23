/**
 * Name: Mason Ford
 * Date: 2026-03-21
 * Assignment: SDC230 Performance Assessment - Calculations & Unique Numbers
 * Description: This program stores 10 integers in an array, extracts unique values
 * into an ArrayList, and calculates count, sum, and average for both collections.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mason Ford - Week 3 PA Calculations & Unique Numbers\n");

        int[] numbers = new int[10];
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        // Get 10 integers from user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter an integer value: ");
            numbers[i] = scanner.nextInt();
        }

        // Store unique values in ArrayList
        for (int num : numbers) {
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
            }
        }

        // Calculations for array
        int sumArray = sum(numbers);
        double avgArray = (double) sumArray / numbers.length;

        // Calculations for ArrayList
        int sumList = sum(uniqueNumbers);
        double avgList = (double) sumList / uniqueNumbers.size();

        // Output results for array
        System.out.println("\nThe count of integers entered is: " + numbers.length);
        System.out.println("The sum of integers entered is: " + sumArray);
        System.out.println("The average of integers entered is: " + avgArray);

        // Output results for unique values
        System.out.println("\nThe count of unique integers entered is: " + uniqueNumbers.size());
        System.out.println("The sum of unique integers entered is: " + sumList);
        System.out.println("The average of unique integers entered is: " + avgList);

        scanner.close();
    }

    // Method for array sum
    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    // Overloaded method for ArrayList sum
    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        for (int num : list) {
            total += num;
        }
        return total;
    }
}