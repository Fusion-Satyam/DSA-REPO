package dsa_recursion;

public class OptimizedPower {
    
    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1; // Base case: x^0 = 1
        }
        
        int halfPower = optimizedPower(x, n / 2)*optimizedPower(x, n / 2); // Recursive case

        // If n is even, use the property (x^n) = (x^(n/2))^2
        if (n % 2 != 0) {
            halfPower = x * halfPower; // If n is odd, we need to multiply by x once more
            
        } 
        return halfPower; // Return the computed power
    }
    public static void main(String[] args) {
        int x = 2; // Base
        int n = 10; // Exponent
        int result = optimizedPower(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
        
    }
}
