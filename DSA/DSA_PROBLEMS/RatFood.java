import java.util.*; // Import necessary for Scanner if user input is desired

public class RatFood {

    /**
     * Calculates the minimum number of houses to feed all rats.
     *
     * @param r    The number of rats.
     * @param unit The amount of food each rat consumes.
     * @param arr  An array representing the food available in each house.
     * @return The number of houses needed, or -1 if the input array is invalid, or 0 if food is insufficient.
     */
    public static int ratCountHouse(int r, int unit, int[] arr) {
        
        if (arr == null || arr.length == 0) {
            return -1; 
        }

        
        int totalFoodRequired = r * unit;

        // 2. Accumulate food from houses and count them
        int accumulatedFood = 0;
        int housesUsed = 0;

        for (int i = 0; i < arr.length; i++) {
            accumulatedFood += arr[i];
            housesUsed++;

            // Check if accumulated food is sufficient
            if (accumulatedFood >= totalFoodRequired) {
                return housesUsed; // Return the number of houses used
            }
        }

        // 3. If loop finishes without sufficient food, return 0
        return 0; // Not enough food in all houses
    }

    public static void main(String[] args) {
        // Example Input:
        int r = 7; // Number of rats
        int unit = 2; // Food each rat consumes
        int[] arr = {2, 8, 3, 5, 7, 4, 1, 2}; // Food in each house

        // Call the function and print the result
        int result = ratCountHouse(r, unit, arr);
        System.out.println("Number of houses needed: " + result); // Output: 4

        // Another Example: Not enough food
        int r2 = 10;
        int unit2 = 5;
        int[] arr2 = {10, 10, 10};
        int result2 = ratCountHouse(r2, unit2, arr2);
        System.out.println("Number of houses needed: " + result2); // Output: 0
    }
}