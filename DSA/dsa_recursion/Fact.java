package dsa_recursion;

public class Fact {

    // Recursive method to calculate factorial
    public static int fact(int n){
        if (n==0 || n==1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n*(fact(n-1));
    }
    public static void main(String[] args) {
        int n = 5;
        int result = fact(n);
        System.out.println("Factorial of " + n + " is: " + result);
        
    }
    
}
