package dsa_recursion;

public class N_naturalSum {

    public static int sum(int n) {
        if (n == 0) {
            return 0; // Base case: sum of first 0 natural numbers is 0
        }
        return n + sum(n - 1); // Recursive case: n + sum of first (n-1) natural numbers
    }
    public static void main(String[] args) {
        int n = 5; // Example input
        int result = sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
    
}
